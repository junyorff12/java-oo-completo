import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Estrutura repetitiva 'for' ou "para".
		 * 
		 * � uma estrutura de controle que repete um bloco de comandos para um certo
		 * intervalo de valores. Usar quando se sabe previamente a quantidade de
		 * repeti��es, ou o intervalo de valores. 
		 * 
		 * E ideal para fazer contagens (progressiva ou regressiva).
		 * 
		 * Por exemplo:
		 * 
		 * Fazer um programa que l� um valor inteiro N e depois N n�mero inteiros. Ao
		 * final, mostra a soma dos N n�meros lidos.
		 * 
		 * Entrada		Sa�da
		 * 
		 * 3			11
		 * 5
		 * 2
		 * 4
		 * 
		 */
		
		/*
		int sum = 0;
		int n = sc.nextInt();
		
		// 'int i = 0;' executa somente uma vez no in�cio, 'i < n;' � a condi��o
		// que determina a repeti��o do bloco, e 'i++' executa toda vez que termina
		// o �ltimo comando do la�o.
		for (int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			sum += x;
		}
		
		System.out.println(sum);
		*/
		
		/*
		// A estrutura 'for' � ideal para se fazer uma repeti��o baseada em uma contagem.
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Valor de i: " + i);
		}
		*/
		
		// Contagem regressiva
		for (int i = 4; i >= 0; i--) {
			
			System.out.println("Valor de i: " + i);
		}
		
		// � poss�vel fazer tamb�m com a estrutura 'while', caso a condi��o a ser 
		// verificada tenha como par�metro um contador.
		
		sc.close();
	}
}
