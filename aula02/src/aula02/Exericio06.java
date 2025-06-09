package aula02;

import java.util.Scanner;

public class Exericio06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.println("***Desvende o caso***");
		System.out.println("Telefonou para a vítima? Digite 1 para 'Sim' e 0 para 'Não'");
		int resposta1 = entrada.nextInt();
		
		System.out.println("Esteve no local do crime? Digite 1 para 'Sim' e 0 para 'Não'");
		int resposta2 = entrada.nextInt();
		
		System.out.println("Mora perto da vítima? Digite 1 para 'Sim' e 0 para 'Não'");
		int resposta3 = entrada.nextInt();
		
		System.out.println("Devia para a vítima? Digite 1 para 'Sim' e 0 para 'Não'");
		int resposta4 = entrada.nextInt();
		
		System.out.println("Já trabalhou com a vítima? Digite 1 para 'Sim' e 0 para 'Não'");
		int resposta5 = entrada.nextInt();
		
		
		int total = resposta1 + resposta2 + resposta3 + resposta4 + resposta5;

		
		String resultado = total == 2? "Suspeito": total == 3 || total == 4? "Cumplice" : total==5? "Assassino":"Inocente";
		System.out.println(resultado);
		
		
		
}
}
