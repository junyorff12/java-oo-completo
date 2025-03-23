package entities;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;
	private double tax = 5.00;

	public Conta(int numero, String name, double saldoInicial) {
		this.numero = numero;
		this.nome = name;
		depositar(saldoInicial); //somente um ponto de acesso para incluir saldo 
	}

	public Conta(int numero, String name) {
		this.numero = numero;
		this.nome = name;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo -= valor + tax; //já retira a taxa junto do valor a sacar.
	}

	@Override
	public String toString() {
		return "Conta: numero = " + numero + ", nome = " + this.nome + ",R$ saldo = " + String.format("%.2f", saldo);
	}

}
