import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Estrutura repetitiva 'do-while' ou "fa�a-enquanto".
		 * 
		 * Menos utilizada, mas em alguns casos se encaixa melhor ao problema. O bloco
		 * de comandos executa pelo menos uma vez, pois a condi��o � verificada no
		 * final.
		 * 
		 * 
		 * Problema exemplo:
		 * 
		 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
		 * em Fahrenheit. Perguntar se o usu�rio deseja repetir (s/n). Caso o usu�rio
		 * digite "s", repetir o programa.
		 * 
		 * F�rmula: F = (9*C / 5) + 32
		 * 
		 * Exemplo:
		 * 
		 * Digite a temperatura em Celsius: 30.0
		 * Equivalente em Fahrenheit: 86.0
		 * Deseja repetir (s/n)? s
		 * Digite a temperatura em Celsius: 21.0
		 * Equivalente em Fahrenheit: 69.8
		 * Deseja repetir (s/n)? s
		 * Digite a temperatura em Celsius: -10.5
		 * Equivalente em Fahrenheit: 13.1
		 * Deseja repetir (s/n)? n
		 * 
		 */
		
		
		// Exercicio resolvido com o uso da estrutura 'while'.
		
		/*
		//System.out.print("Digite a temperatura em Celsius: ");
		//double celsius = sc.nextDouble();
		//double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
		//System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
		//System.out.print("Deseja repetir (s/n)? ");
		//char response = sc.next().charAt(0);
		
		// A melhor forma � definir um valor para a vari�vel 'response', para
		// n�o precisar duplicar o c�digo.
		
		char response = 's';
		
		// Essa condi��o encerra o programa caso o usu�rio digite qualquer 
		// coisa al�m de "s".
		while (response != 'n' && response == 's') {
			
			System.out.print("Digite a temperatura em Celsius: ");
			// Agora � necess�rio declarar o tipo da vari�vel.
			double celsius = sc.nextDouble();
			double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			System.out.print("Deseja repetir (s/n)? ");
			response = sc.next().charAt(0);
		} 
		*/
		
		// Exercicio resolvido com o uso da estrutura 'do-while'.
		
		char response;

		do {
			
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			
			double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			
			System.out.print("Deseja repetir (s/n)? ");
			response = sc.next().charAt(0);
			
		} while (response != 'n');
		
		sc.close();
	}
}
