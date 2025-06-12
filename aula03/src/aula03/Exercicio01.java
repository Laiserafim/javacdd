package aula03;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int qtd = 0, x=0;
		double nota = 0,soma=0, media = 0;
		
		System.out.println("Quantos alunos você tem? ");
		qtd = entrada.nextInt();
		
		while (x < qtd) {
			System.out.printf("Qual a nota do aluno? ");
			nota = entrada.nextFloat();
			soma += nota;
			x++;
		
		}
		media = soma/qtd;
		System.out.printf("A media da turma é %.2f",+ media);
	}
}
