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
			int sum=0;
			for(String str:oneAndTwoNumber)
			{
				sum=sum+convertToInt(str);
			}
			
			return sum;
		}
		else
		{
			return Integer.parseInt(num);
		}
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
	}

}
