package corejavafour;

public class ConstructorExample {
	
	 int age;
	 String name;
	// Default constructor
	public ConstructorExample() {
		System.out.println("This is a default constructor");
		age = 22;
		name = "Shivam Thakur";
		System.out.println("age: "+age+"\nname: "+name);
	}
	
	//Parametrized constructor
	public ConstructorExample(int a, String b)
	{
		age = a;
		name = b;
		System.out.println();
		System.out.println("This is a Parameterized constructor");
		System.out.println("age: "+age+"\nname: "+name);
	}
	public static void main(String[] args) {
		ConstructorExample constructorExample = new ConstructorExample();
		ConstructorExample constructorExample1 = new ConstructorExample(22,"Shivam Thakur");
	}

}
