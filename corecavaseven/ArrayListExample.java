package corecavaseven;
import java.util.*;
public class ArrayListExample {
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(895);
		list.add(95);
		list.add(88);
		list.add(49);
		list.add(44);
		list.add(5);
		list.add(2);
		System.out.println(list);
		/// to get the particular index element.
		System.out.println(list.get(5));
		// to add the value in the particular index.
		list.add(5, 100);
		System.out.println(list);
		// to remove the particular value.
		list.remove(5);
		System.out.println(list);
		System.out.println();
		// To iterate over a for loop.
		for(int i =0; i<= list.size()-1; i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		//iterating using for loop.
		list.forEach(a->{
			System.out.println(a);
		});
	}
}
