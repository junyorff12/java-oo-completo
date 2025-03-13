//package course;

import java.util.Locale;
import java.util.Scanner;

/*
Este programa calcula as ra�zes de uma equa��o do segundo grau

Os valores dos coeficientes devem ser digitados um por linha
*/

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Coment�rios em Java (b�sico)
		// Uma boa pr�tica de programa��o � evitar o excesso de coment�rios.
		// Coment�rios devem ser usados com parcim�nia.
		
		// (o.O) IH RAPAZ. 
		
		// � melhor colocar o nome das vari�veis, fun��es, m�todos, 
		// classes, atributos e opera��es de forma autoexplicativa.

		System.out.println("Digite os valores dos coeficientes:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double delta = Math.pow(b, 2.0) - 4 * a * c; // c�lculo do valor de delta
		System.out.println(delta);

		sc.close();
	}
}