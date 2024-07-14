package assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Count of elements
        long count = numbers.stream().count();
        System.out.println("Count: " + count);

        // Sum of all elements
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);

        // Minimum element
        OptionalInt min = numbers.stream().mapToInt(Integer::intValue).min();
        if (min.isPresent()) {
            System.out.println("Min: " + min.getAsInt());
        } else {
            System.out.println("List is empty");
        }

        // Average of all elements
        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
        if (average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        } else {
            System.out.println("List is empty");
        }

        // Maximum element
        OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();
        if (max.isPresent()) {
            System.out.println("Max: " + max.getAsInt());
        } else {
            System.out.println("List is empty");
        }
    }
}
