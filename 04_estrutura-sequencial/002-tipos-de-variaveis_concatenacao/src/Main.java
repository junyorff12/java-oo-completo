// Duas barras servem para fazer coment�rios.

// classe importada para funcionamento do Locale.US
import java.util.Locale;

// Nome da classe principal do programa.
public class Main {

	public static void main(String[] args) {
		
		// Declara��o de vari�vel do tipo inteiro com atribui��o de valor.
		//int y = 32;
		
		// Vari�vel do tipo ponto flutuante de dupla precis�o.
		double x = 10.35784;
		
		// Mostrando o valor da vari�vel y.
		//System.out.println(y);
		System.out.println(x);
		
		// printf mais %._f, escreve o conte�do formatado, nesse caso com 2 casas decimais ap�s a v�rgula.
		// O %n realiza a quebra de linha. E a concatena��o � feita atrav�s da v�rgula.
		System.out.printf("%.2f%n", x);
		
		// Com 4 casas decimais, por�m ele escreve o valor com v�rgula e n�o com ponto,
		// igual ao padr�o americano.
		System.out.printf("%.4f%n", x);
		
		// Altera a formata��o de n�meros fluantes para ponto ao inv�s de v�rgula.
		// Por�m � necess�rio importar a biblioteca/classe import java.util.Locale; no in�cio do programa.
		Locale.setDefault(Locale.US);
		
		// Agora com ponto, ap�s a declara��o do Locale.US
		System.out.printf("%.4f%n", x);
		
		// Faz a concatena��o de vari�veis dentro do println
		System.out.println("RESULTADO = " + x + " METROS");
		
		// Concatena��o com printf
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		// Vari�vel do tipo cadeia ou texto.
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda); 
		// %s serve para concatenar textos, %d serve para n�meros inteiros, e o %f para n�meros reais.
		
		// Mostra o conte�do do texto entre aspas duplas.
		// print escreve na mesma linha, println pula para linha de baixo.
		//System.out.print("Ol�, mundo!");
		//System.out.println("Bom dia!");
	}
}
