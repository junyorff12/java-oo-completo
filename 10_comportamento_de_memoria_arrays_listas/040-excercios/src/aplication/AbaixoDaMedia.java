package aplication;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o array? ");

        int n = sc.nextInt();
        sc.nextLine();
        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        double media = 0;
        double total = 0;

        for (double num: numeros){
            total += num;
        }

        media = total / numeros.length;

        System.out.printf("MEDIA DO VETOR %.3f%n", media);


        System.out.println("Elementos abaixo da media: ");
        for(double num : numeros) {
            if (num < media){
                System.out.printf("%.1f%n", num);
            }
        }
    }
}
