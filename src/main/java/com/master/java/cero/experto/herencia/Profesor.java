package com.master.java.cero.experto.herencia;

/* 1.- Profesor es clase Hija (extends) de Persona*/
public class Profesor extends Persona{
	private String asignatura;

	public Profesor() {
		System.out.println("Profesor: Inicializando el constructor...");
	}
	
	/* Constructor que hereda los atributos del padre (Persona)*/
	public Profesor(String nombre,String apellido) {
		super(nombre,apellido);
	}
	
	/* Constructor implementado atributos de la clase + atributo propio de profesor (asignatura)*/
	public Profesor(String nombre, String apellido, String asignatura) {
		this(nombre,apellido);
		this.asignatura = asignatura;
	}
	
	
	
	
	
	
	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	
	
}
