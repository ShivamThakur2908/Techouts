package corejavafive;

public class MainClassForPublic
{
	public static void main(String[] args) {
		AccessModifier obj = new AccessModifier();
		obj.printHi();
		obj.printHello();
//		obj.printHey(); // This line will show error as this method printHey is private method and cannot be used in the other class.
		
		obj.printName();
	}
}
