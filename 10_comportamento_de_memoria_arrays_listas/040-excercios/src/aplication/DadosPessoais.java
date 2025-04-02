package aplication;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados?");

        int n = sc.nextInt();
        sc.nextLine();
        Pessoa[] pessoas = new Pessoa[n];
        double menorAltura = 0;
        double maiorAltura = 0;
        double mediaAlturasMulheres = 0;
        int numHomens = 0;
        int numMulheres = 0;

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("altura da %da Pessoa: ", i+1);
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Genero da %da Pessoa (m / f): ", i+1);
            String genero = sc.nextLine();

            pessoas[i] = new Pessoa(altura, genero);
        }

        double total = 0;

        menorAltura = pessoas[0].getAltura();
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getAltura() < menorAltura){
                menorAltura = pessoas[i].getAltura();
            }
            if(pessoas[i].getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
            }

            if(pessoas[i].getGenero().equalsIgnoreCase("f")){
                numMulheres++;
                total += pessoas[i].getAltura();
                mediaAlturasMulheres = total / numMulheres;
            }

            if(pessoas[i].getGenero().equalsIgnoreCase("m")){
                numHomens++;
            }
        }

        System.out.println("Menor Altura = " + menorAltura);
        System.out.println("MaiorAltura = " + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n",  mediaAlturasMulheres);
        System.out.println("Numero de homens = " + numHomens);


        sc.close();
    }
}
