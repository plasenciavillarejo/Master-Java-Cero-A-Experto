package com.master.java.cero.experto.claseswrapper;

public class WrapperInteger {

	public static void main(String[] args) {
		
		// Se puede crear una clase int a una clase Integer mediante el wrapper
		int intPrimitivo = 32768;
		Integer intObjeto = Integer.valueOf(intPrimitivo);
		Integer intObjeto2 = 32768;
		
		// Vamos hacerlo al revez, una clase wrapper pasarlo a entero.
		// 1.- Primero forma de forma automática, coge un wrapper y lo conviete a entero.
		int numero = intObjeto;
		
		// 2.- Forma de como pasar un objeto wrapper a un int.
		int numero2 = intObjeto.intValue();
		
		// 3.- Pasar una clase String a numero entero
		
		String valor = "123";
		Integer valorEntero = Integer.valueOf(valor);
		System.out.println("valor string " + valor);
		System.out.println("Valor Entero: " + valorEntero);
		
		
		
		
	}

}
