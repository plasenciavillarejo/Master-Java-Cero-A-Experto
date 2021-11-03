package com.master.java3.cero.experto.interfaces.imprenta.modelo;

public abstract class Hoja {

	protected String contenido;
	
	public Hoja(String contenido) {
		this.contenido = contenido;
	}
	
	public abstract String imprimir();
	
}
