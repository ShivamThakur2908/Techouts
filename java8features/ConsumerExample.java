package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("Shivam");
		name.add("Sushma");
		name.add("Suraj");
		name.add("Abhimanyu");
		name.add("Asha");
		name.add("Mohan");
		name.add("Kailash");
		
		Consumer<String> printName = name1 -> System.out.println(name1);
//		name.forEach(printName);

	}

}
