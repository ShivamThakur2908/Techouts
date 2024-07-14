package assessment;

import java.util.Set;

public class Company {
	private String name;
	private Set<Employee> employees;
	
	public Company(String name)
	{
		this.name = name;
	}
	public String getCompanyName()
	{
		return this.name;
	}
	public void setEmployees(Set<Employee> employees)
    {
        this.employees = employees;
    }
    public Set<Employee> getEmployees()
    {
        return this.employees;
    }
	
}
