package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {
        // Main list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emma", "Frank");
        System.out.println("original list: "+names);
        System.out.println();
        // Collect all elements into a List
        List<String> collectedList = names.stream()
                .collect(Collectors.toList());
        System.out.println("Collected List: " + collectedList);
        System.out.println();
        // Collect all elements into a Set
        Set<String> collectedSet = names.stream()
                .collect(Collectors.toSet());
        System.out.println("Collected Set: " + collectedSet);
        System.out.println();
        // Collect elements into a Map by their length
        Map<Integer, List<String>> lengthMap = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Map grouped by length: " + lengthMap);
        System.out.println();
        // Concatenate all elements into a single String
        String concatenatedString = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Concatenated String: " + concatenatedString);
        System.out.println();
        // Calculate sum of lengths of all elements
        int totalLength = names.stream()
                .collect(Collectors.summingInt(String::length));
        System.out.println("Total length of all names: " + totalLength);
    }
}

