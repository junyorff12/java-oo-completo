
public class Main {

	public static void main(String[] args) {
		
		/* tipo de coment�rio em bloco.
		int x, y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		*/
		
		/*
		int x;
		double y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		// printa 10.0 mesmo com um dos n�meros sendo inteiro.
		System.out.println(y);
		*/
		
		/*	Tipo de coment�rio indentado com o Tab
		 *	Boas pr�ticas:
		 *	Para double use: .0
		 *	Para float use: f
		 */
		
		/* float � um tipo de dado de ponto flutuante igual ao double, por�m, sem precis�o dupla.

		float b, B, h, area;
	 	b = 6f;
		B = 8f;
		h = 5f;
		area = (b + B) / 2f * h;
		System.out.println(area);
		*/
		
		/*
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		*/
		
		/* Resulta em 2.0 e n�o 2.5 porque s�o duas vari�veis inteiras.
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = a / b;
		System.out.println(resultado);
		*/
		
		/*
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = (double) a / b; // Faz o Casting que � a convers�o explicita dos valores.
		System.out.println(resultado);
		*/
		
		/* Quando o compilador acha que voc� vai perder informa��o.
		double a;
		int b;
		a = 5.0;
		b = a; // Acusa erro.
		System.out.println(b);
		*/
		
		// Informando para o compilador que voc� n�o se importa com as casas decimais da vari�vel 'a'.
		double a;
		int b;
		
		a = 5.0;
		b = (int) a; // Printa o n�mero 5 como inteiro, com a utiliza��o do Casting.
		
		System.out.println(b);
	}
}
