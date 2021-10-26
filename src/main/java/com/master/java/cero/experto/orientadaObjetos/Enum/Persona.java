package com.master.java.cero.experto.orientadaObjetos.Enum;

public class Persona {

	private String nombre;
	private String apellido;
	
	@Override
	public String toString() {
		return nombre + " " + apellido;
	}

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	

	
}
