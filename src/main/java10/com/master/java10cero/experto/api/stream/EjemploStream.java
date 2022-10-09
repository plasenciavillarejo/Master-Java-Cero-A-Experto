package com.master.java10cero.experto.api.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class EjemploStream {

	public static void main(String[] args) {

		// 1ª Forma de imprimir un Stream.
		Stream<String> nombres = Stream.of("Pato","Paco","Pobre","Pepa");
		nombres.forEach(System.out::println);
		
		
		// 2ª Forma de imprimir un Stream.
		String [] arreglo = {"Pato","Paco","Pobre","Pepa"};
		Stream<String> nombres2 = Arrays.stream(arreglo);
		
		
	}

}
