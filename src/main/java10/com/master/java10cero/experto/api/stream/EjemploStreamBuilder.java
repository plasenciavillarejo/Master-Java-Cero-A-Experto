package com.master.java10cero.experto.api.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamBuilder {

	public static void main(String[] args) {
		
		System.out.println("### Creación de Un stream builder ###");
		System.out.println("#####################################");
		System.out.println("");
		
		Stream<String> nombres = Stream.<String>builder()
				.add("Jose")
				.add("Pepe")
				.add("mariano").build();
		
		
		nombres.forEach(System.out::println);
		
		System.out.println("");
		System.out.println("### Creación de un stream a partir de una lista o colección. ###");
		System.out.println("################################################################");
		System.out.println("");
		// Crear un Stream a partir de un tipo Collection. A partir de una lista le pasamos el stream() convertimos una "Lista o Colección" a un stream
		
		List<String> lista = new ArrayList<>();
		lista.add("Jose");
		lista.add("Manolos");
		lista.add("Mariano");
		
		Stream<String> listaNombres = lista.stream();
		
		listaNombres.forEach(System.out::println);
		
	}

}
