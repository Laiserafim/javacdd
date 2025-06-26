package metodos;

public class conssecionaria {

	public static void main(String[] args) {
		Carros c1 = new Carros();
		Carros c2 = new Carros("Fiat uno");
		Carros c3 = new Carros("Palio","branco");
		Carros c4 = new Carros("Corsa","preto",30.000);
		
		System.out.println("O modelo é "+c2.modelo);
		System.out.println("O modelo é "+c3.modelo+ " e a cor é "+c3.cor);
		System.out.println(c4.modelo+" o valor é "+c4.preco+ " e a cor é "+c4.cor);

	}

}
