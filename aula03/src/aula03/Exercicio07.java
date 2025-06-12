package aula03;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		int qtd = 0;
		double soma = 0, media = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Quantos alunos têm na sala? ");
		qtd = entrada.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite a nota do seu aluno: ");
			soma += entrada.nextDouble();
			
		}
		media = soma / qtd;
		System.out.println("A média da turma é: "+media);
		}
}
