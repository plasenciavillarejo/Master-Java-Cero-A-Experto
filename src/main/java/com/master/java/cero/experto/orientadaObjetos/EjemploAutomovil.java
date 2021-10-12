package com.master.java.cero.experto.orientadaObjetos;

public class EjemploAutomovil {

	public static void main(String[] args) {
		
		Automovil auto = new Automovil();

		auto.fabricante="Honda";
		auto.modelo="Rxj";
		auto.color="Negro";
		auto.cilindrada= 3.4;
		
		
		Automovil mazda = new Automovil();
		mazda.fabricante="Mazda";
		mazda.modelo="rrLletjo";
		mazda.color="Blanco";
		mazda.cilindrada= 2.5;
		
		
		
		System.out.println("auto.fabricante = " + auto.fabricante);
		System.out.println("auto.fabricante = " + auto.modelo);
		System.out.println("auto.fabricante = " + auto.color);
		System.out.println("auto.fabricante = " + auto.cilindrada);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("mazda.fabricante = " + auto.fabricante);
		System.out.println("mazda.fabricante = " + auto.modelo);
		System.out.println("mazda.fabricante = " + auto.color);
		System.out.println("mazda.fabricante = " + auto.cilindrada);
		
	}

}
