package com.master.java.cero.experto2.clases.abstractas.elementos;

import java.util.ArrayList;
import java.util.List;

import com.master.java.cero.experto2.clases.abstractas.form.validador.Validador;

/* 1.- Crearemos una clase padre abstracta, en ella no se implementa ningúna lógica, solo se declara
 * 		los atributos y los nombres de las clases a ejecutar. 
 * 2.- La implementación se realizara en sus clases hijas.
 * */
public abstract class ElementoForm {
	
	protected String valor;
	protected String nombre;
	
	/* 3.- Se indica los validadores. */
	private List<Validador> validadores;
	private List<String> errores;
	
	public ElementoForm() {
		this.validadores = new ArrayList<>();
		this.errores = new ArrayList<>();
	}

	public ElementoForm(String nombre) {
		this();
		this.nombre = nombre;
	}

	/* Implementamos el add en los validadores*/
	public ElementoForm addValidador(Validador validador) {
		this.validadores.add(validador);
		return this;
	}
	
	
	
	public List<String> getErrores() {
		return errores;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public boolean esValido() {
		for(Validador v: this.validadores) {
			if(!v.esValido(this.valor)) {
				this.errores.add(v.getMensaje());
			}
		}
		return this.errores.isEmpty();
	}
	
	public abstract String dibujarHtml();
	
	
}
