package com.master.java7.cero.experto.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.master.java7.cero.experto.modelo.Alumno;

public class EjemploListComparableAndComparator {

	public static void main(String[] args) {
	
		// Si implementamos una lista, podemos imprimir el array utilizando un for clásico
		List<Alumno> alumnoLista = new ArrayList<Alumno>();

		alumnoLista.add(new Alumno("Jose", 5));
		alumnoLista.add(new Alumno("Mariano", 8));
		alumnoLista.add(new Alumno("Rosa", 7));
		alumnoLista.add(new Alumno("Poseidon", 4));
		alumnoLista.add(new Alumno("Omar", 10));
		alumnoLista.add(new Alumno("Omar", 10));
		
		
		System.out.println(" =========================================================");
		System.out.println(" === Implementamos una Lista en vez de un Set. === ");
		System.out.println(" ========================================================= \n");
		
		System.out.println(" === Imprimiendo la lista utilizando un for clásico === ");
		for(int i =0; i <alumnoLista.size(); i++) {
			Alumno alumnoForClasico = alumnoLista.get(i);
			System.out.println(alumnoForClasico);
		}
				
		
		System.out.println(" =========================================================");
		System.out.println(" === Implementamos una ordenación utilizando una clase helper (Collection). === ");
		System.out.println(" === Se ordena por el 'NOMBRE' ya que se realiza mediante el CompareTo implementado en la clase Alumno(Línea 47) === ");
		System.out.println(" ========================================================= \n");
		
		Collections.sort(alumnoLista);
		
		System.out.println(alumnoLista);
		
		
		
		System.out.println(" =========================================================");
		System.out.println(" === Implementamos una ordenación utilizando una clase helper (Collection). === ");
		System.out.println(" === Se ordena por la nota sobreescribiendo el compareto utilizando la Collections(alumnoLista2, CompareTo) === ");
		System.out.println(" ========================================================= \n");

		
		List<Alumno> alumno2 = alumnoLista;
		
		// Si queremos sobrescribir el compareto que hay en Alumno podemos hacerlo desde la Collections ya que implementa una sobrecarga
		Collections.sort(alumnoLista, (a,b) -> a.getNota().compareTo(b.getNota()));
		
		System.out.println(alumno2);
		

		
		System.out.println(" =========================================================");
		System.out.println(" === Implementamos sort mediante el alumnoLista.sort() === ");
		System.out.println(" ========================================================= \n");
		
		List<Alumno> alumnoLista3 = alumnoLista;
		
		alumnoLista3.sort((a,b) -> a.getNota().compareTo(b.getNota()));
		System.out.println(alumnoLista3);
		
		System.out.println(" =========================================================");
		System.out.println(" === Implementamos sort mediante el método Comparator de JAVA 8 === ");
		System.out.println(" === Por defecto se ordena de forma ASCENDENTE, de lo contrario podemos invocar el método Reverse() === ");
		System.out.println(" ========================================================= \n");
		
		List<Alumno> alumnoLista4Ascendente = alumnoLista;
		List<Alumno> alumnoLista4Descendente = alumnoLista;
		
		alumnoLista4Ascendente.sort(Comparator.comparing((Alumno a) -> a.getNombre()));
		alumnoLista4Descendente.sort(Comparator.comparing((Alumno a) -> a.getNombre()).reversed());
		
		System.out.println("Forma Ascendente: \n" + alumnoLista4Ascendente);
		System.out.println("Forma Descendente: \n" + alumnoLista4Descendente);
	}
}