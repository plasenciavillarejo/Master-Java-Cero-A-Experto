package com.master.java7.cero.experto.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{

	private String nombre;
	private Integer nota;

	
	// Constructor vacío.
	public Alumno() {

	}

	// Constructor incluyendo los dos campos.
	public Alumno (String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	


	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	// Generamos un toString para poder imprimir el constructor de forma más sencilla.
	@Override
	public String toString() {
		return "     Alumno [ nombre=" + nombre + ","
				+ " nota=" + nota + "] \n";
	}

	// Al implementar la clase, este método se autogenera
	@Override
	public int compareTo(Alumno a) {

		if (this.nombre == null) {
			return 0;
		}
		// Vamos a ordenar por nombre
		return this.nombre.compareTo(a.nombre);
	}


	
	/* Primero compara por el hasCode(), si detecta que son iguales, compara con el equals. Sí es igual lo quita, en caso contrario deja la comparación */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(nombre, other.nombre) && nota == other.nota;
	}
	
	// Compara por nombre y nota, si hay duplicidad solo dejará el primer valor.
	@Override
	public int hashCode() {
		return Objects.hash(nombre, nota);
	}

	
	
	
}
