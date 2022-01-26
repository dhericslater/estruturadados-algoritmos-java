package com.slater.estruturadados.vetor.teste;

import com.slater.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(11);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("G");
		vetor.adiciona("H");

		System.out.println(vetor);

		vetor.adiciona(0, "A");

		System.out.println(vetor);
		
		vetor.adiciona(4, "E");

		System.out.println(vetor);

		vetor.adiciona(5, "F");

		System.out.println(vetor);
		
		vetor.adiciona("J");

		System.out.println(vetor);
		
		vetor.adiciona(8, "I");
		
		System.out.println(vetor);
	}

}
