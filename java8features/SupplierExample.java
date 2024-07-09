package java8features;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Double> randomNumber = () -> Math.random()*10000;
		
		for(int i = 0; i<= 10; i++)
		{
			System.out.println(randomNumber.get());
		}
		// Supplier is a functional interface that will not take the parameter as input but only return.
	}

}
