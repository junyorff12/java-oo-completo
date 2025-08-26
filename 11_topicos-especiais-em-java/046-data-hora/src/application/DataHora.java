package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d05 = LocalDate.parse("25/04/1987", fmt01);

		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2025-01-25");
		
		System.out.println("d01 = " + d01);
		System.out.println("d02	= " + d02);
		System.out.println("d03	= " + d03);
		System.out.println("d04	= " + d04);
		System.out.println("d05	= " + d05);
	}

}
