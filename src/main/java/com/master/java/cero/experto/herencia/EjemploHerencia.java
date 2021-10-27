package com.master.java.cero.experto.herencia;

public class EjemploHerencia {

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		
		/* Accedemos a los métodos de persona (Herencia) */
		alumno.setNombre("Jose");
		alumno.setApellido("Plasencia");
		
		Profesor profesor = new Profesor();
		profesor.setNombre("Lola");
		profesor.setApellido("Lelis");
		profesor.setAsignatura("Programación");
		
		
		System.out.println(alumno.getNombre() + " " + alumno.getApellido());
		System.out.println(profesor.getNombre() + " " + profesor.getApellido() + " " + profesor.getAsignatura());
		
	}

}
