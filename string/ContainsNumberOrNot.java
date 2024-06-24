package string;

import java.lang.*;
import java.util.Scanner;

public class ContainsNumberOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		System.out.println("Number present in the string is: ");
		for(int i=0; i<=str.length()-1; i++)
		{
			
			if(Character.isDigit(str.charAt(i)))
			{
				System.out.println(Character.getNumericValue(str.charAt(i)));
			}
		}

	}

}
