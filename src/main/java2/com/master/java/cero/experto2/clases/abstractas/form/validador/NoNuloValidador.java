package com.master.java.cero.experto2.clases.abstractas.form.validador;

public class NoNuloValidador extends Validador{

	protected String mensaje = "el campo no puede ser nulo";
	@Override
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
		
	}

	@Override
	public String getMensaje() {
		return mensaje;
		
	}

	/* Sí es != null devolvera true, si no false. */
	@Override
	public boolean esValido(String valor) {
		return (valor != null);
	}

}
