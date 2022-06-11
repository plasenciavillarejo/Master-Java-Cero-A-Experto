package com.master.java7.cero.experto.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.master.java7.cero.experto.modelo.Alumno;

public class EjemploTreeSetComparable {

	public static void main(String[] args) {

		Set<Alumno> alumno = new TreeSet<Alumno>();
		
		try {
		alumno.add(new Alumno("Jose", 5));
		alumno.add(new Alumno("Mariano", 8));
		alumno.add(new Alumno("Rosa", 7));
		alumno.add(new Alumno("Poseidon", 4));
		alumno.add(new Alumno("Omar", 10));

		// Si imprimimos el alumno, no dará un error ya que la clase alumno no implementa la interfaz comparable, por lo que debemos de pasar por ella.
		/* Exception in thread "main" java.lang.ClassCastException: class com.master.java7.cero.experto.modelo.Alumno cannot be cast to class java.lang.Comparable 
		  (com.master.java7.cero.experto.modelo.Alumno is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap') */
		
		System.out.println(alumno);
		}catch (Exception e) {
			System.out.println("El método Alumno no puede ser utilizar con TreeSet ya que dicha clase no implementar la interfaz ComparableTo, por lo que "
					+ "nos dará un error. \n"
					+ "La solución es que la clase Alumno implemente la clase Comparable<Alumno> de este modo solventaremos el problema");
		}
		
		
		Set<Alumno> alumnoHasSet = new HashSet<Alumno>();
		alumnoHasSet.add(new Alumno("Jose", 5));
		alumnoHasSet.add(new Alumno("Mariano", 8));
		alumnoHasSet.add(new Alumno("Rosa", 7));
		alumnoHasSet.add(new Alumno("Poseidon", 4));
		alumnoHasSet.add(new Alumno("Omar", 10));
		
		System.out.println("\n ");
		System.out.println("================================================= ");
		System.out.println("================================================= ");
		System.out.println("\n ");
		System.out.println("Si lo implementarmo utilizando un HashSet<Alumno>(), es un conjunto ordeando por lo que no tendríamos ningun problema ");
		// Si lo cambiamos por Set<Alumno> alumno = new HashSet<Alumno>()- NO tenemos ningún problema
		System.out.println("\n ");
		System.out.println(alumnoHasSet);
	
		
		
		Set<Alumno> alumnoImpleComparableTo = new TreeSet<Alumno>();
		
		alumnoImpleComparableTo.add(new Alumno("Jose", 5));
		alumnoImpleComparableTo.add(new Alumno("Mariano", 8));
		alumnoImpleComparableTo.add(new Alumno("Rosa", 7));
		alumnoImpleComparableTo.add(new Alumno("Poseidon", 4));
		alumnoImpleComparableTo.add(new Alumno("Omar", 10));
		alumnoImpleComparableTo.add(new Alumno("Omar", 10));
		
		
		System.out.println("\n");
		System.out.println(" === Implementando la clase Alumno ordenando por 'NOMBRE' con comparableTo === ");
		System.out.println("     ========================================================     ");
		System.out.println(alumnoImpleComparableTo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
