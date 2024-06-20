import java.util.*;

public class IterateTreeMap {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some key-value pairs to the TreeMap
        treeMap.put("Apple", 10);
        treeMap.put("Orange", 15);
        treeMap.put("Banana", 20);
        treeMap.put("Mango", 25);

        // Method 1: Iterate using keySet() and forEach loop
        System.out.println("Iterating TreeMap using keySet() and forEach loop:");
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
