package assessment;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        System.out.println("Specific to General Catches");
        System.out.println();

        try {
            // Specific exception
            int[] arr = new int[3];
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

            // This line will not be executed if an exception occurs above
            System.out.println("This line will not be printed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
            return;
        } catch (Exception e) {
            System.out.println("Caught Exception");
            return;
        } finally {
            System.out.println("Inside finally block");
        }
    }
}

