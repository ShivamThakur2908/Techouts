package corejavafive;

public class ThisKeyWordWithObjectReference {
	public void displayObject()
	{
		System.out.println(this);
	}
	public static void main(String[] args) {
		ThisKeyWordWithObjectReference obj = new ThisKeyWordWithObjectReference();
		System.out.println(obj);
		
		ThisKeyWordWithObjectReference obj1 = new ThisKeyWordWithObjectReference();
		System.out.println();
		System.out.println(obj1);
		System.out.println();
		obj.displayObject();
		System.out.println();
		obj1.displayObject();
	}
}
