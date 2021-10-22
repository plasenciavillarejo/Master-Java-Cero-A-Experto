package com.master.java.cero.experto.orientadaObjetos;

import java.awt.Color;

public class EjemploAutomovilAtributosEstaticos {

	public static void main(String[] args) {
		
		AutomovilAtributosEstaticos subaru = new AutomovilAtributosEstaticos("Honda", "Rxj");
		subaru.setColor("Negro");
		subaru.setCilindrada(3.4);

		AutomovilAtributosEstaticos mazda = new AutomovilAtributosEstaticos("Mazda", "rrLletjo", "Blanco");
		mazda.setCilindrada(2.5);

		AutomovilAtributosEstaticos hyunday = new AutomovilAtributosEstaticos("hyunday","Negro","Quizas",3.5,50);

		/* 1.- Cuando imprimimos el método veremos que el valor por defecto en patenteColor es "Naranja" */
		
		System.out.println(subaru.verDetalle());
		
		
		/* Ahora vamos a cambiar el Color */
		
		System.out.println("");
		System.out.println(subaru.verDetalle());
		System.out.println("");
		System.out.println(hyunday.verDetalle());
		
		/* Para cambiarlo a todos por igual la forma más correcta es hacerlo mediante el método set().*/ 
		System.out.println("");
		System.out.println("");
		AutomovilAtributosEstaticos.setColorPatente("Cambia de Color mediante el métod set -> NEGRO");
		System.out.println("");
		System.out.println(mazda.verDetalle());
		
	}

	}
