package entities;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private String genero;
	
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public Pessoa(double altura, String genero) {
		this.altura = altura;
		this.genero = genero;
	}

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	public String getGenero() {
		return genero;
	}
}
