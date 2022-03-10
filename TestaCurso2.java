package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções Java", "Victor Almeida");
		javaColecoes.Adiciona(new Aulas("Trabalhando com ArrayList", 15));
		javaColecoes.Adiciona(new Aulas("Criando uma aula", 20));
		javaColecoes.Adiciona(new Aulas("Modelando com coleções", 22));

		
		List<Aulas> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aulas> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
	}
}
