package java8features;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> pred = (a) -> a>100;
		System.out.println(pred.test(10));
		// predicate is a functional interface. It will take one input and return boolean output.	
	}

}
