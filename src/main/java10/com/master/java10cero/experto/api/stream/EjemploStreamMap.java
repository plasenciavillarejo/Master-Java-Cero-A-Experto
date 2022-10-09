package com.master.java10cero.experto.api.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {

	public static void main(String[] args) {
	
		/*
		 1.- El operador map transforma los datos que contenga la variable nombres y los devuelve.
		
		Stream<String> nombres = Stream.of("Pato","Paco","Pobre","Pepa")
				.map(String::toUpperCase)
				.peek(System.out::println)
				.map(String::toLowerCase);
				
		nombres.forEach(System.out::println);
	
		2.- Pasamos el Stream a una lista
		
		List<String> lista = nombres.collect(Collectors.toList());
		
		*/
		
		// 3.- Ahora vamos acceder a una clase Usuario y vamos a retornar su nombre y apellido
		/*
		Stream<String> nombres = Stream.of("Pato","Paco","Pobre","Pepa")
				.map(nombre -> new Usuario(nombre,null))
				.peek(System.out::println)
				.map(usuario ->{
					return usuario.get
				});
		*/
		
		
		
	}	
}
