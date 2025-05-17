package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        
        int qtdQuartos;
        Aluno[] quartos = new Aluno[10];
        
        System.out.println("Quatos quartos vao ser alugados?");
        qtdQuartos = sc.nextInt();
        
        	
        	sc.nextLine();
        for(int i = 0; i < qtdQuartos; i++) {
        	System.out.println("Aluguel " + (i+1));
        	System.out.print("Nome: ");
        	String name = sc.nextLine();
        	System.out.print("Email: ");
        	String email = sc.nextLine();
        	System.out.print("Quarto: ");
        	int quarto = sc.nextInt();
        	
        	quartos[quarto] = new Aluno(name, email);
        	
        }
        
        System.out.println("Quartos ocupados: ");
        for(int i = 0; i < quartos.length; i++) {        	
        	if (quartos[i] != null) {
        		System.out.printf("%d: %s, %s ", i, quartos[i].getNome(), quartos[i].getEmail());
        	}
        	
        }
        

        sc.close();
    }
}
