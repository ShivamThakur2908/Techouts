package corejavafive;

public class ThisKeyWordWithInstanceAndLocalVariable {
	int a;
	int b;
	public ThisKeyWordWithInstanceAndLocalVariable(int a, int b) {
		a = a; // Here JVM will get confuse that which is local variable and instance variable.
		// To avoid above confusion we use this keyword to distinguish the instance and local variable.
		this.b = b;
	}
	public void display()
	{
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		ThisKeyWordWithInstanceAndLocalVariable obj = new ThisKeyWordWithInstanceAndLocalVariable(3,8);
		obj.display();
	}
}
