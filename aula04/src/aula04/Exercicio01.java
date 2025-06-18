package aula04;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double notas[] = new double[5];
		double soma = 0, media = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Informe a %d nota", i+1);
			notas[i] = entrada.nextDouble();
		}
		for (double nota: notas) {
			soma += nota;
	System.out.println(media);
		}
	}

}
