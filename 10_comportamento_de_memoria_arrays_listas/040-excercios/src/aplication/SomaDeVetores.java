package aplication;

import java.util.Locale;
import java.util.Scanner;

public class SomaDeVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros a ser lidos: ");

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];

        System.out.println("Digite " + n + " valores do array A.");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Digite " + n + " valores do array B.");

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }

        System.out.println("Valor resultante: ");
        for (int num: arr3) {
            System.out.println(num);
        }

        sc.close();
    }
}
