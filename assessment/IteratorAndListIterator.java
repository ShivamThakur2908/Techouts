package assessment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIterator {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Demonstrating Iterator
        System.out.println("Using Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.print(number + " ");
            if (number == 3) {
                iterator.remove(); // Removes the current element (3)
            }
        }
        System.out.println();
        System.out.println("List after removing 3: " + numbers);

        // Demonstrating ListIterator
        System.out.println("\nUsing ListIterator:");
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            Integer number = listIterator.next();
            System.out.print(number + " ");
            if (number == 2) {
                listIterator.add(10); // Adds 10 before the current element (2)
            } else if (number == 4) {
                listIterator.set(20); // Replaces the current element (4) with 20
            }
        }
        System.out.println();
        System.out.println("List after adding 10 and replacing 4 with 20: " + numbers);

        // Using previous methods of ListIterator
        System.out.println("\nUsing ListIterator previous methods:");
        while (listIterator.hasPrevious()) {
            Integer number = listIterator.previous();
            System.out.print(number + " ");
            if (number == 20) {
                listIterator.remove(); // Removes the element 20
            }
        }
        System.out.println();
        System.out.println("List after removing 20: " + numbers);
    }
}
