package corejavasix;

public class NLPE {//Null Pointer

	public static void main(String[] args) {
		String str = null;
		try 
		{
			System.out.println(str.charAt(0));
		} 
		catch (NullPointerException e) 
		{
			System.out.println("The given String object is null");
		}
		
	}

}
