package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o numero de linhas e de colunas da matriz:");
			
			int n = sc.nextInt();
			
			int[][] matriz = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				System.out.println("Digite os numeros da linha " + (i + 1));
				for (int j = 0; j < n; j++) {
					System.out.println("Digite os numeros da coluna " + (i + 1));
					matriz[i][j] = sc.nextInt();
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			sc.close();
	}

}
