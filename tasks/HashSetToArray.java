package tasks;
import java.util.*;

public class HashSetToArray {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Mango");

        // Convert HashSet to Array
        String[] array = new String[hashSet.size()];

        // Using toArray() method
        array = hashSet.toArray(array);

        // Print the Array
        System.out.println("Array after conversion:");
        System.out.println(Arrays.toString(array));
    }
}
