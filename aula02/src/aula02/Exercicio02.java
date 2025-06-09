package aula02;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o primeiro número: ");
		int a = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		int b = entrada.nextInt();
		System.out.println("Digite o terceiro número: ");
		int c = entrada.nextInt();
		
		/*String resultado = a > b && a >c? "O primeiro número é maior: " + a : b > c && b > a? "O segundo número é maior: " + b : "O terceiro número é maior: " + c;
		System.out.println(resultado);*/
		
		int maior = Math.max(a,Math.max(b,c));
		System.out.println(maior);
	}
}

