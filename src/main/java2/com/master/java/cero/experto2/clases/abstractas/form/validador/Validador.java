package com.master.java.cero.experto2.clases.abstractas.form.validador;

public abstract class Validador {

	/*
	 * 1.- Implementaremos un mensaje el cual las clases hijas la irán
	 * sobreescribiendo, ya que al ser una clase abstracta, cada clase podrá
	 * implementar su propia lógica usando el mismo método. Esto es POLIMORFISMO.
	 */
	protected String mensaje;

	public abstract void setMensaje(String mensaje);
	public abstract String  getMensaje();
	public abstract boolean esValido(String valor);
}
