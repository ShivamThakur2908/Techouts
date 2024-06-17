package corejavasix;

public class SIOBE {//String Index Out Of Bound 

	public static void main(String[] args) {
		String str = "Shivam";
		try 
		{
			System.out.println(str.charAt(10)); // When we try to access the index value which is not present in the String object.
		} 
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("Index value should not be greater than "+(str.length()-1)+" or less than 0");
		}

	}

}
