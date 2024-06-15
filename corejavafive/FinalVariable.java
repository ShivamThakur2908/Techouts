package corejavafive;

public class FinalVariable {
	public static void main(String[] args) {
		final int a = 10;
//		a = 20; /// Not possible as a is a final variable.
		System.out.println(a);
	}
}
