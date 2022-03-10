package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAula {

	public static void main(String[] args) {

		Aulas a1 = new Aulas("Revisitando as ArrayList", 21);
		Aulas a2 = new Aulas("Lista de objetos", 15);
		Aulas a3 = new Aulas("Relacionamento de lista e objetos", 12);
		
		ArrayList<Aulas> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
//		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
//		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aulas::getTempo));
		
	}

}
