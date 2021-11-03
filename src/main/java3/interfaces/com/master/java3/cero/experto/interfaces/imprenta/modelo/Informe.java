package com.master.java3.cero.experto.interfaces.imprenta.modelo;

public class Informe extends Hoja {

	private String autor;
	private String revisor;

	public Informe(String autor, String revisor, String contenido) {
		super(contenido);
		this.autor = autor;
		this.revisor = revisor;
	}

	@Override
	public String imprimir() {
		return "Informe escrito por: " + this.autor 
				+ "Revisado por: " + this.revisor
				+ "\n" + this.contenido;
	}

}
