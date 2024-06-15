package corejavathree;

import java.awt.print.PrinterAbortException;

public class PrimeNumberSkipNumberDivisibleby5 {
	public static void main(String[] args) {
		PrimeNumberSkipNumberDivisibleby5 obj = new PrimeNumberSkipNumberDivisibleby5();
		obj.printPrimeNumber();
	}
	
	// Printing prime number and skipping prime number which is divisible by 5
	public  void printPrimeNumber()
	{
		for(int i=1; i<=100; i++)
		{
			if(isPrime(i))
			{
				if(i%5 == 0)
				{
					continue;
				}
				else
				{
					System.out.println(i);
				}
			}
		}
	}
	
	// checking weather the number is prime or not.
	public boolean isPrime(int n)
	{
		int count = 0;
		for(int i = 1; i <= n; i++)
		{
			if(n%i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
