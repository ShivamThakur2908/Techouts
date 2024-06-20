package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SynchronizeArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Shiavm");
		arrayList.add("Susham");
		arrayList.add("Suraj");
		arrayList.add("Abhimanyu");
		arrayList.add("Asha");
		arrayList.add("Mohan");
		arrayList.add("Pranay");
		arrayList.add("Supresh");
		arrayList.add("Soham");
		arrayList.add("Sahil");
		System.out.println(arrayList);
		
		List<String> synchronizeList = Collections.synchronizedList(arrayList);
		System.out.println(synchronizeList);
		
		 synchronized (synchronizeList) {
	            for (String value : synchronizeList) {
	                System.out.println(value);
	            }
	        }
		 
		 synchronized (synchronizeList) {
			 synchronizeList.add("four");
	        }
		 System.out.println(synchronizeList);
	}

}
