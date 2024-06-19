package corecavaseven;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(5); // Duplicate, no effect

        // Iterating over elements
        System.out.println("Elements in TreeSet:");
        for (Integer number : treeSet) {
            System.out.println(number);
        }

        // Checking existence of an element
        System.out.println("Contains 5: " + treeSet.contains(5)); // Output: true
        System.out.println("Contains 4: " + treeSet.contains(4)); // Output: false

        // Removing an element
        treeSet.remove(3);

        System.out.println("After removing 3:");
        for (Integer number : treeSet) {
            System.out.println(number);
        }

        // Size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size()); // Output: 3
    }
}
