package metodos;

public class Carros {
	String modelo;
	String cor;
	double preco;
	
	public Carros() {
		
	}
	
	public Carros(String modelo) {
		this.modelo = modelo;
	}
	
	public Carros(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public Carros(String modelo, String cor, double preco) {
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
	}
	
	
}
