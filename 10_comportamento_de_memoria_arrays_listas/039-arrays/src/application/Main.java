package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor de produtos.");
		int n = sc.nextInt();
		
		Product[] products = new Product[n];
		
		sc.nextLine();
		System.out.println("Digite os dados do produto: ");
		
		for (int i = 0; i < products.length; i++) {
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			products[i] = new Product(name, price);
			sc.nextLine();
		}
			
		double total = 0;
		for (int i = 0; i < products.length; i++) {
			total += products[i].getPrice();
		}
		
		double media = total / products.length;
		
		System.out.printf("MEDIA %.2f", media);
		
		sc.close();

	}

}
