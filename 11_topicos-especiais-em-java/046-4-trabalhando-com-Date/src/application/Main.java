package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date agora = new Date();
		//Outra forma de imprimir a data e hora atuais.
		Date agora2 = new Date(System.currentTimeMillis());
		Date agora3 = new Date(0L);//01-01-1970
		//5 am do dia padrao UTC (milissegundos * min * hora * as 5 horas)
		Date agora4 = new Date(1000L * 60L * 60L * 5L);
		Date agora5 = Date.from(Instant.parse("2026-02-25T15:42:07Z"));
		System.out.println("agora  " + agora);
		System.out.println("agora2 " + agora2);
		System.out.println("agora3 " + agora3);
		System.out.println("agora4 " + sdf2.format(agora4));
		System.out.println("agora5 " + sdf3.format(agora5));
		System.out.println("-------------------------------");
		System.out.println("agora  " + sdf3.format(agora));
		System.out.println("agora2 " + sdf3.format(agora2));
		System.out.println("agora3 " + sdf3.format(agora3));
		System.out.println("agora4 " + sdf3.format(agora4));
		System.out.println("agora5 " + sdf3.format(agora5));
		
		Date y1 = sdf1.parse("25/06/2026");
		Date y2 = sdf2.parse("25/06/2026 15:42:07");
		
		//Formato padrão
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		
		//Formatado com SimpleDateFormat
		System.out.println("y1f: " + sdf1.format(y1));
		System.out.println("y2f: " + sdf2.format(y2));
			
		
		
	}

}
