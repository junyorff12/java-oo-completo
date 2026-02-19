package application;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class ZonedDateTimeEx {

	public static void main(String[] args) {
		ZonedDateTime sp = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
		ZonedDateTime tokio = sp.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
		
		System.out.println(sp);
		System.out.println(tokio);
		
		//for(String zid : ZoneId.getAvailableZoneIds()) { System.out.println(zid);}
		
		//Diferença entre datas (api antiga)
		
		Date data1 = new Date(0); // 1970
		Date data2 = new Date();

		long diferenca = data2.getTime() - data1.getTime();

		long dias = diferenca / (1000 * 60 * 60 * 24);

		System.out.println(dias + " dias");

	}

}
