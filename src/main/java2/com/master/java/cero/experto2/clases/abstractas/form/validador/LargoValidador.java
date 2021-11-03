package com.master.java.cero.experto2.clases.abstractas.form.validador;

public class LargoValidador extends Validador{

	protected String mensaje = "El campo debe tener como mínimo %d caracteres y máximo %d caracteres";
	private int min;
	private int max = Integer.MAX_VALUE;
	
	@Override
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
		
	}

	public LargoValidador() {
		
	}
	
	public LargoValidador(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public void setMin(int min) {
		this.min = min;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public String getMensaje() {
		return mensaje;
	}

	@Override
	public boolean esValido(String valor) {
		this.mensaje = String.format(this.mensaje, this.min,this.max);
		if(valor == null) {
			return true;
		}
		int largo = valor.length();
		return (largo >= this.min && largo <= this.max);
	}

}
