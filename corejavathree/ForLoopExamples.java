package corejavathree;

import java.util.Scanner;

public class ForLoopExamples {
	public static void main(String[] args) {
		System.out.println("For Loop Example...");
//		simpleForLoop();
		
//		reverseForLoop();
		
//		oddAndEvenUsingForLoop();
		
//		oddAndEvenInAGivenRange();
		
//		sumOfNumber();
//		productOfNumber();
		
//		sumOfEachDigit();
		
//		productOfEachDigit();
		
//		reverseOfNumber();
		
		reverseOfString();
		
	}
	
	
//	public static void simpleForLoop()
//	{
//		System.out.print("Simple For Loop ");
//		Scanner sc = new Scanner(System.in);
//		int startValue = sc.nextInt();
//		int endValue = sc.nextInt();
//		// printing value form startValue to ensValue
//		for(int i = startValue; i<= endValue; i++ )
//		{
//			System.out.print(i+" ");
//		}
//	}
//	
//	public static void reverseForLoop()
//	{
//		System.out.print("Reverse For Loop ");
//		Scanner sc = new Scanner(System.in);
//		int startValue = sc.nextInt();
//		int endValue = sc.nextInt();
//		// printing value form endValue to startValue
//		for(int i = endValue; i>= startValue; i-- )
//		{
//			System.out.print(i+" ");
//		}
//	}
	
//	public static void oddAndEvenUsingForLoop()
//	{
//		System.out.print("Odd And Even Using For Loop ");
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		// printing odd and even values form 0 to number
//		for(int i = 1; i<= number; i++ )
//		{
//			if(i%2 == 0)
//			{
//				System.out.println("Even Number: "+i);
//			}
//			else
//			{
//				System.out.println("Odd Number: "+i);
//			}
//			
//		}
//	}
	
//	public static void oddAndEvenInAGivenRange()
//	{
//		System.out.print("Odd And Even in given range ");
//		Scanner sc = new Scanner(System.in);
//		int startValue= sc.nextInt();
//		int endValue= sc.nextInt();
//		// printing odd and even values form startValue to ensValue
//		for(int i = startValue; i<= endValue; i++ )
//		{
//			if(i%2 == 0)
//			{
//				System.out.println("Even Number: "+i);
//			}
//			else
//			{
//				System.out.println("Odd Number: "+i);
//			}
//			
//		}
//	}
	
	
//	public static void sumOfNumber()
//	{
//		System.out.print("Sum of Number in range ");
//		Scanner sc = new Scanner(System.in);
//		int startValue = sc.nextInt();
//		int endValue = sc.nextInt();
//		// Adding each value form endValue to startValue\
//		int sum = 0;
//		for(int i = endValue; i>= startValue; i-- )
//		{
//			sum += i;
//		}
//		System.out.println("Sum of number: " +sum);
//	}
	
	
//	public static void productOfNumber()
//	{
//		System.out.print("Product of Number in range ");
//		Scanner sc = new Scanner(System.in);
//		int startValue = sc.nextInt();
//		int endValue = sc.nextInt();
//		// Multiplying each value form endValue to startValue
//		int prod = 1;
//		for(int i = endValue; i>= startValue; i-- )
//		{
//			prod *= i;
//		}
//		System.out.println("Sum of number: " +prod);
//	}
	
//	public static void sumOfEachDigit()
//	{
//		System.out.print("Sum of each digit ");
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		// Adding each digit of number.
//		int sum = 0;
//		for(;;)
//		{
//			if(number != 0)
//			{
//				sum += (number%10);
//				number /= 10;
//			}
//			else
//			{
//				break;
//			}
//		}
//		System.out.println("Sum of each digit of number is:"+sum);
//	}
	
	
//	public static void productOfEachDigit()
//	{
//		System.out.print("Product of digit ");
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		// Adding each digit of number.
//		int prod = 1;
//		for(;;)
//		{
//			if(number != 0)
//			{
//				prod *= (number%10);
//				number /= 10;
//			}
//			else
//			{
//				break;
//			}
//		}
//		System.out.println("Sum of each digit of number is:"+prod);
//	}
	
//	public static void reverseOfNumber()
//	{
//		System.out.print("Reverse of the number ");
//		Scanner sc = new Scanner(System.in);
//		int rev = 0;
//		int number = sc.nextInt();
//		for(;;)
//		{
//			if(number != 0)
//				{
//					rev = rev*10 + (number%10);
//					number /= 10;
//				}
//				else
//				{
//					break;
//				}
//		}
//		System.out.println("Reverse of number is: "+rev);
//	}
	
	
	public static void reverseOfString()
	{
		System.out.print("Reverse of the string ");
		Scanner sc = new Scanner(System.in);
		String rev = "";
		String str = sc.nextLine();
		for(int i = str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse of number is: "+rev);
	}
	
}


/*
 * ******************************************
 *For Loop Syntax
 *for(statement 1; statement 2; statement 3)
 *{
 *	set of instruction	
 *} 
 ********************************************
 */
 