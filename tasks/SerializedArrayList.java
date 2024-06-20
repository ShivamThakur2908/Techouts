package tasks;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializedArrayList {

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
		try {
			FileOutputStream fileOut = new FileOutputStream("ArrayList.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(arrayList);
			fileOut.close();
			System.out.println("ArrayList is Serialized");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
