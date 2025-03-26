package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar?");

		int n = sc.nextInt();
		sc.nextLine();
		int[] numeros = new int[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}

		int quantidadePares = 0;
		System.out.println("NUMEROS DE PARES: ");
		for (int i : numeros) {
			if(i % 2 == 0) {
				System.out.printf("%d ",i);
				quantidadePares++;				
			}
		}
		
		System.out.print("\nQUANTIDADE DE PARES: " + quantidadePares);
		
		sc.close();
	}

}
