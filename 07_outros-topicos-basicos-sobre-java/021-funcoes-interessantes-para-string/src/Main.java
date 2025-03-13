
public class Main {

	public static void main(String[] args) {
		
		/*
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		// Converte todas as letras em min�sculo.
		String s01 = original.toLowerCase();
		
		// Converte todas as letras em mai�sculo.
		String s02 = original.toUpperCase(); 
		
		// Remove os espa�os at� o primeiro caractere da String, 
		// e tamb�m os espa�os ap�s o �ltimo caractere da String.
		String s03 = original.trim(); 
		
		// Recorta a String informando o campo de inicio, que come�a pelo zero
		// incluindo os espa�os, e monta uma nova String com esses caracteres.
		String s04 = original.substring(2); 
		
		// Recorta a String informando os argumentos de inicio e fim.
		String s05 = original.substring(2, 9); 
		
		// Esse comando substitui todos os caracteres que ele encontrar do 
		// primeiro par�metro pelo do segundo dentro da String.
		// Levando em considera��o se a letra � mai�scula ou min�scula.
		String s06 = original.replace('a', 'x'); 
		
		// Substitui o conjunto de String do primeiro par�metro pelo do segundo.
		// De acordo com os tamanhos das letras.
		String s07 = original.replace("abc", "xy");
		
		// Retorna a posi��o da primeira ocorr�ncia informada no argumento.
		// Ou seja, a primeira ocorr�ncia que existir do par�metro informado,
		// nesse caso a String "bc". 
		// Ela vai retornar o n�mero da primeira posi��o independentemente se 
		// existem outras ocorr�ncias na String.
		int i = original.indexOf("bc");
		
		// J� nesse caso, ela vai retornar a �ltima ocorr�ncia encontrada na
		// String, que � exatamente o contr�rio do comando anterior.
		int j = original.lastIndexOf("bc");

		System.out.println("Original: |" + original + "|");
		System.out.println("toLowerCase: |" + s01 + "|");
		System.out.println("toUpperCase: |" + s02 + "|");
		System.out.println("trim: |" + s03 + "|");
		System.out.println("substring(2): |" + s04 + "|");
		System.out.println("substring(2, 9): |" + s05 + "|");
		System.out.println("replace('a', 'x'): |" + s06 + "|");
		
		// O comando \"\" permite incluir aspas dentro das aspas da String.
		// Exemplo:
		//System.out.println("\"alguma coisa\"");
		
		System.out.println("replace(\"abc\", \"xy\"): |" + s07 + "|");
		System.out.println("indexOf(\"bc\"): |" + i + "|");
		System.out.println("lastIndexOf(\"bc\"): |" + j + "|");
		*/
		
		
		// Opera��o split.
		
		String s = "potato apple lemon";
		
		// Vetor de Strings.
		// O split � uma fun��o que serve para recortar o String, de acordo
		// com o separador informado, que nesse caso seriam os espa�os entre
		// as palavras da String "s", e distribui elas em cada posi��o do vetor.
		String[] vect = s.split(" "); // Iniciando na posi��o zero.
		
		// Atribuindo cada valor do vetor em uma vari�vel.
		// Que nesse caso seriam as palavras separadas da String "s".
		//String word1 = vect[0];
		//String word2 = vect[1];
		//String word3 = vect[2];
		
		// Ou escrever elas direto na tela.
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}
}
