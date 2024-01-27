package com.master.java10cero.experto.api.stream;

import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.master.java10cero.experto.api.models.Usuario;

public class EjemploStreamAnyMatch {

	static final Logger LOOGER = LoggerFactory.getLogger(EjemploStreamAnyMatch.class);
	
	public static void main(String[] args) {
		
		
		// Ejemplo donde se utiliza el anyMatch que devuelve un booleano
		
		boolean existe = Stream.of("Plasencia Villarejo","Lopez Gutierrez","Villarejo Balbuena")
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.peek(u-> LOOGER.info("Nombres devueltos: {}", u.getNombre()))
				.anyMatch(u -> u.getNombre().equalsIgnoreCase("Balbuena"));
		
		LOOGER.info("existe el valor de retorno :{}", existe);
		
		
		// Utilizando Count
		
		long count = Stream.of("Plasencia Villarejo","Lopez Gutierrez","Villarejo Balbuena")
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.peek(u-> LOOGER.info("Nombres devueltos: {}", u.getNombre()))
				.count();
		
		LOOGER.info(" Retorno con el operador count :{}", count);
		
	}
}
