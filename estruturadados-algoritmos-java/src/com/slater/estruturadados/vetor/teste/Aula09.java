package com.slater.estruturadados.vetor.teste;

import com.slater.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("G");
		vetor.adiciona("H");

		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		System.out.println("Remover o elemento H");
		
		int pos = vetor.busca("H");
		if (pos > -1) {
			vetor.remove(pos);
		} else {
			System.out.println("Elemento E não existe");
		}
		
		System.out.println(vetor);
		
	}

}
