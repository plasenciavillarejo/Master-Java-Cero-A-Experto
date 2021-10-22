package com.master.java.cero.experto.orientadaObjetos;

public class EjemploAutomovilConstantesFinales {

public static void main(String[] args) {
		
	AutomovilConstantesFinales subaru = new AutomovilConstantesFinales("Honda", "Rxj");
		subaru.setColor("Negro");
		subaru.setCilindrada(3.4);

		AutomovilConstantesFinales mazda = new AutomovilConstantesFinales("Mazda", "rrLletjo", "Blanco");
		mazda.setCilindrada(2.5);

		AutomovilConstantesFinales hyunday = new AutomovilConstantesFinales("hyunday","Negro","Quizas",3.5,50);

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
		
		
		/* Imprimimos las variables estaticas finales */
		System.out.println("Velocidad estatica final en carretera : " + AutomovilConstantesFinales.VELOCIDAC_MAXIMA_CARRETERA);
		System.out.print("Velocidad estatica final en ciudad: " + AutomovilConstantesFinales.VELOCIDAD_MAXIMA_CIUDAD);
		
	}


}
