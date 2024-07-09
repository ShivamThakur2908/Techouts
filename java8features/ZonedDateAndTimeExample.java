package java8features;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateAndTimeExample {

	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
		System.out.println(zonedDateTime);
		Set<String> listOfZone = ZoneId.getAvailableZoneIds();
		System.out.println(listOfZone);

	}

}
