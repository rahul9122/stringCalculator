package stringCalculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestCalculator {
	
	@Test
	public void emptyStringReturn0()
	{
		assertEquals(0,Calculator.add(""));
	}
	
	@Test
	public void numberOfLengthOne()
	{
		assertEquals(1, Calculator.add("1"));
	}
	
	@Test
	public void sumOfNumberSeperatedByComma()
	{
		assertEquals(5, Calculator.add("2,3"));
	}
	
	@Test
	public void addUnknownAmountOfNumber()
	{
		assertEquals(15,Calculator.add("1,2,3,4,5"));
	}
	@Test
	public void handleNewLinebetweenNumber()
	{
		assertEquals(10,Calculator.add("1\n2\n3\n4"));
	}
	
	@Test
	public void customDeliminator()
	{
		assertEquals(3,Calculator.add("//;\n1;2"));
	}
	
	@Test
	public void negativeNumberException()
	{
		try
		{
			Calculator.add("-2,-4,3");
			fail("Exception is expected");
		}
		catch(RuntimeException e)
		{
			assertEquals("Negative number not allowed:[-2, -4]",e.getMessage());	
		}
	}

	@Test
	public void ignoreNumberGreaterThan1000()
	{
		assertEquals(6,Calculator.add("1,2,3,1000,2000,3000"));
	}
}
