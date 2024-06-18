package corecavaseven;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lHM = new LinkedHashMap<Integer, String>();
		lHM.put(1, "Supresh");
		lHM.put(2, "Soham");
		lHM.put(3, "Sahil");
		lHM.put(4, "Pranay");
		lHM.put(5, "Sourabh");
		lHM.put(6, "Tarun");
		System.out.println(lHM);
		// containKey(key) will return true if the key is present in the LinkedHashMap.
		System.out.println(lHM.containsKey(1));
		// remove(key) will remove the particular key with its value
		lHM.remove(5);
		System.out.println(lHM);
		

	}

}
