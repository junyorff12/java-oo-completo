package application;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeEx {

	public static void main(String[] args) {
		ZonedDateTime sp = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
		ZonedDateTime tokio = sp.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
		
		System.out.println(sp);
		System.out.println(tokio);
		
		//for(String zid : ZoneId.getAvailableZoneIds()) { System.out.println(zid);}

	}

}
