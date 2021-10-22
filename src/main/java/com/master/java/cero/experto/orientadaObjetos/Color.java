package com.master.java.cero.experto.orientadaObjetos;

public enum Color {
	ROJO("Rojo"),
	AMARILLO("Amarillo"),
	AZUL("Azul"),
	BLANCO("Blanco"),
	GRIS("Gris"),
	NARANJA("Naranja");

	/* Personalizamos para que no tenga el valor en mayuscula*/
	private final String color;

	private Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}	
}
