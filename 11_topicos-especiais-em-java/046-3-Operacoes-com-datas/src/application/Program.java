package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2026-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2026-07-20T01:30:26");
		Instant d06 = Instant.parse("2026-07-20T01:30:26.00Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("Past Week: " + pastWeekLocalDate);
		System.out.println("Next Week: " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant: " + pastWeekInstant);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		
		
		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atTime(0,0));
		//Mesma coisa (tranformar para LocalDateTime)
		//Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStatOfDay());

		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06,pastWeekInstant);
		
		System.out.println("Duration t2 : " + t2.toDays());
		System.out.println("Duration t1 : " + t1.toDays());
		System.out.println("Duration t3 : " + t3.toDays());
		System.out.println("Duration t4 : " + t4.toDays());
		
		

	}

}
