package exercicios;

import java.util.Scanner;

public class DiagonalPrincipal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas e colunas: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		System.out.println("Digite os dados a matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		int qtdNegativeNumbers = 0;
		
		System.out.println("Digite os dados a matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(matriz[i][j] < 0) {
					qtdNegativeNumbers++;
				}
			}
		}
		
		System.out.print("Quantidade de negativos = " + qtdNegativeNumbers);
		
		sc.close();

	}

}
