package application;

import java.time.*;

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
	}
}
