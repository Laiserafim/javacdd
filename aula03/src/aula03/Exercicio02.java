package aula03;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
				break;
			}
			
		}
	}
}
