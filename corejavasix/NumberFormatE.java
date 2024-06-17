package corejavasix;

public class NumberFormatE {

	public static void main(String[] args) {
		String a = "Shivam";
		
		try {
			int b = Integer.parseInt(a);
			System.out.println(b);
		} catch (NumberFormatException e) {
			System.out.println("The given string cannot be converted into integer.");
		}

	}

}
