package corejavathree;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
//		System.out.println(str);
		if(isPalindrome(str))

		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
//		System.out.println(str);
	}
	public static boolean isPalindrome(String str)
	{
		boolean isMatch = false;
		for(int i = str.length()-1, j = 0; i>=0 && j <= str.length()-1; i-- , j++ )
		{
			if(str.charAt(i) == str.charAt(j))
			{
				isMatch = true;
			}
			else
			{
				isMatch = false;
				break;
			}
		}
		if(isMatch)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
