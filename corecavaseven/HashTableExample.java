package corecavaseven;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        // Creating a HashTable
        Hashtable<String, Integer> scores = new Hashtable<>();

        // Adding key-value pairs
        scores.put("Shivam", 95);
        scores.put("Sushma", 85);
        scores.put("Abhimanyu", 90);

        // Retrieving values
        System.out.println("Shivam's score: " + scores.get("Shivam")); // Output: 95

        // Checking if a key exists
        System.out.println("Does Sushma exist? " + scores.containsKey("Sushma")); // Output: true

        // Removing a key-value pair
        scores.remove("Abhimanyu");

        // Iterating over keys and values
        for (String key : scores.keySet()) {
            System.out.println(key + "'s score: " + scores.get(key));
        }
    }
}
