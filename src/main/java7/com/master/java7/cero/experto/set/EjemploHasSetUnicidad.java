package com.master.java7.cero.experto.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.master.java7.cero.experto.modelo.Alumno;

public class EjemploHasSetUnicidad {

	public static void main(String[] args) {

		// Con el método HashSet cada elemento es único por lo que no sucede como en el TreeSet, que si se compara por uno campo y este, está repetido, solo quedará el primer valor.

		Set<Alumno> alumno = new HashSet<Alumno>();

		alumno.add(new Alumno("Jose", 5));
		alumno.add(new Alumno("Mariano", 8));
		alumno.add(new Alumno("Rosa", 7));
		alumno.add(new Alumno("Poseidon", 4));
		alumno.add(new Alumno("Omar", 10));
		alumno.add(new Alumno("Omar", 10));
		
		System.out.println(alumno);
		
		
		/* Diferentes formas de iterar un Set*/
		System.out.println(" ===================================");
		System.out.println(" === Iterando usando un for === ");
		System.out.println(" =================================== \n");
			
		for(Alumno alum: alumno) {
			System.out.println(alum);
		}
		
		System.out.println(" ===========================================");
		System.out.println(" === Iterando usando while e iterator === ");
		System.out.println(" =========================================== \n");
		// Toda Collection tiene un método llamado Iterator.
		
		Iterator<Alumno> iterarAlumno = alumno.iterator(); 
		
		while(iterarAlumno.hasNext()) {
			Alumno a = iterarAlumno.next();
			System.out.println(a);
		}
		
		
		System.out.println(" =========================================================");
		System.out.println(" === Iterando usando foreach con expresiones lambda === ");
		System.out.println(" ========================================================= \n");
		//alumno.forEach(alumForEach -> System.out.println(alumForEach));
		alumno.forEach(System.out::println);
		
		
		// Si implementamos una lista, podemos imprimir el array utilizando un for clásico
		List<Alumno> alumnoLista = new ArrayList<Alumno>();

		alumnoLista.add(new Alumno("Jose", 5));
		alumnoLista.add(new Alumno("Mariano", 8));
		alumnoLista.add(new Alumno("Rosa", 7));
		alumnoLista.add(new Alumno("Poseidon", 4));
		alumnoLista.add(new Alumno("Omar", 10));
		alumnoLista.add(new Alumno("Omar", 10));
		
		/*============================================================================================================================================================*/
		/*============================================================================================================================================================*/
		/*============================================================================================================================================================*/
		
		System.out.println(" =========================================================");
		System.out.println(" === Implementamos una Lista en vez de un Set. === ");
		System.out.println(" ========================================================= \n");
		
		System.out.println(" === Imprimiendo la lista utilizando un for clásico === ");
		for(int i =0; i <alumnoLista.size(); i++) {
			Alumno alumnoForClasico = alumnoLista.get(i);
			System.out.println(alumnoForClasico);
		}
				
		
	}
}