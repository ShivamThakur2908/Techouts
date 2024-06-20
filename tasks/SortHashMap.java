package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMap {

	public static void main(String[] args) {
		// Creating HashMap
		HashMap<String, Integer> hM = new HashMap<String, Integer>();
		hM.put("Five", 5);
		hM.put("Four", 4);
		hM.put("Nine", 9);
		hM.put("Seven", 7);
		hM.put("Two", 2);
		hM.put("Eight", 8);
		hM.put("One", 1);
		hM.put("Three", 3);
		hM.put("Six", 6);
		hM.put("Zero", 0);
		// Printing HashMap.
		System.out.println("Unsorted HashMap\n"+hM);
		// Convert the HashMap into set using Entry set method.
		Set<Entry<String, Integer>> set = hM.entrySet();
		// Printing the set
		System.out.println("HashMap To Set\n"+set);
		// Converting it into ArrayList
		ArrayList<Entry<String, Integer>> list = new ArrayList<>(set);
		// Printing list.
		System.out.println("Set to ArrayList\n"+list);
		// Sorting the ArrayList using Collections.sort()
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue() - o2.getValue();
			}
			
		});
		System.out.println("Sorted ArrayList\n"+list);
		// converting List into HashMap.
		LinkedHashMap<String, Integer> hM1 = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry1 : list) {
			hM1.put(entry1.getKey(), entry1.getValue());
		}
		System.out.println("Sorted HashMap\n"+hM1);
	}

}
