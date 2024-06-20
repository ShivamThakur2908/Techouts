package tasks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizeHashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hM = new HashMap<String, Integer>();
		hM.put("One", 1);
		hM.put("Two", 2);
		hM.put("Three", 3);
		hM.put("Four", 4);
		hM.put("Five", 5);
		System.out.println(hM);
		
		Map<String, Integer> synchronizeMap = Collections.synchronizedMap(hM);
		System.out.println(synchronizeMap);
		
		 synchronized (synchronizeMap) {
	            for (String key : synchronizeMap.keySet()) {
	                System.out.println(key + ": " + synchronizeMap.get(key));
	            }
	        }
		 
		 synchronized (synchronizeMap) {
			 synchronizeMap.put("four", 4);
	        }
		 System.out.println(synchronizeMap);
	}
}
