package br.com.alura;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es Java", "Victor Almeida");
		javaColecoes.Adiciona(new Aulas("Trabalhando com ArrayList", 15));
		javaColecoes.Adiciona(new Aulas("Criando uma aula", 20));
		javaColecoes.Adiciona(new Aulas("Modelando com cole��es", 22));

		
		
		System.out.println(javaColecoes.getAulas());
	}
}
