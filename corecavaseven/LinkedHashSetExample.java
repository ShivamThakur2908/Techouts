package corecavaseven;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        // Adding duplicate element (no effect)
        linkedHashSet.add("Apple");

        // Iterating over elements
        System.out.println("Elements in LinkedHashSet:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }

        // Removing an element
        linkedHashSet.remove("Banana");

        System.out.println("After removing 'Banana':");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }

        // Checking existence of an element
        System.out.println("Contains 'Orange': " + linkedHashSet.contains("Orange")); // Output: true
        System.out.println("Contains 'Grapes': " + linkedHashSet.contains("Grapes")); // Output: false

        // Size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size()); // Output: 2
    }
}
