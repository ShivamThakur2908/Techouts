package java8features;

public class LambdaExample {

	public static void main(String[] args) {
		MyInterface myInterface = (a,b) -> a+b;
		
		System.out.println(myInterface.add(10,30));
		MyInterface myInterface2 = (a,b) -> {
			if(a>b)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		};
		System.out.println(myInterface2.add(650,30));
	}

}
