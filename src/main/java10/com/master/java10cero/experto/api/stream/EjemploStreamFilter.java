package com.master.java10cero.experto.api.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.master.java10cero.experto.api.models.Usuario;

public class EjemploStreamFilter {

	public static void main(String[] args) {
		
		
		Stream<Usuario> nombres = Stream
				.of("Pato moreno","Paco garcia","Pobre lola","Pepa martines", "Pepe Plasencia")
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.filter(u -> u.getNombre().equals("Pepe"))
				.peek(System.out::println);
				
		List<Usuario> lista = nombres.collect(Collectors.toList());
		lista.forEach(System.out::println);
	}

}
