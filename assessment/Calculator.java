package assessment;

import java.util.Scanner;

class Operations {
    // Constants representing different operations
    public static final String PLUS = "plus";
    public static final String MINUS = "minus";
    public static final String DIVIDE = "divide";
    public static final String MULTIPLY = "multiply";

    public double calculate(double operand1, double operand2, String operation) {
        switch (operation) {
            case PLUS:
                return operand1 + operand2;
            case MINUS:
                return operand1 - operand2;
            case DIVIDE:
                return operand1 / operand2;
            case MULTIPLY:
                return operand1 * operand2;
            default:
                throw new AssertionError("Unsupported operation: " + operation);
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();

        // Input operands
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Calculate results for each operation and print
        System.out.println("Results:");
        System.out.println("Addition (+): " + operations.calculate(num1, num2, Operations.PLUS));
        System.out.println("Subtraction (-): " + operations.calculate(num1, num2, Operations.MINUS));
        System.out.println("Division (/): " + operations.calculate(num1, num2, Operations.DIVIDE));
        System.out.println("Multiplication (*): " + operations.calculate(num1, num2, Operations.MULTIPLY));

        scanner.close();
    }
}

