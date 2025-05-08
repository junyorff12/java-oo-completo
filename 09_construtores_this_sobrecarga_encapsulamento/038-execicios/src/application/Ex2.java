package application;

public class Ex2 {

	public static void main(String[] args) {
		int x,d;
        d = 0;
        x = 314;
        while(x > 1 ) {
            x = x/2;
            d = d + 1;
        }
        
        System.out.println("Resultado do calculo:");
        System.out.println(x);
        System.out.println(d);

	}

}
