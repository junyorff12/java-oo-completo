package entities;

public class Employee {

	// ATRIBUTOS (DADOS)
	public String nome;
	public double valorPorHora;
	public int horas;

	// M�TODOS (FUN��ES) (COMPORTAMENTO)
	public double total() {

		return valorPorHora * horas;
	}
	
	/*
	Dados do primeiro funcion�rio:
	Ana
	80.00
	10
	Dados do segundo funcion�rio:
	Joao
	50.00
	12
	Total = 1400.00
	*/
}
