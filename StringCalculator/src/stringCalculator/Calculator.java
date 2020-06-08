package stringCalculator;

public class Calculator {
	
	public static int add(String num)
	{
		if(num.length()==0)
		{
			return 0;
		}
		else if (num.contains(","))
		{
			String [] oneAndTwoNumber= num.split(",");
			int number1=Integer.parseInt(oneAndTwoNumber[0]);
			int number2=Integer.parseInt(oneAndTwoNumber[1]);
			return number1+number2;
		}
		else
		{
			return Integer.parseInt(num);
		}
	}
	
	public static void main(String args[])
	{
		System.out.println(add(""));
		System.out.println(add("5"));
		System.out.println(add("2,4"));
	}

}
