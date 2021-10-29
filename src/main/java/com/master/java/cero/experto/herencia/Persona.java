package com.master.java.cero.experto.herencia;


/* 1.- Será nuestra clase Padre. */
public class Persona {

	/* 2.- Todo atributo de la clase padre que sea Protected, la puede leer los hijos. 
	 * protected String nombre -> La clase Alumno y Profesor puede leerla persona.getNombre() */
	
	private String nombre;
	private String apellido;
	private int edad;
	private String email;
	
	/* 1.- Constructor Vació por defecto */
	public Persona() {
		System.out.println("Persona: inicializando constructor...");
	}

	/* 2.- Constructor con 2 parámetros. */
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona(String nombre, String apellido, int edad) {
		this(nombre,apellido);
		this.edad = edad;
	}
	

	/* Generamos el método para mostrarlo por pantalla*/
	public String imprimirPersona() {
		 
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: " + this.getNombre())
			.append("\nApellido: " + this.getApellido())
			.append("\nEdad: " + this.getEdad());
	
		return sb.toString();
	}
	
	

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
