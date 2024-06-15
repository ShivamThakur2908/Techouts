package corejavafive;

public class ThisKeyWordWithParameterizedConstructor {
	public ThisKeyWordWithParameterizedConstructor()
	{
		this(20);
		System.out.println("This is default Constructor");
	}
	public ThisKeyWordWithParameterizedConstructor(int a)
	{
		System.out.println("Number with adition of 50: "+(a+50));
	}
	public static void main(String[] args) {
		ThisKeyWordWithParameterizedConstructor obj = new ThisKeyWordWithParameterizedConstructor();
	}
}
