package java8features;

import java.time.LocalDate;

public class LocalDateExample {
	public static void main(String[] args) {
		// todays date 
		System.out.println("Today's date");  
		LocalDate lD = LocalDate.now();
		System.out.println(lD);
		// custom date
		System.out.println("Custom date");
		LocalDate lD1 = LocalDate.of(2001, 12, 8);
		System.out.println(lD1);
		// Extracting year, day and month.
		int year = lD.getYear();
		int day = lD.getDayOfMonth();
		int month = lD.getMonthValue();
		System.out.println(day+"-"+month+"-"+year);
		// getting past date.
		LocalDate yesterday = lD.minusDays(1);
		LocalDate lastWeek = lD.minusWeeks(4);
		LocalDate lastMonth = lD.minusMonths(3);
		LocalDate lastYear = lD.minusYears(1);
		System.out.println(yesterday+"\n"+lastWeek+"\n"+lastMonth+"\n"+lastYear);
		// isAfter method
		if(lD.isAfter(yesterday))
		{
			System.out.println(true);
		}
		
		
		
	}
}
