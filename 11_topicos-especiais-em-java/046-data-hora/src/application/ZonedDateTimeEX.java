package application;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeEX {

	public static void main(String[] args) {
		ZonedDateTime agora = ZonedDateTime.now();
		
		System.out.println(agora);
		
		ZonedDateTime data = ZonedDateTime.of(
		        2026, 2, 14,
		        10, 30, 0, 0,
		        ZoneId.of("Europe/Paris")
		);
		System.out.println(data);
		
	}

}
