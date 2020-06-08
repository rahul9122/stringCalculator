package stringCalculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

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

}
