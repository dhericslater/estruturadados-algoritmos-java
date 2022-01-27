package com.slater.estruturadados.vetor.exercicios;

import com.slater.estruturadados.vetor.Lista;

public class Ex01 {

	public static void main(String[] args) {

		Lista<String> vetor = new Lista<String>(2);
		
		vetor.adiciona("A");
		vetor.adiciona("B");
		
		System.out.println(vetor.contem("A"));
		System.out.println(vetor.contem("B"));
		System.out.println(vetor.contem("C"));

	}

}
