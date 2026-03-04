package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2026-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		calendar.add(calendar.HOUR_OF_DAY, 4);
		
		d = calendar.getTime();
		
		System.out.println(sdf.format(d));
		
		int minutes = calendar.get(Calendar.MINUTE);
		int month = 1 + calendar.get(calendar.MONTH);//o mes no Calendar comeca com 0
		System.out.println(minutes);
		System.out.println(month);

	}

}
