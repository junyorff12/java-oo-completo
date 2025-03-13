
public class Main {

	public static void main(String[] args) {

		// Escopo de uma vari�vel: � a regi�o do programa onde a vari�vel � v�lida, ou
		// seja, onde ela pode ser referenciada. Em java, uma vari�vel n�o pode ser
		// usada se n�o for iniciada.
		
		//double price;
		//System.out.println(price); // A IDE aponta um erro.
		
		//double price = 400;
		//System.out.println(price); // Sem erro.
		
		/* Outras alternativas.
		double x = 20.0;
		double price = x;
		
		double x = 20.0;
		double price = sc.nextDouble();
		*/
		
		//double price;
		//double x = price; // Retorna um erro tamb�m.
		
		//System.out.println(price);
		
		double price = 400.00;
		
		/*
		if (price < 200.00) { // Sem o uso das chaves d� erro na vari�vel "discount".
			double discount = price * 0.1;
		}
		*/
		
		// Tamb�m d� erro por n�o fazer parte do mesmo escopo 
		// na estrutura do bloco 'if'.
		//System.out.println(discount); 
		
		
		//double discount;
		/*
		if (price < 200.00)
			discount = price * 0.1;
		*/
		
		// O compilador detectou que a vari�vel pode n�o ter sido iniciada.
		// Porque a condi��o 'if' pode ser falsa, e o comando de inicializa��o � pulado.
		//System.out.println(discount);
		
		// As duas poss�veis alternativas seriam, atribuir um valor como por exemplo o "0"
		// a vari�vel "discount", ou incluir uma condi��o 'else' no bloco 'if'.
		
		/*
		double discount;
		
		if (price < 200.00)
			discount = price * 0.1;
		else
			discount = 0.0;
		*/
		
		double discount = 0.0;
		
		if (price < 200.00)
			discount = price * 0.1;
		
		
		System.out.println(discount);
	}
}
