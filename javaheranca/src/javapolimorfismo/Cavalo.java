package javapolimorfismo;

public class Cavalo extends Animal {
	public Cavalo(String nome) {
		super(nome);
		
	}
	
	public void comer (String comida) {
		System.out.printf("Foi comer $s, comida");
	}
	
	public void comer (String estado, String comida) {
		System.out.printf("%s foi comer %s e ficou %s",nome, comida,estado);
	}
		
		
}
