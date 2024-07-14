package assessment;

import java.util.*;
import java.util.stream.*;

public class JavaStreamsExample {
    public static void main(String[] args) {
        // Example 1: Optional Class
        Optional<String> optional1 = Optional.of("Shivam");
        Optional<String> optional2 = Optional.empty(); // Empty optional

        if (optional1.isPresent()) {
            System.out.println("Value is present: " + optional1.get());
        } else {
            System.out.println("Value is not present");
        }

        String result = optional2.orElse("Default Value");
        System.out.println("Value or default: " + result);

        // Example 2: Parallel Sorting
        int[] numbers = {5, 2, 9, 1, 5, 6};
        Arrays.parallelSort(numbers);
        System.out.print("Sorted numbers:");
        Arrays.stream(numbers).forEach(num -> System.out.print(" " + num));
        System.out.println();

        // Example 3: StringJoiner
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("John").add("Doe").add("Jane");
        String joinedString = sj.toString();
        System.out.println("Joined String: " + joinedString);

        // Example 4: Collector Class in Streams
        List<String> names = Stream.of("John", "Jane", "Doe")
                                   .collect(Collectors.toList());
        System.out.println("Collected List: " + names);
    }
}
