package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Victor Almeida");
		alunos.add("Jordana");
		alunos.add("Nicole");
		alunos.add("Eronides");
		alunos.add("Janice");
		alunos.add("Nikolas");
		alunos.add("Victor Almeida");
		
		System.out.println(alunos.size());
		
		boolean nikasEstaMatriculado = alunos.contains("Nikolas");
		alunos.remove("Nikolas");
		System.out.println(nikasEstaMatriculado);
		
//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		System.out.println(alunos);
		
	}

}
