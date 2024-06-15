package corejavafive;

public class ThisKeyToCallTheMethodOfOwnClass {
	public void view()
	{
		System.out.println("First Method");
	}
	public void display()
	{
		this.view();
		System.out.println("Second Method");
	}
	public static void main(String[] args) {
		ThisKeyToCallTheMethodOfOwnClass obj = new ThisKeyToCallTheMethodOfOwnClass();
		obj.display();
	}
}
