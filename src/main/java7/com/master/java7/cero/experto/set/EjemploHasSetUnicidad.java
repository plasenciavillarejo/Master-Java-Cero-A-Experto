package com.master.java7.cero.experto.set;

import java.util.HashSet;
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
	}
}