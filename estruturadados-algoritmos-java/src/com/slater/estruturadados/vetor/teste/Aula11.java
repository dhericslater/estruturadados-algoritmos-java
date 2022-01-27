package com.slater.estruturadados.vetor.teste;

import com.slater.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		
		// Tipo de lista genérico
		Lista<Contato> vetor = new Lista<Contato>(3);
		
		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com" );
		Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com" );
		Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com" );
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println(vetor);
		
		Lista<String> vetor1 = new Lista<String>(1);
		
		vetor1.adiciona("Dhéric Slater Moreira Ramos");
		
		System.out.println(vetor1);
	}

}
