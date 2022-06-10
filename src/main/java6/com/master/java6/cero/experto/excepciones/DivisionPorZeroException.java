package com.master.java6.cero.experto.excepciones;

public class DivisionPorZeroException extends Exception{

	// Creamos un método personal exception
	public DivisionPorZeroException (String mensaje) {
		super(mensaje);
	}
	
}
