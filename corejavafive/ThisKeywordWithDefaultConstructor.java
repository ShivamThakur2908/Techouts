package corejavafive;

public class ThisKeywordWithDefaultConstructor {
	public ThisKeywordWithDefaultConstructor()
	{
		System.out.println("This the Default Constructor");
	}
	public ThisKeywordWithDefaultConstructor(int a)
	{
		this();
		System.out.println("Number with addition of 5: "+(a+5));
	}
	public static void main(String[] args) {
		ThisKeywordWithDefaultConstructor obj = new ThisKeywordWithDefaultConstructor(10);
		
	}
}
