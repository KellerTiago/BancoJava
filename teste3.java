package br.com.fiap.banco;

import java.util.ArrayList;
import java.util.HashSet;

public class teste3 {

	public static void main(String[] args) {
		
		HashSet cursos = new HashSet<>();

		cursos.add("Java");
		cursos.add(".NET");
		cursos.add("Android");

		cursos.add("Keller"); //Repetido!

		//Imprime todos os elementos
		System.out.println(cursos);
		
		
	}

}
