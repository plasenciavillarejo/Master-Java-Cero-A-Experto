package com.master.java.cero.experto2.clases.abstractas.form.validador;

public class RequeridoValidador extends Validador{

	private String mensaje = "El campo es Requerido";
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
		return (valor != null && valor.length() > 0);
	}

}
