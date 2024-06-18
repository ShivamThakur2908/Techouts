package corecavaseven;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> tM = new TreeMap<Integer, String>();
		tM.put(1, "this");
		tM.put(2, "is");
		tM.put(3, "a");
		tM.put(4, "list");
		System.out.println(tM);
		// isEmpty() is used to check whether TreeMap is empty or not.
		System.out.println(tM.isEmpty());
		// remove(key) is used to remove the element form the TreeMap.
		tM.remove(1);
		System.out.println(tM);
	}

}
