package tasks;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class SerializeHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hM = new HashMap<String, Integer>();
		hM.put("One", 1);
		hM.put("Two", 2);
		hM.put("Three", 3);
		hM.put("Four", 4);
		hM.put("Five", 5);
		System.out.println(hM);
		
		try {
			FileOutputStream fileOut = new FileOutputStream("HashMap.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(hM);
			fileOut.close();
			System.out.println("HashMap is Serialized");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
