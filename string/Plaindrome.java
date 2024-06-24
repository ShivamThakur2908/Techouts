package string;

import java.util.Scanner;

public class Plaindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		if(isPalindrome(str))
		{
			System.out.println("The given String is Palindrome");
		}
		else
		{
			System.out.println("The given String is not Palindrome");
		}

	}
	public static boolean isPalindrome(String str)
	{
		String str1 = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1 += str.charAt(i);
		}
		if(str.equalsIgnoreCase(str1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
