package com.master.java.cero.experto2.clases.abstractas.form.validador;

public class NumeroValidador extends Validador{

	private String mensaje = "El campo debe ser un número";
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
		try {
			Integer.parseInt(valor);
			return true;
		}catch (NumberFormatException e) {
			return false;
		}
		
	}

}
