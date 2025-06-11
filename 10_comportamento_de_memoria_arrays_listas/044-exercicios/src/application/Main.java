package application;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> funcionarios = new ArrayList<Employee>();
		
		System.out.println("Quantos funcionarios serão registrados? ");
		int numFuncionarios = sc.nextInt();
		
		for (int i = 0; i < numFuncionarios; i++) {
			int employee = i + 1;
			System.out.println("Employee #" + employee);
			System.out.print("Id:");
			int id = sc.nextInt();
			
			if (idCheck(funcionarios, id) != null) {
				System.out.println("Id ja registrado, informe outro ID:");
				id = sc.nextInt();
			}
			
			System.out.print("Nome:");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Salario:");
			BigDecimal salario = sc.nextBigDecimal();
			
			funcionarios.add(i, new Employee(id, nome, salario));
			
			System.out.print("Entre com o funcionario que terá salario aumentado:");
			
			int funcionarioId = sc.nextInt();
			
			System.out.println("Entre com a porcentegem:");
			
			double porcentagem = sc.nextDouble();
			
			aumentoDeSalario(funcionarioId, porcentagem);
			
		}
		
		sc.close();

	}
	
	public static Employee idCheck(List<Employee> funcionarios, int id) {
		return funcionarios.stream().filter(x -> x.getId() == id).findAny().orElse(null);	
	}
	
	public static void aumentoDeSalario(List<Employee> funcionarios, int id, double porcentagem) {
		BigDecimal novoSalario = 
		funcionarios.stream().filter(x -> if(x.getId() == id) { x.setSalary() });
	}

}
