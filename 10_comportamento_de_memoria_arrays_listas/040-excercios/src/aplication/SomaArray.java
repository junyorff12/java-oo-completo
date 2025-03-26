package aplication;

import java.util.Locale;
import java.util.Scanner;

public class SomaArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de numeros a ser lidos.");

		int n = sc.nextInt();
		double[] numbers = new double[n];

		System.out.print("Digite " + n + " numeros.");

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		for (double num : numbers) {
			soma += num;
		}
		
		double media = soma / numbers.length;
		
		System.out.print("Valores: ");
		for (double num : numbers) {
			System.out.printf("%.2f ",num);
		}
		
		System.out.printf("%nSoma: %.2f%n", soma);
		System.out.printf("Media: %.2f%n", media);
		
		sc.close();

	}

}
