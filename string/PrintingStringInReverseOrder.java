package string;

public class PrintingStringInReverseOrder {

	public static void main(String[] args) {
		String str = "Shivam";
		for(int i = str.length()-1; i>=0 ; i--)
		{
			System.out.println(str.charAt(i));
		}
	}

}
