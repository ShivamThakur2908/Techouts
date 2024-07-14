package assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamCalculation {
    public static void main(String[] args) {
        // Sample data in an ArrayList
        List<Integer> numbers = Arrays.asList(5, 10, 3, 8, 15, 2, 7, 9);

        // Using Stream API to perform calculations
        long count = numbers.stream().count();
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        OptionalDouble average = numbers.stream().mapToDouble(Integer::doubleValue).average();
        int min = numbers.stream().mapToInt(Integer::intValue).min().orElseThrow(); // Throws if list is empty
        int max = numbers.stream().mapToInt(Integer::intValue).max().orElseThrow(); // Throws if list is empty

        // Output results
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (average.isPresent() ? average.getAsDouble() : "N/A"));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}

