package aplication;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serão digitados?");

        double media = 0;
        int quantidadeNotas = 2;
        int n = sc.nextInt();
        sc.nextLine();
        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < alunos.length; i++) {
            int ordem  = i + 1;
            System.out.println("Digite nome, primeira e segunda nota do " + ordem + "o  aluno: ");
            String nome = sc.nextLine();
            double[] notas = new double[quantidadeNotas];
            notas[0] = sc.nextDouble();
            notas[1] = sc.nextDouble();
            sc.nextLine();
            alunos[i] = new Aluno(nome, notas);
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < alunos.length; i++) {
            media = (alunos[i].getNotas()[0] + alunos[i].getNotas()[1]) / quantidadeNotas;
            if(media >= 6) {
                System.out.println(alunos[i].getNome());

            }
        }

        sc.close();
    }
}
