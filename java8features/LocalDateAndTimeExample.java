package java8features;

import java.time.LocalDateTime;

public class LocalDateAndTimeExample {
	public static void main(String[] args) {
		// current date and time 
		LocalDateTime lDT = LocalDateTime.now();
		System.out.println(lDT);
		// custom date and time.
		LocalDateTime lDT1 = LocalDateTime.of(2001, 12, 8, 4, 30, 25);
		System.out.println(lDT1);
		// Extracting hours,minute,second,day,month,year.
		int hour = lDT.getHour();
		int minute = lDT.getMinute();
		int second = lDT.getSecond();
		int year = lDT.getYear();
		int month = lDT.getMonthValue();
		int day = lDT.getDayOfMonth();
		System.out.println(hour+"\n"+minute+"\n"+second+"\n"+year+"\n"+month+"\n"+day);
		// making use of minus() method.
		LocalDateTime yesterday = lDT.minusDays(1);
		LocalDateTime lastMonth = lDT.minusMonths(1);
		LocalDateTime lastWeek = lDT.minusWeeks(1);
		LocalDateTime lastYear = lDT.minusYears(1);
		LocalDateTime lastHour = lDT.minusHours(1);
		LocalDateTime lastMinute = lDT.minusMinutes(120);
		LocalDateTime lastSecond = lDT.minusSeconds(30000000);
		System.out.println(yesterday+
                    		"\n"+lastMonth +
                    		"\n"+lastWeek +
                    		"\n"+lastYear +
                    		"\n"+lastHour +
                    		"\n"+lastMinute+
                    		"\n"+lastSecond);            
	}
}