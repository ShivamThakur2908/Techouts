package assessment;

public class MethodExample {

	public static void main(String[] args) {
		// hashCode(), equals(), toString(), .equals() and .parseInt() methods.
		
		
		// Creating object of ReferenceOne 
		ReferenceOne rO = new ReferenceOne("Shivam", 2);
		ReferenceOne rO1 = new ReferenceOne("Shivam", 2);
		
		// print address of both object
		System.out.println("Object one Address: "+rO.toString());
		System.out.println("Object Two Address: "+rO1.toString());
		System.out.println();
		
		//public boolean equals(object obj)
		// Let's create one more obj of ReferenceOne
		ReferenceOne rO2 = new ReferenceOne(10, 20);
		// Comparing all ReferenceOne object
		System.out.println(rO.equals(rO1));
		System.out.println(rO.equals(rO2));
		System.out.println();
		
		// print address of both object  using hashCode()
		System.out.println("Object one Address: "+rO.hashCode());
		System.out.println("Object Two Address: "+rO1.hashCode());
		System.out.println();
		
		// comparing objects
		if(rO.equals(rO1))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		System.out.println();
		
		//toString Method
		ReferenceTwo rT = new ReferenceTwo("Shivam", 22);
		System.out.println(rT);
		// the value in the object will get printed as toString method is overridden the ReferenceTwo class
		System.out.println();
		
		// Creating String objects
		String str = "Shivam";
		String str1 = "Shivam";
		String str2 = new String("Shivam");
		// comparing String variable using == and .equals()
		if(str == str1)
		{
			System.out.println(true);
			// printing true as String object are created by using String Literal,
			// as both the object is pointing to the same data.
		}
		System.out.println();
		
		// Comparing String literal and new keyword object using ==
		if(str1 == str2)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
			// printing false as both the variable pointing to different object.
			// equals operator compare the reference of the objects
		}
		System.out.println();
		
		// Comparing with .equals()
		if(str.equals(str1) && str1.equals(str2))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		System.out.println();
		
		// Preforming parseInt method.
		String str0 = "1234";
		// This is an string object of non primitive datatype
		// to convert it into primitive we use parse method
		int a = Integer.parseInt(str0); // this will convert String into int.
		System.out.println("String: "+str0+"\nIntrger: "+a);
	}

}
