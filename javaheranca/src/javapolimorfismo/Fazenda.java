package javapolimorfismo;

public class Fazenda {

	public static void main(String[] args) {
		Cavalo c1 = new Cavalo("Toinho");
		
		
		c1.comer();
		c1.comer("Capim");
		c1.comer("Triste", "capim");

	}

}
