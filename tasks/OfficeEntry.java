package tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Driver Class 
public class OfficeEntry {
    public static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        // Adding some employee details
        employees.add(new Employee("Sushma Thakur", 2, "Nagpur"));
        employees.add(new Employee("Shivam Thakur", 1, "Andra Pradesh"));
        employees.add(new Employee("Abhimanyu Thakur", 3, "Hyderabad"));
        employees.add(new Employee("Asha Thakur", 4, "Pune"));
        employees.add(new Employee("Suraj Thakur", 5, "Bihar"));
        employees.add(new Employee("Mohan Thakur", 6, "Mumbai"));

        // Taking Id from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Employee ID to enter the office: ");
        int empId = sc.nextInt();

        // comparing User Id with stored Id
        try 
        {
            OfficeEntry officeEntry = new OfficeEntry();
            officeEntry.checkEmployeeId(empId);
            System.out.println("Welcome to the office!");
        } 
        catch (InvalidEmployeeIdException e) 
        {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    // Method to check the employee Id exist or not
    public void checkEmployeeId(int empId) throws InvalidEmployeeIdException {
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getId() == empId) {
                found = true;
                break;
            }
        }
        if (!found) {
            throw new InvalidEmployeeIdException("Invalid Employee ID: " + empId + ". Please enter a valid ID.");
        }
    }
}

