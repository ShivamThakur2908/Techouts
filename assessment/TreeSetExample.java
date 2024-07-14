package assessment;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // Create a TreeSet
        Set<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("banana");
        treeSet.add("grape");
        treeSet.add("Apple");

        // Print the TreeSet
        treeSet.forEach(System.out::println);
    }
}

