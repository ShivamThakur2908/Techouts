package corejavafive;

public class MainClassForEncapsultion {

	public static void main(String[] args) {
		EncapsulationExample obj = new EncapsulationExample();
		obj.setAge(22);
		obj.setName("Shivam");
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}
