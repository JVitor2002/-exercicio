package aula05;

public class Brinquedo {
	private String nome;
	private double alturaMinima;
	private int capacidadeMaxima;
	
	
	public Brinquedo() {
	
	}
	
	public Brinquedo(String nome, double alturaMinima, int capacidadeMaxima) {
		this.nome = nome;
		this.alturaMinima = alturaMinima;
		this.capacidadeMaxima = capacidadeMaxima;
		
	}
//	@Override
//	public String toString() {
//		return "Brinquedo [nome=" + nome + ", alturaMinima=" + alturaMinima + ", capacidadeMaxima=" + capacidadeMaxima
//				+ "]";
//	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAlturaMinima() {
		return alturaMinima;
	}
	public void setAlturaMinima(double alturaMinima) {
		this.alturaMinima = alturaMinima;
	}
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	public void exibirInfo() {
		
	}

}
