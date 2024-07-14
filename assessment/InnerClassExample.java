package assessment;

import java.util.Scanner;

public class InnerClassExample {

	public static void main(String[] args) {
		// impleminting MyInterface add() method using anonymous inner class.
		// creating instance of MyInterface
		
		MyInterface myInterface = new MyInterface() {
			
			@Override
			public int add() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter First value: ");
				int a = sc.nextInt();
				System.out.println("Enter Second value: ");
				int b = sc.nextInt();
				
				return a+b;
			}
		};
		System.out.println("Addition of first and second value is: "+myInterface.add());

	}

}
