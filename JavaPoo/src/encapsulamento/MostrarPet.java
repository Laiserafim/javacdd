package encapsulamento;

public class MostrarPet {

	public static void main(String[] args) {
		Pet n2 = new Pet();
		n2.ajustarNome("Laís");
		n2.ajustarIdade(17);
		n2.ajustarTipo("Gato");
		n2.ajustarRaca("Siamês");
		
		String nome = n2.lerNome();
		int idade = n2.lerIdade();
		String tipo = n2.lerTipo();
		String raca = n2.lerRaca();
		
		System.out.printf("nome: %s | idade: %d | tipo: %s | raça: %s ", nome, idade, tipo, raca);
	}

}
