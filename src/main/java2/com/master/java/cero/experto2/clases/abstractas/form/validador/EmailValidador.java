package com.master.java.cero.experto2.clases.abstractas.form.validador;

public class EmailValidador extends Validador{

	protected String mensaje = "El formato de email es inválido";
	
	/* 1.- validacíon de un correo electrónico. 
	 * EXPRESIÓN REGULAR. */
	
	private final static String EMAIL_REGEX ="^(.+)@(.+)$";
	
	@Override
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;		
	}

	@Override
	public String getMensaje() {
		return mensaje;
	}

	@Override
	public boolean esValido(String valor) {
		return valor.matches(EMAIL_REGEX);
	}

}
