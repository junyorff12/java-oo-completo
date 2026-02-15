package application;

import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercicios {
	
	public static void main(String[] args) {
		LocalDate inicialD = LocalDate.parse("2026-01-10");
		LocalDate finalD = LocalDate.parse("2026-12-20");
		
		Period p = Period.between(inicialD, finalD);
		
		LocalDateTime ldt = LocalDateTime.of(2026, 02, 9, 23, 21);
		
		System.out.println(ldt);
		
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
		System.out.println(p.getDays());
		
		// data de hoje daqui 30 dias.
		
		LocalDate hoje = LocalDate.now();
		
		LocalDate daquiTrintaDias = hoje.plusDays(30);
		
		System.out.println(daquiTrintaDias);
		
		//formatando datas parse (texto para Datas)
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate DataFormatada = LocalDate.parse("12/02/2026", dtf);
		
		System.out.println("dtf " + DataFormatada);
		
		//formatando datas (Datas para texto)
		
		DateTimeFormatter dtfPataTexto = DateTimeFormatter.ofPattern("dd,MMM,yyyy");
		
		LocalDate ld = LocalDate.of(2026, 02, 14);
		
		System.out.println("Data para Texto " + ld.format(dtfPataTexto));
		
		
		
		//formato predefinido
		
		DateTimeFormatter dtfPre = DateTimeFormatter.ISO_LOCAL_DATE;
		
		LocalDate dataPre = LocalDate.now();
		
		System.out.println(dataPre.format(dtfPre));
		
		//Formatando com Locale
		
		DateTimeFormatter dtfPTBR = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", Locale.of("pt", "BR"));
		
		LocalDate dataPTBR = LocalDate.now();	
		
		System.out.println(dataPTBR.format(dtfPTBR));
		
		
				
	}
}
