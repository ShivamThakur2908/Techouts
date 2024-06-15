package corejavafive;

public class MainClassForRunTimePolymorphism {

	public static void getAttendence(College c)
	{
		c.dailyAttendence();
	}
	
	public static void main(String[] args) {
		getAttendence(new Teacher());
		System.out.println();
		getAttendence(new Student());

	}

}
