import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int n1 = 89;
		int n2 = 60;
		
		// Operadores bitwise.
		// Utilizados em programa��o de baixo n�vel.
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		*/
		
		//int mask = 32;
		//int mask = 0b00100000; // '0b' indica que ser� um n�mero bin�rio.
		int mask = 0b100000; // Os zeros a esquerda s�o opcionais.
		
		int n = sc.nextInt();
		
		// Verifica se o sexto bit � 1.
		if ((n & mask) != 0)
			System.out.println("6th bit is true!");
		else
			System.out.println("6th bit is false!");
		
		sc.close();
	}
}
