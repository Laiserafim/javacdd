package metodos;

public class calculadora {
	public static void main(String[] args) {
		CalcularMetodos c1 = new CalcularMetodos();
		
		int resultadosomar = c1.somar(5,4);
		System.out.println(resultadosomar);
		
		resultadosomar = c1.somar(8, 10,30);
		System.out.println(resultadosomar);
		
		
		int resultadodiminuir = c1.diminuir(5, 4);
		System.out.println(resultadodiminuir);
		
		resultadodiminuir = c1.diminuir(8, 10,30);
		System.out.println(resultadodiminuir);
		
		
		int resultadomultiplicar = c1.multiplicar(5, 4);
		System.out.println(resultadomultiplicar);
		
		resultadomultiplicar = c1.multiplicar(8, 10,30);
		System.out.println(resultadomultiplicar);
		
		
		int resultadodividir = c1.dividir(5, 4);
		System.out.println(resultadodividir);
		
		resultadodividir = c1.dividir(8, 10,30);
		System.out.println(resultadodividir);
	}	
}
