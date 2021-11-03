package com.master.java.cero.experto2.clases.abstractas.form.validador;

public class ColumnasValidador extends Validador{

	protected String mensaje = "Tiene que tener mas de %d filas y más de %d columnas";
	private int filas;
	private int columnas = 10;
	
	
	public void ColumnasValidador(){
		
	}
	
	public void ColumnasValidador(int filas, int columnas){
		this.filas = filas;
		this.columnas = columnas;
	}	
	
	
	public void setFilas(int filas) {
		this.filas = filas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

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

		this.mensaje = String.format(mensaje, this.filas, this.columnas);
		if (valor == null) {
			return true;
		}
		int comprobar = valor.length();
		return (comprobar >= this.filas && comprobar <= this.columnas);
	}

}
