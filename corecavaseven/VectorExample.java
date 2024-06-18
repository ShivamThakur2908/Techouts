package corecavaseven;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		Vector v = new Vector();
		// add(Object o) is use to add the elements in the vector.
		v.add(78);
		v.add(348);
		v.add(96);
		v.add(54);
		System.out.println(v);
		// get() is use to get the element from the vector.
		System.out.println(v.get(2));
		//add(int index, Object o) is use to add the element in the praticular index.
		v.add(4, 100);
		System.out.println(v);
		//remove(int index) is use to remove the element from the vector
		v.remove(4);
		System.out.println(v);
	}

}
