package java8features;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<String, Integer> func = (a) -> Integer.parseInt(a);
		System.out.println(func.apply("1000"));
		
		
		Function<Integer, Boolean> func1 = (a) -> a%2 == 0;
		if(func1.apply(5))
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		// Function is a functional interface. Which take one generic type input and return generic type output.
	}

}
