package java8features;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		// Current time.
		LocalTime lT = LocalTime.now();
		System.out.println(lT);
		// custom time
		LocalTime lT1 = LocalTime.of(22, 34, 54);
		System.out.println(lT1);
		int hours = lT.getHour();
		int minute = lT.getMinute();
		int second = lT.getSecond();
		int nanoSecond = lT.getNano()/10000;
		System.out.println(hours+" \n"+minute+"\n"+second+"\n"+nanoSecond+"\n");
		// getting past date.
		LocalTime lastHours= lT.minusHours(1);
		LocalTime lastMinute = lT.minusMinutes(56);
		LocalTime lastSecond = lT.minusSeconds(100000);
		LocalTime lastNano = lT.minusNanos(1);
		System.out.println(lastHours+"\n"+lastMinute+"\n"+lastSecond+"\n"+lastNano);
		// isAfter method
		if(lT.isAfter(lastHours))
		{
			System.out.println(true);
		} 
	}

}