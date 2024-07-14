package assessment;

import java.util.Scanner;

//Custom exception for invalid UserName
class InvalidUserNameException extends Exception {
 public InvalidUserNameException(String message) {
     super(message);
 }
}

public class UserNameValidation {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter your UserName: ");
     String userName = scanner.nextLine();

     try {
         validateUserName(userName);
         System.out.println("Valid UserName: " + userName);
     } catch (InvalidUserNameException e) {
         System.out.println("Invalid UserName: " + e.getMessage());
         // Handle the exception (e.g., ask user to input again)
     }
 }

 // Method to validate UserName
 public static void validateUserName(String userName) throws InvalidUserNameException {
     if (userName.length() < 10) {
         throw new InvalidUserNameException("UserName length must be at least 10 characters.");
     }
     if (userName.contains("&")) {
         throw new InvalidUserNameException("UserName cannot contain the '&' character.");
     }
     // Additional validations can be added as needed
 }
}

