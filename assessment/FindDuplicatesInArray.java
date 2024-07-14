package assessment;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6, 8}; // Example array with duplicates

        // Map to store number counts
        Map<Integer, Integer> numberCountMap = new HashMap<>();

        // Count occurrences of each number in the array
        for (int num : array) {
            if (numberCountMap.containsKey(num)) {
                numberCountMap.put(num, numberCountMap.get(num) + 1);
            } else {
                numberCountMap.put(num, 1);
            }
        }

        // Print duplicates (numbers with count > 1)
        System.out.println("Duplicate numbers:");
        for (Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}

