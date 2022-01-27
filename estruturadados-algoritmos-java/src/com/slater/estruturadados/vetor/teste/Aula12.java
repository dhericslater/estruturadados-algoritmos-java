package com.slater.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("B");
		if(existe) {
			System.out.println("O objeto existe no array");
		}else {
			System.out.println("O objeto não existe no array");
		}
		
		int pos = arrayList.indexOf("D");
		if (pos > -1) {
			System.out.println("O objeto existe no array" + pos);
		}else {
			System.out.println("O objeto não existe no array " + pos);
		}
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(0);
		arrayList.remove("C");
		
		System.out.println(arrayList);
	}

}
