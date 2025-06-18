package fundamentos03;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String str = "Hello";
		String resposta = str.replace("l", "w");
		System.out.println(resposta);
		
		String str2 = "oi ";
		String texto = str2 + "Mundo";
		System.out.println(texto);
		
		String str3 = "Hello Word";
		String resultado = str3.substring(6);
		System.out.println(resultado);
		
		String str4 = "Hello Word";
		String resultado1 = str4.substring(3,8);
		System.out.println(resultado1);
		
		String str5 = "Hello";
		String resultado2 = resultado.toUpperCase ();
		System.out.println(resultado2);
		
		String str6 = "Hello";
		String resultado3 = resultado.toLowerCase ();
		System.out.println(resultado3);
		
		
	}
}
