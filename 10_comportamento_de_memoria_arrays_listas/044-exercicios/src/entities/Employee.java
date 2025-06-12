package entities;

import java.math.BigDecimal;

public class Employee {
	private Integer id;
	private String nome;
	private BigDecimal salary;

	public Employee(Integer id, String nome, BigDecimal salary) {
		this.id = id;
		this.nome = nome;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public void aumentarSalario(double percentual) {
		this.salary = this.salary
				.add((this.salary.multiply(BigDecimal.valueOf(percentual).divide(BigDecimal.valueOf(100)))));
	}

	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salary);
	}

}
