package exercicios;

import java.util.Scanner;

public class ValoresAdjacentes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de linhas e de colunas da matriz:");
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		System.out.println("Digite o conteúdo da Matriz:");
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite um numero da matriz para análise.");
		int num = sc.nextInt();
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
				
				if(matriz[i][j] == num) {
					System.out.println("Position " + i + "," + j);
					if(matriz[i][j-1] != ) System.out.println(matriz[i][j-1]);
					System.out.println("Right: " + matriz[i][j-1]);
					System.out.println("Down: " + matriz[i][j-1]);
					System.out.println("Left: " + matriz[i][j-1]);
				}
			}
		}
		
		
		
		
		
		sc.close();

	}

}
