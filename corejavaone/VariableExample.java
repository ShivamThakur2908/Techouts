package corejavaone;

public class VariableExample {

	public int a = 100; // instance variable
	public static int b = 200; // static variable
	public static void main(String[] args) {
		int c = 10; // local variable
		VariableExample obj = new VariableExample(); // creating object to access the instance variable or non static variable.
		System.out.println("Instance variable : "+obj.a+"\nStatic variable : "+b+"\nLocal Variable : "+c);
	}

}
