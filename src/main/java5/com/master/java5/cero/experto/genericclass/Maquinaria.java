package com.master.java5.cero.experto.genericclass;

public class Maquinaria {

	private String tipo;

	public Maquinaria(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Maquinaria [tipo=" + tipo + "]";
	}
	
	
	
	
}
