package corejavatwo;

public class InstanceOperator {

	public static void main()
	{
		
	}
	public static void main(String[] args) {
		main();
		Boy obj1 = new Boy();
        Boy obj2 = new Son();

        // As obj is of type person, it is not an
        // instance of Boy or interface
        System.out.println("obj1 instanceof Boy: "
                           + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof Son: "
                           + (obj1 instanceof Son));
        System.out.println("obj1 instanceof Father: "
                           + (obj1 instanceof Father));

        // Since obj2 is of type boy,
        // whose parent class is person
        // and it implements the interface Myinterface
        // it is instance of all of these classes
        System.out.println("obj2 instanceof Boy: "
                           + (obj2 instanceof Boy));
        System.out.println("obj2 instanceof Son: "
                           + (obj2 instanceof Son));
        System.out.println("obj2 instanceof Father: "
                           + (obj2 instanceof Father));
    }
}

class Boy {
}

class Son extends Boy implements Father {
}

interface Father {
}




