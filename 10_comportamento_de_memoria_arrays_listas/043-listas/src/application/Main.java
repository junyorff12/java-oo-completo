package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		lista.add(2, "Marco");
		
		System.out.println(lista.size());
		
		for(String x: lista) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------");
		
//		lista.remove("Anna");
//		lista.remove(1);
//		lista.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x: lista) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------");
		
		System.out.println("Index of Bob: " + lista.indexOf("Bob"));
		
		System.out.println("---------------------------------");
		
		// Transforme a lista em Stream, faço o filtro, transformo de volta para List.
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		System.out.println("Iniciando com A");
		for(String x: result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------");
		
		String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);
				
	}
}
