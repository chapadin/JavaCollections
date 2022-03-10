package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções Java", "Victor Almeida");

		javaColecoes.Adiciona(new Aulas("Trabalhando com ArrayList", 15));
		javaColecoes.Adiciona(new Aulas("Criando uma aula", 20));
		javaColecoes.Adiciona(new Aulas("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Victor Almeida", 123 );
		Aluno a2 = new Aluno("Jordana", 456);
		Aluno a3 = new Aluno("Nicole", 789);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno com matricula 456?");
		Aluno aluno = javaColecoes.buscaMatricula(4567);
		System.out.println("aluno: " + aluno);
		
	}

}
