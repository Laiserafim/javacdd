package aula03;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		
		int a[]= new int [4];
		int b[]= new int [4];
		int c[]= new int [4];
		int d[]= new int [4];
		
		Scanner entrada = new Scanner (System.in);
		
		int tamanho = a.length;
		
		for (int x = 0; x < tamanho; x++) {
			System.out.println("Digite o primeiro valor de A: ");
			a[x] = entrada.nextInt();
			System.out.println("Digite o primeiro valor de B: ");
			b[x] = entrada.nextInt();
			System.out.println("Digite o primeiro valor de C: ");
			c[x] = entrada.nextInt();
			System.out.println("Digite o primeiro valor de D: ");
			d[x] = entrada.nextInt();
		}
		entrada.close();
		

		

	}
}
