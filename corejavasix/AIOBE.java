package corejavasix;

public class AIOBE {//ArrayIndexOutBound

	public static void main(String[] args) {
		int[] a = {112,34,23,56,345};
		try 
		{
			System.out.println(a[9]); // When we try to access the index value which is not present in the Array object.
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Index value should not be greater than "+(a.length-1)+" or less than 0");
		}

	}

}
