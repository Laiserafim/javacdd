package aula02;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		
		/*if (num > 0 ) {
			System.out.println("Valor é positivo");
		}else if (num < 0) {
			System.out.println("Valor é negativo");
		}else {
			System.out.println("É igual a zero");
		}*/
		
		String resultado = num==0?"Zero": num>0?"Positivo": "Negativo";
		System.out.println(resultado);
	}
		
}
