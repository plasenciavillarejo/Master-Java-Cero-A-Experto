package com.master.java.cero.experto2.clases.abstractas.elementos;

public class InputForm extends ElementoForm{

	/* 1.- Nos permite indicar el tipo del inputForm (text,form,area...)*/
	private String tipo = "text";
	
	
	public InputForm(String nombre) {
		super(nombre);
	}

	public InputForm(String nombre, String tipo) {
		this(nombre);
		this.tipo = tipo;
	}	
	

	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String dibujarHtml() {
		return "<input type='" + this.tipo + 
				"' name='" + this.nombre +
				"' value=' " + this.valor +" '>";
	}

}
