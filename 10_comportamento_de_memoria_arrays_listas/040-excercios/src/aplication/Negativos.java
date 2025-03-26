package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de numeros a ser lidos.");
		
		int n = sc.nextInt();
		int[] numbers = new int[n];
		
		System.out.print("Digite " + n + " numeros.");
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos: ");
		for(int num : numbers) {
			if(num < 0) {
				System.out.println(num);
			}
		}
		
		sc.close();

	}

}
