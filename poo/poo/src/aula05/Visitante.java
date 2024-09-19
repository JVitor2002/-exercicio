package aula05;

public class Visitante {
	private String nome;
	private double altura;
	private int idade;
	
	
	public Visitante() {
		
	}
	
	public Visitante(String nome, double altura, int idade) {
	this.nome = nome;
	this.altura = altura;
	this.idade = idade;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void exibirInfo() {
		System.out.println( "Nome do visitante: " + this.nome + "\nAltura do visitante: " + this.altura + "\nIdade do visitante: " + this.idade);
	}
	
	public boolean andarNoBrinquedo() {
		return getAltura() >= 1.50 && getIdade() >= 12;
	}

}
