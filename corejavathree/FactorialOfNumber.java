package corejavathree;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		FactorialOfNumber obj = new FactorialOfNumber();
		obj.findFactorial(num);

	}
	public void findFactorial(int number)
	{
		int fact = 1;
		for(int i =1; i <= number; i++)
		{
			if(i%2 == 0)
			{
				continue;
			}
			else
			{
				fact = fact * i;
			}
		}
		System.out.println("Factorial of number without multiplication of even number: "+fact);
	}

}
