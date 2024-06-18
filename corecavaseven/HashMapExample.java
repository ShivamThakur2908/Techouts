package corecavaseven;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new  HashMap();
		// HashMap store the element in the form of key value pair.
		// put(key, value) method is use to store the element in the HashMap.
		hm.put(1, "Mohan");
		hm.put(2, "Asha");
		hm.put(3, "Sushma");
		hm.put(4, "Abhimanyu");
		hm.put(5, "Shivam");
		hm.put(6, "Suraj");
		System.out.println(hm);
		// get(key) method is use to get the element form the hashmap.
		System.out.println(hm.get(1));
		// we can also use the for each loop.
		hm.forEach((key,value) ->{
			System.out.println("key "+key+" vlaue "+value);
		});
		// to get the size of the hashmap we use size()
		System.out.println(hm.size());
			
		

	}

}
