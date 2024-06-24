package string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContainPatternOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher match = p.matcher(str);
		boolean check = match.find();
		if(check)
		{
			System.out.println("Special Character Found");
		}
		else
		{
			System.out.println("Special Character Not Found");
		}

	}

}
