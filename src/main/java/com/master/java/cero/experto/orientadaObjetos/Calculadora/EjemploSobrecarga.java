package com.master.java.cero.experto.orientadaObjetos.Calculadora;

public class EjemploSobrecarga {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Sumar Enteros: " + calculadora.sumar(4, 5));
		System.out.println("Sumar Float: " + calculadora.sumar(10.0F, 4F));
		System.out.println("Sumar Double: " + calculadora.sumar(10.5, 4));

	}

}
