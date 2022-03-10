package br.com.alura;

public class TestaCursoComAluno {

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
		
		System.out.println("Todos os alunos matriculados nesse curso: ");
		javaColecoes.getAlunos().forEach(a -> { System.out.println(a);});
		
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno a4 = new Aluno("Nicole", 159);
		System.out.println(javaColecoes.estaMatriculado(a4));
		System.out.println(a4.equals(a3));
		
		

	}

}
