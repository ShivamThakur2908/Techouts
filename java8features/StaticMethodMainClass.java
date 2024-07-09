package java8features;

public class StaticMethodMainClass {

	public static void main(String[] args) {
		StaticMethodInterface s1 = new StaticMethodInterface() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		StaticMethodInterface.display();
		// We cannot override the static method of interface. Even though we tried to override the static method of
		// interface the class we create a new method of same name as static method of interface we not be visible to class.

	}

}
