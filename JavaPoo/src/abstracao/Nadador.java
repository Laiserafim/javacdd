package abstracao;

public class Nadador extends Atleta {

	public Nadador(String nome, int idade) {
		super(nome, idade);
	}

	public void Nadar() {
		System.out.println("Está nadando");
		
	}
	public void PararNadar() {
		System.out.println("Parou de nadar");
	}
}
