package com.master.java.cero.experto.herencia;


/* 1.- Será nuestra clase Padre. */
public class Persona {

	/* 2.- Todo atributo de la clase padre que sea Protected, la puede leer los hijos. 
	 * protected String nombre -> La clase Alumno y Profesor puede leerla persona.getNombre() */
	
	private String nombre;
	private String apellido;
	private int edad;
	private String email;
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
