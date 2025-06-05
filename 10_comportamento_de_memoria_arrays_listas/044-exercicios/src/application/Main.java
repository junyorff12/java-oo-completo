package application;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> funcionarios = new ArrayList();
		
		System.out.println("Quantos funcionarios serão registrados? ");
		int numFuncionarios = sc.nextInt();
		
		for (int i = 0; i < 3; i++) {
			int employee = i + 1;
			System.out.println("Employee #" + employee);
			System.out.print("Id:");
			int id = sc.nextInt();
			System.out.print("Nome:");
			String nome = sc.nextLine();
			System.out.print("Salario:");
			BigDecimal salario = sc.nextBigDecimal();
			
			funcionarios.add(i, new Employee(id, nome, salario));
			
		}

	}

}
