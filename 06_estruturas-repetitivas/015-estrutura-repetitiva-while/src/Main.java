import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/*
		 * Estrutura repetitiva 'while' ou "enquanto".
		 * 
		 * � uma estrutura de controle que repete um bloco de comandos enquanto uma
		 * condi��o for verdadeira. Usar quando n�o se sabe previamente a quantidade de
		 * repeti��es que ser� realizada.
		 * 
		 * 
		 * Problema exemplo:
		 * 
		 * Fazer um programa que l� n�meros inteiros at� que um zero seja lido. Ao final
		 * mostra a soma dos n�meros lidos.
		 * 
		 * Entrada		Sa�da
		 * 
		 * 5			11
		 * 2
		 * 4
		 * 0
		 */
		
		// � necess�rio atribuir um valor inicial para entrar no la�o do 'while'.
		int x = sc.nextInt();
		
		// Vari�vel de soma.
		int sum = x; // Tamb�m � necess�rio atribuir um valor para n�o dar erro.
		
		// '!=' sinal de diferente. Enquanto o "x" for diferente de zero o programa
		// vai repetir o bloco 'while'.
		while (x != 0) {
			
			x = sc.nextInt();
			
			// Como a vari�vel "sum" recebeu o valor de "x" antes do bloco 'while', ela
			// n�o precisa ser informada primeiro no bloco. Caso fosse atribuido o
			// valor "0", nesse caso sim, j� que a soma retornaria um valor diferente
			// de todas as entradas feitas na vari�vel "x".
			sum += x;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
