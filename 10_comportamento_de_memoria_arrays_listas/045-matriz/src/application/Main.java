package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o numero de linhas e de colunas da matriz:");
			
			int n = sc.nextInt();
			
			int[][] matriz = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					matriz[i][j] = sc.nextInt();
				}
			}
			 
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					System.out.println(matriz[i][i]);
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			sc.close();
	}

}
