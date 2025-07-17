package abstracao;

public class Ciclista extends Atleta {

	public Ciclista(String nome, int idade) {
		super(nome, idade);
	}
	public void pedalar() {
		System.out.println("Está pedalando");
	}
	public void PararPedalar() {
		System.out.println("Parou de pedalar");
	}
}
