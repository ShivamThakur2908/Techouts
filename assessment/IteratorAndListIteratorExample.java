package assessment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIteratorExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Example 1: Using Iterator to iterate forward through the list
        System.out.println("Using Iterator to iterate forward:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println(); // Empty line for separation

        // Example 2: Using ListIterator to iterate backward through the list
        System.out.println("Using ListIterator to iterate backward:");
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
        }
    }
}

