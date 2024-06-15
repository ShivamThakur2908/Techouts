package corejavafive;

public class MainClassForCompileTimePolymorphism {

	public static void main(String[] args) {
		System.out.println(Addition.add(10,46));
		System.out.println(Addition.add(75,25.8));
		System.out.println(Addition.add('A','B'));
		System.out.println(Addition.add('A',1));
		System.out.println(Addition.add("Shivam ","Thakur" ));
	}

}
