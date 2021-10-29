package com.master.java.cero.experto2.clases.abstractas.elementos;


/* 1.- Crearemos una clase padre abstracta, en ella no se implementa ningúna lógica, solo se declara
 * 		los atributos y los nombres de las clases a ejecutar. 
 * 2.- La implementación se realizara en sus clases hijas.
 * */
public abstract class ElementoForm {
	
	protected String valor;
	protected String nombre;
	

	public ElementoForm() {
	}

	public ElementoForm(String nombre) {
		this();
		this.nombre = nombre;
	}

	
	public void setValor(String valor) {
		this.valor = valor;
	}

	public abstract String dibujarHtml();
	
	
}
