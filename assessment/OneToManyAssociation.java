package assessment;

import java.util.HashSet;
import java.util.Set;

public class OneToManyAssociation {

	public static void main(String[] args) {
		
		// Emp objects.
		Employee emp1 = new Employee("Shivam", 4.5, "2024");
		Employee emp2 = new Employee("Sushma", 5, "2018");
		Employee emp3 = new Employee("Suraj", 4, "2025");
		Employee emp4 = new Employee("Abhimanyu", 4.3, "2020");
		Employee emp5 = new Employee("Soumyajeet", 4.6, "2024");
		// Company object
		Company company = new Company("Techouts Solutions India Private Limited");
		// creating set for employee.
		Set<Employee> emp = new HashSet<Employee>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		
		company.setEmployees(emp);
		
		for (Employee employee : company.getEmployees()) {
			System.out.println("Company Name: "+company.getCompanyName()+"\n"
					+"Employee Name: "+employee.getEmpName()+"\n"+"Employee Rating: "+employee.getRating()+"\n"
					+"Employee Start Year: "+employee.getStartYear()+"\n");
			
		}
		

	}

}
