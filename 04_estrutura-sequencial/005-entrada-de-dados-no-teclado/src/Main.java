// � necess�rio importar a classe 'Scanner' para poder usar a entrada de dados.
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Declarando a vari�vel "sc" como objeto da classe 'Scanner'.
		// System.out mostra os dados na tela, System.in recebe os dados do teclado.
		Scanner sc = new Scanner(System.in);
		
		// 'next' atribui a vari�vel "x" apenas uma palavra digitada no teclado, e n�o um texto com espa�os.
		//String x = sc.next(); // Outra forma de declarar uma vari�vel.
		
		//int x;
		//x = sc.nextInt(); // 'nextInt' atribui um n�mero inteiro digitado no teclado.
		
		//System.out.println("Voc� digitou: " + x);
		
		/* 'nextDouble' atribui um n�mero do tipo real a vari�vel, por�m, a utiliza��o do ponto ou
	 	v�rgula para separar as casas decimais, depende da localidade do seu sistema. */
		
		//double x = sc.nextDouble(); 
		// Com a instancia��o do 'Locale' no in�cio do bloco, agora � poss�vel a utiliza��o do ponto para separar as casas decimais.
		
		/* O comando 'println' utiliza uma localidade independente, ent�o ele sempre printa com ponto ao inv�s de 
	 	v�rgula os n�meros quebrados, ao contr�rio do 'printf', que � de acordo com a localidade do sistema do usu�rio. */
		//System.out.printf("Voc� digitou: %.2f%n", x);
		
		/* Nesse caso o comando 'next' vai receber o que foi digitado em forma de String,
		e o comando 'charAt(0)' seleciona o primeiro caracter da palavra digitada. */
		//char x = sc.next().charAt(0);
		
		//System.out.println("Voc� digitou: " + x);
		
		String x;
		int y;
		double z;
		
		// Para ler v�rios dados na mesma linha no 'Console/Terminal'. Ex: 'Maria 30 4.5'
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		// Encerra o objeto "sc" quando n�o tem mais utilidade.
		sc.close();
	}
}
