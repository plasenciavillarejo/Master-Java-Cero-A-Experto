package com.master.java.cero.experto2.clases.abstractas.elementos;

public class TextAreaFor extends ElementoForm{

	/* 1.- Nos permite definir el ancho y largo de la caja de texto.*/
	private int filas;
	private int columnas;
	

	public TextAreaFor(String nombre) {
		super(nombre);
	}

	public TextAreaFor(String nombre, int filas, int columnas) {
		this(nombre);
		this.filas = filas;
		this.columnas = columnas;
		
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	@Override
	public String dibujarHtml() {
		return "<textarea name='" + this.nombre + "' "
				+ "cols=' " + this.columnas + "'"
				+ "rows=' " + this.filas + "'>" 
				+ this.valor + "</textarea>";
	}

}
