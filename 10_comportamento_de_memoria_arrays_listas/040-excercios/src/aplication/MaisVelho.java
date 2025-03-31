package aplication;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos pessoas voce vai digitar?");

        int n = sc.nextInt();
        sc.nextLine();
        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {
            int ordem = i + 1;
            System.out.println("Digite a " + ordem + "a pessoa:");
            System.out.print("Nome:");
            String nome = sc.nextLine();
            System.out.print("Idade:");
            int idade = sc.nextInt();
            sc.nextLine();

            pessoas[i] = new Pessoa(nome, idade);

        }

        Pessoa maisVelha = null;
        for (Pessoa pessoa : pessoas) {
            int maiorIdade = 0;
            if (pessoa.getIdade() > maiorIdade) {
                maiorIdade = pessoa.getIdade();
                maisVelha = pessoa;
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + maisVelha.getNome());

        sc.close();
    }
}
