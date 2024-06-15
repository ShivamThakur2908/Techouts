package corejavathree;

public class SumOfOddNumber {

	public static void main(String[] args) {
		SumOfOddNumber sumOfOddNumber=new SumOfOddNumber();
		sumOfOddNumber.sumOfOddNumber();

	}
	public  void sumOfOddNumber()
	{
		int sum = 0;
		int sl =1;
		for(int i = 1; sl <= 100; i++)
		{
			if(i%2 == 0)
			{
				continue;
			}
			else
			{
				sum += i;
				sl++;
			}
		}
		System.out.println("Sum of first 100 odd number is: "+sum);
	}

}
