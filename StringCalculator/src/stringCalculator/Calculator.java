package stringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	
	public static int add(String num)
	{
		if(num.length()==0)
		{
			return 0;
		}
		else 
		{
			String [] oneAndTwoNumber= tokenize(num);
			int sum=0;
			for(String str:oneAndTwoNumber)
			{
				sum=sum+convertToInt(str);
			}
			
			return sum;
		}
		
	}
	public static String[] tokenize(String num)
	{
		if(num.startsWith("//"))
		{
			return customDeliminater(num);
		}
		else
		{
			return num.split(",|\n");
		}
	}
	public static String[] customDeliminater(String num)
	{
		Matcher match = Pattern.compile("//(.)\n(.*)").matcher(num);
		match.matches();
		String customdeliminater=match.group(1);
		String arrayOfNumber=match.group(2);
		return arrayOfNumber.split(customdeliminater);
	}
	
	public static int convertToInt(String str)
	{
		return Integer.parseInt(str);
	}
	
	public static void main(String args[])
	{
		System.out.println(add(""));
		System.out.println(add("5"));
		System.out.println(add("2,4"));
		System.out.println(add("1,2,3,4,5"));
		System.out.println(add("1\n2\n3\n4\n5"));
		
		System.out.println(add("//;\n1;2"));
	}

}
