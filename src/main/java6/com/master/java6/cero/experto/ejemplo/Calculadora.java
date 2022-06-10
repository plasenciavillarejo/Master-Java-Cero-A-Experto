package com.master.java6.cero.experto.ejemplo;

import com.master.java6.cero.experto.excepciones.DivisionPorZeroException;
import com.master.java6.cero.experto.excepciones.FormatoNumeroException;

public class Calculadora {

	/*
	 * Necesitamos indicarle throws DivisionPorZeroException a nuestro método
	 * dividir ya que estamos usando una excepción
	 */
	public double dividir(int numerador, int dividiendo) throws DivisionPorZeroException {

		// Vamos a validar para lanzar nuestra excepción personalizada.
		if (dividiendo == 0) {
			throw new DivisionPorZeroException("No se puede dividir por cero");
		}
		// Convertimos alguno de los dos en double, haciendo un cast.
		return numerador / (double) dividiendo;
	}

	public double dividir(String numerador, String divisor) throws DivisionPorZeroException, FormatoNumeroException {
		
		// Convertimos la excepción.
		
		try {

		int num = Integer.parseInt(numerador);
		int div = Integer.parseInt(divisor);
		
		// reutilizamos el método de la división
		this.dividir(num, div);
		
		return this.dividir(num,div);
		
		} catch (NumberFormatException e) {
			throw new NumberFormatException("debe ingresar un número en el numerado y divisor");
		}
		
	}

}
