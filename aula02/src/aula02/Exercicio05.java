package aula02;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);	
		
		System.out.println("Digite o sexo: ");
		char sexo = entrada.next().charAt(0);
		
		/*if (sexo == 'f' || sexo == 'F') {
			System.out.println("Sexo: Feminino");
		}else if (sexo == 'm' || sexo =='M'){
			System.out.println("Sexo: Masculino");
		
		}else {
			System.out.println("Letra inválida.");
		}*/
		
		String resp = sexo == "F" || sexo == "f"? "feminino": sexo
		} 
}
