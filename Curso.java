package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aulas> aula = new ArrayList<Aulas>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public List<Aulas> getAulas() {
		return Collections.unmodifiableList(aula);
	}

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void Adiciona(Aulas aulas) {
		this.aula.add(aulas);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aulas aulas : aula) {
			tempoTotal += aulas.getTempo();
		}
		return tempoTotal;
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatricula(int numero) {
		if (!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException();}
		return matriculaParaAluno.get(numero);
		}
		
	}


