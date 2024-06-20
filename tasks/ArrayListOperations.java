package tasks;

import java.util.*;

public class ArrayListOperations {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        // Iterate ArrayList using ListIterator
        System.out.println("Iterating ArrayList using ListIterator:");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Adding an element at a specific index in ArrayList
        list.add(2, "Grapes");

        // Sorting ArrayList in descending order
        Collections.sort(list, Collections.reverseOrder());

        // Inserting an element to ArrayList using ListIterator
        ListIterator<String> iterator1 = list.listIterator();
        iterator1.add("Pineapple"); 

        // Sorting elements of Java ArrayList
        Collections.sort(list);

        // Replacing an element at specified index in ArrayList
        list.set(1, "Cherry"); 

        // Searching an element in Java ArrayList
        String searchElement = "Orange";
        int index = list.indexOf(searchElement);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the ArrayList");
        }

        // Removing an element from specified index in ArrayList
        list.remove(3); 

        // Removing duplicates from ArrayList without using collections
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--; 
                }
            }
        }

    }
}
