package aplication;

import java.util.Locale;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");

        int n = sc.nextInt();
        sc.nextLine();
        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        int posicao = 0;
        double maiorValor = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= maiorValor ) {
                maiorValor = numeros[i];
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);
        System.out.printf("POSICAO DO MAIOR VALOR = %d ", posicao);

        sc.close();
    }
}
