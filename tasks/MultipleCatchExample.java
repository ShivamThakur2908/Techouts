package tasks;
import java.util.Scanner;

public class MultipleCatchExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        try {
            int number = Integer.parseInt(input);

            // dividing by 0
            int result = 100 / number;

            // trying to access the index element which is not present
            int[] arr = { 1, 2, 3 };
            System.out.println("Element at index " + (number + 1) + ": " + arr[number]);

            // trying to access the index character which is not present
            String str = "Hello";
            System.out.println("Character at position " + (number + 1) + ": " + str.charAt(number));

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index is out of bounds for the array.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: Index is out of bounds for the string.");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }

        sc.close();
    }
}
