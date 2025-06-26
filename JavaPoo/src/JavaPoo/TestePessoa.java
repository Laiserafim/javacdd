package JavaPoo;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.nome="João";
		p1.idade=17;
		p1.altura=1.80;
		p1.genero="masculino";
		p1.mostrarAtributos();
		
		p2.nome="Lali";
		p2.idade=22;
		p2.altura=1.60;
		p2.genero="Feminino";
		p2.mostrarAtributos();
		
		
		

	}

}
