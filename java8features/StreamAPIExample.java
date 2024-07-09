package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamAPIExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Shivam", "Suraj", "Sushma", "Abhimanyu", "Asha", "Mohan");
		
		List<FamilyMember> name = list.stream().map(FamilyMember::new).collect(Collectors.toList());
		System.out.println(name);
		System.out.println();
		
		List<Integer> list1 = Arrays.asList(23,45,3,24,5,6,57,5,3,65,75,75,37,57,75,6,57,522);
		
		List<Integer> filteredList = list1.stream().filter(x -> x>10).sorted().distinct().collect(Collectors.toList());
		System.out.println(filteredList);
		System.out.println();
		
		List<String> upperCase = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCase);
		System.out.println();
		
		long countOfString = list.stream().filter(x -> x.charAt(0)=='S').count();
		System.out.println(countOfString);
		System.out.println();
		
		long sumOfSquare = list1.stream().mapToInt(x -> x*x).sum();
		System.out.println(sumOfSquare);
		System.out.println();
		
		Integer max = list1.stream().max(Integer::compareTo).orElseThrow(() -> new RuntimeException("List is empty"));
		System.out.println(max);
		
		List<Employee> employee = Arrays.asList(
				new Employee("Shivam",16000),
				new Employee("Suraj",15000),
				new Employee("Sushma",12000),
				new Employee("Abhimanyu",14000),
				new Employee("Asha",11000),
				new Employee("Mohan",12000),
				new Employee("Kailash",13000)				
				);
		List<Employee> topEmployee = employee.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.limit(3).collect(Collectors.toList());
		System.out.println(topEmployee);
		
		
		// creating stream.
		Stream<Integer> myStream = Arrays.asList(1,43,45,56,54,57,8,98,8,54,5,56,86,97,890,79,978,76,5).stream();
		System.out.println(myStream);
				
	}

}