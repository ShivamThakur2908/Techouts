package java8features;
import java.util.Optional;

public class OptionalExample {
	    public static void main(String[] args) {
	        // Example 1: Creating an Optional with a nullable value
	        Optional<String> optionalNullable = Optional.ofNullable(null);

	        // Print the value if present, otherwise print "Value is absent"
	        optionalNullable.ifPresentOrElse(
	                value -> System.out.println("Value is present: " + value),
	                () -> System.out.println("Value is absent")
	        );

	        // Example 2: Creating an Optional with a non-null value
	        Optional<String> optionalString = Optional.of("Hello");

	        // Get the value or use a default value if the optional is empty
	        String valueOrDefault = optionalString.orElse("Default Value");
	        System.out.println("Value or default: " + valueOrDefault);

	        // Example 3: Using orElseGet to compute a default value
	        String computedValue = optionalString.orElseGet(() -> {
	            // Some expensive computation to get a default value
	            return "Computed Default Value";
	        });
	        System.out.println("Value or computed default: " + computedValue);

	        // Example 4: Using orElseThrow to throw an exception if value is not present
	        try {
	            String valueOrThrow = optionalString.orElseThrow(() -> new IllegalArgumentException("Value is not present"));
	            System.out.println("Value: " + valueOrThrow);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }

	        // Example 5: Filtering the optional based on a condition
	        Optional<String> filteredOptional = optionalString.filter(value -> value.startsWith("H"));
	        filteredOptional.ifPresent(value -> System.out.println("Filtered value: " + value));
	    }
	}


