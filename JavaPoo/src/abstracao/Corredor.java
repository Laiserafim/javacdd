package abstracao;

public class Corredor extends Atleta{

	public Corredor(String nome, int idade) {
		super(nome, idade);
		
	}
	public void Correr() {
		System.out.println("Está correndo");
	}
	public void PararCorrer() {
		System.out.println("Parou de correr");
	}
}
