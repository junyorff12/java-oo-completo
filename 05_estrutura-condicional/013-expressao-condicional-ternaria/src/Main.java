
public class Main {

	public static void main(String[] args) {
		
		double price = 34.5;
		
		/*
		double discount;
		
		if (price < 20.0)
			discount = price * 0.1;
		else
			discount = price * 0.05;
		*/
		
		// Express�o condicional tern�ria, � uma estrutura opcional ao if-else.
		// ( condi��o ) ? valor_se_verdadeiro : valor_se_falso
		double discount = (price < 20.0) ? price * 0.1 : price * 0.05;
		
		System.out.println(discount);
	}
}
