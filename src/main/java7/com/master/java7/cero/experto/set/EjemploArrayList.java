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

public class EjemploArrayList {

	public static void main(String[] args) {
	
		List<Alumno> alumnoLista = new ArrayList<Alumno>();

		alumnoLista.add(new Alumno("Jose", 5));
		alumnoLista.add(new Alumno("Mariano", 8));
		alumnoLista.add(new Alumno("Rosa", 7));
		alumnoLista.add(new Alumno("Poseidon", 4));
		alumnoLista.add(new Alumno("Omar", 10));
		alumnoLista.add(new Alumno("Omar", 10));
		
		
		System.out.println(" =========================================================");
		System.out.println(" Podemos borrar una listar por indice o por instancia remover(). \n"
				+ " Se utiliza el metodo equal() implementando en la clase Alumno(Línea 63) ");
		System.out.println(" ========================================================= \n");
		
		System.out.println(" Si borramos por instancia debe indicarse tal cual como está indicada: \n"
				+ "alumnoLista.remove(new Alumno(\"Mariano\",8)) \n");
		alumnoLista.remove(new Alumno("Mariano",8));
		
		System.out.println(alumnoLista);
		
		
		
		System.out.println(" =========================================================");
		System.out.println(" Validando si existe un alumno utilizando Contains()");
		System.out.println(" ========================================================= \n");
		
		boolean existe = alumnoLista.contains(new Alumno("Mariano", 8));
		System.out.println("¿ Existe el alumno Mariano ? " + existe + "\n");
		
		
		System.out.println(" =========================================================");
		System.out.println(" Imprimimos la lista utilizando toArray()");
		System.out.println(" ========================================================= \n");
		
		
		Object a[] = alumnoLista.toArray();
		
		for(int i=0; i <a.length; i++) {
			System.out.println("Imprimiendo la lista desde toArray():" + a[i]);
		}
		
	}
}