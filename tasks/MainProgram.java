package tasks;
//  Main Class For custom exception

import java.util.Scanner;

public class MainProgram {

    // This Method that throws our custom exception
    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid. You can Vote.");
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Age: ");
            int age = sc.nextInt();
            validateAge(age); // This will throw CustomException
        } catch (CustomException e) {
            System.out.println("Custom Exception : " + e.getMessage());
        }
    }
}
