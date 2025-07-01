package javaheranca;

public class Escola {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(null, null, null);
		
		aluno1.nome = "Pedro";
		aluno1.cpf = "11195267444";
		aluno1.telefone = "88818777";
		
		aluno1.matricula = "1234";
		System.out.printf("Aluno: %s %s %s %s",aluno1.nome,aluno1.cpf,aluno1.telefone, aluno1.matricula);
		
		Professor professor1 = new Professor (null, null, null);
		professor1.nome = "Rafaela";
		professor1.cpf = "45232229400";
		professor1.telefone = "88818777";
		professor1.salario = 1500;
		professor1.disciplina = "Socioemocional";
		System.out.printf("Professor: %s %s %s %f %s", professor1.nome, professor1.cpf, professor1.telefone, professor1.salario, professor1.disciplina);
		
		Funcionario funcionario1 = new Funcionario(null, null, null);
		funcionario1.nome = "Daniel";
		funcionario1.cpf = "11111111111";
		funcionario1.telefone = "88888888";
		funcionario1.salario = 1700;
		funcionario1.cargo = "Produtor rural";
		
		System.out.printf("Funcionário: %s %s %s %f %s", funcionario1.nome, funcionario1.cpf, funcionario1.telefone, funcionario1.salario, funcionario1.cargo);
	}

}
