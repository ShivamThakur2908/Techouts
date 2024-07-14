package assessment;

import java.security.PublicKey;

public class Employee {
	private String empName;
	private double rating;
	private String startYear;
	public Employee(String empName,double rating,String startYear)
	{
		this.empName = empName;
		this.rating = rating;
		this.startYear = startYear;
	}
	public String getEmpName() {
		return empName;
	}
	public double getRating() {
		return rating;
	}
	public String getStartYear() {
		return startYear;
	}
	
}
