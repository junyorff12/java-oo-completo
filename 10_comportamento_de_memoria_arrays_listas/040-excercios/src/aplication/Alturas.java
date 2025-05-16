package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas?");

		int n = sc.nextInt();
		sc.nextLine();
		Pessoa[] pessoas = new Pessoa[n];

		for (int i = 0; i < pessoas.length; i++) {
			int ordem = i+1;
			System.out.println("Dados da " + ordem + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("idade: ");
		    int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			pessoas[i] = new Pessoa(nome, idade, altura);
		}
		
		double alturas = 0;
		Pessoa[] menor16Anos = new Pessoa[n];
		
		for (Pessoa pessoa : pessoas) {
			alturas += pessoa.getAltura();
		}
		
		int quantidadeIdadeMenor16 = 0;
		for (int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < 16) {
				menor16Anos[i] = pessoas[i];
				quantidadeIdadeMenor16++;
			}
		}
		
		double alturaMedia = alturas / n;
		
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		
		double porcentagemMenor16anos = ((double) quantidadeIdadeMenor16 / (double) n) * 100.0;
		
		System.out.print("Pessoas com menos de 16 anos: " + porcentagemMenor16anos + "% \n");
		
		for (Pessoa pessoa : menor16Anos) {
			if(pessoa != null) System.out.println(pessoa.getNome());
		}
		
		sc.close();

	}

}
