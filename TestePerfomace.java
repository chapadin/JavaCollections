package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestePerfomace {

	public static void main(String[] args) {
		
		Collection<Integer> numeros = new ArrayList<Integer>();
		

		long inicio2 = System.currentTimeMillis();
		
		for (int i = 0; i < 50000; i++) {
			numeros.add(i);
		}
		
		long fim2 = System.currentTimeMillis();
		long tempoDeExecucao3 = fim2 - inicio2;
		
		System.out.println(tempoDeExecucao3);
		long inicio = System.currentTimeMillis();
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoDeExecucao = fim - inicio;
		
		System.out.println("Tempo gasto com ArrayList: " + tempoDeExecucao);
		
		Collection<Integer> inteiros = new HashSet<Integer>();
		

		long comeco2 = System.currentTimeMillis();
		
		for (int i = 0; i < 50000; i++) {
			inteiros.add(i);
		}
		long comeco = System.currentTimeMillis();
		long termino2 = System.currentTimeMillis();
		long tempoDeExecucao4 = termino2 - comeco2;
		System.out.println(tempoDeExecucao4);
		
		for (Integer inteiro : inteiros) {
			inteiros.contains(inteiro);
		}
		
		long termino = System.currentTimeMillis();
		
		long tempoDeExecucao2 = termino - comeco;
		
		System.out.println("Tempo gasto com HashSet: " + tempoDeExecucao2);
		
	}

}
