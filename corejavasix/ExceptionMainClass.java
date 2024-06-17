package corejavasix;

import java.util.Scanner;

public class ExceptionMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		ExceptionHandling eh = new ExceptionHandling();
		try {
			System.out.println(eh.divide(a, b));
		} catch (ArithmeticException e) {
			System.out.println("Invalid input of b value.");
		}

	}

}
