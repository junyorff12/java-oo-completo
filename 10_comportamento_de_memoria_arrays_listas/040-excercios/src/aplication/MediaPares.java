package aplication;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double media = 0;
        double total = 0;
        int numPares = 0;

        System.out.print("Quantos elementos vai ter o array? ");

        int n = sc.nextInt();
        sc.nextLine();
        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }


        for (double num: numeros){
            if(num % 2 == 0){
                total += num;
                numPares++;
            }
        }


        if (numPares > 0){
            media = total / (double) numPares;
            System.out.printf("MEDIA DOS PARES = %.1f%n", media);
        } else {
            System.out.println("NENHUM NUMERO PAR.");
        }

        sc.close();
    }
}
