package com.master.java4.cero.experto.interfaces.modelo;

import java.util.Objects;

// Extendemos de la EntidadGenerica que contiene el ID

public class Cliente extends EntidadGenerica {
	
	private String nombre;
	private String apellido;
		

	public Cliente(String nombre, String apellido) {
		// this() invoca al constructor Cliente()
		//this();
		// Invoca la clase padre (EntidadGenerica.java)
		super();
		this.nombre = nombre;
		this.apellido = apellido;
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

	// Se utiliza para devolver los datos de listar.
	
	@Override
	public String toString() {
		return "Id= " + id + ", "
				+ "Nombre= " + nombre + ", "
				+ "Apellido= " + apellido;
	}

	// Implementamos el método equals para comparar los ID y borrarlos con el método eliminar

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	
	
}
