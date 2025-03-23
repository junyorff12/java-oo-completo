package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta;

		System.out.print("Digite o numero da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();//usado para executar o saldo de linha resultado do nextInt();

		System.out.print("Digite o nome do titular: ");
		String nome = sc.nextLine();
		System.out.print("Irá efetuar um deposito inicial? (y/n)");
		char option = sc.next().charAt(0);

		if (option == 'y') {
			System.out.println("Digite o valor do deposito inicial");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		} else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println("Dados da conta: ");
		System.out.println(conta);

		System.out.print("Digite o valor a depositar: ");
		conta.depositar(sc.nextDouble());
		System.out.println("Conta atualizada:");
		System.out.println(conta);

		System.out.print("Digite o valor a sacar: ");
		conta.sacar(sc.nextDouble());
		System.out.println("Conta atualizada:");
		System.out.println(conta);

		sc.close();
	}

}
