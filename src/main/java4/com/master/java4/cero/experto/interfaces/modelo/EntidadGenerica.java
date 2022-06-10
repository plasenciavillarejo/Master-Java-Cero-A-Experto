package com.master.java4.cero.experto.interfaces.modelo;

public class EntidadGenerica {

	// Creamos una clase genérica para poder buscar el id del cliente.
	// Nota: Todos los atribtuso que se quiera reutilizar de forma genérica deberá de estár indicado aquí y la clase Cliente deberá de extender de está clase.
	
	protected Integer id;
	
	// Este es solo private por que solo se va a utilizar en está clase.
	private static int ultimoId;
	
	public EntidadGenerica() {
		this.id = ++ultimoId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	 
	
}
