package entities;

public class Aluno {
    private String nome;
    private double[] notas;
    private String email;

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }
    
    public Aluno(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
    	return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
