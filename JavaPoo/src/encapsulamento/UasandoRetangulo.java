package encapsulamento;

public class UasandoRetangulo {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo(4,2);
		
		double area = r1.calcularArea();
		double perimetro = r1.calcularPerimetro();
		
		System.out.printf("A área é %.2f e o perimetro é %.2f", area, perimetro);
		
	}

}
