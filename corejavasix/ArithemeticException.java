package corejavasix;

import java.util.Scanner;

public class ArithemeticException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vlaue of a:");
		int a = sc.nextInt();
		System.out.println("Enter the vlaue of b:");
		int b = sc.nextInt();
		
		try 
		{
			System.out.println("Division of a and b: "+(a/b)); // when we try to divide the number by Zero JVM throw Arithmetic Exception.
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Enter valid value of b!!!");
		}
	}

}
