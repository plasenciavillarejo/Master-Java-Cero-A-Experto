package com.master.java5.cero.experto.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicados {

	public static void main(String[] args) {
		String[] peces = {"Corvina", "Lenguado","Pejerrey","Robalo","Atun","Lenguado"};
		
		// Vamos a detectar duplicado en el array de string insertado
		
		Set<String> unicos = new HashSet<String>();
		
		for(String aniadir: peces) {
			// Al devolver un boolean, sabremos si está duplicado o no.
			if(!unicos.add(aniadir)) {
				System.out.println("Elemento duplicado: " + aniadir);
			}
		}
		System.out.println("Los elementos que contiene la lista son los siguientes: " + unicos);
		System.out.println("Contiene un total de: " + unicos.size());
	}
	
}
