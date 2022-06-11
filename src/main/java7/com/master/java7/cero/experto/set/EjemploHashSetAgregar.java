package com.master.java7.cero.experto.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjemploHashSetAgregar {

	public static void main(String [] args){
		
		// Para agregar (add), eliminar (remove) y demás se utiliza el tipo más genérico (Set<String>..)
		// El elemento Set devuevle un booleano, true o false.
		
		Set<String> hs = new HashSet<String>();
		hs.add("uno");
		hs.add("dos");
		hs.add("tres");
		hs.add("cuatro");
		hs.add("cinco");
		
		// AL imprimir los valores, no se mantiene ordenadores si no que imprime desordenado
		System.out.println(hs);
	
		// Un elemento Set no permite elementos duplicados, para ver un ejemplo vamos añadir nuevamente el uno.
		
		boolean elementosDuplicados = hs.add("uno");
		// Si devvuelve true, si es permitido, si devuelve false, es que ya existe el elemento añadido.
		System.out.println("=== Se permite elementos duplicados: " + elementosDuplicados);
		
		
		/* Si pretendemos ordenar el Set deberemos de pasarlo a una lista, ya que no por defecto solo se puede ordenar listas 
		  Por defecto, un ArrayList<>() puede invocar por el constructur cualquier collection por lo que nuestro set puede ir dentro de el. */
		List<String> lista = new ArrayList<String>(hs);
		
		
		Collections.sort(lista);
		
		System.out.println("==========================");
		System.out.println(" ====Imprimiendo la lista ordenada ==== " + lista);
		
	}
}
