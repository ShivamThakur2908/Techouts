package corejavafour;

public class SuperSubClass extends SuperExample {
	String name = "Thakur";
	public SuperSubClass()
	{
		super();
		System.out.println(super.name+" "+name);
		super.printAge();
	}
	
}
