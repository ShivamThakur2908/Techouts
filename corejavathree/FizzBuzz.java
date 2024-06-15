package corejavathree;

public class FizzBuzz {

	public static void main(String[] args) {
		printFizzBuzz();

	}
	public static void printFizzBuzz()
	{
		for(int i = 1; i <= 50; i++)
		{
			if(i%7 == 0)
			{
				continue;
			}
			else if(i%3 == 0 && i%5 == 0)
			{
				System.out.println("FizzBuzz "+i);
			}
			else if(i%5 == 0)
			{
				System.out.println("Buzz "+i);
			}
			else if(i%3 == 0)
			{
				System.out.println("Fizz "+i);
			}
		}
	}

}
