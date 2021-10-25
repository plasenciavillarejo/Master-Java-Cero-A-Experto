package com.master.java.cero.experto.orientadaObjetos;

public class EjemploAutomovilConstantesFinales {

public static void main(String[] args) {
		
	
	AutomovilConstantesFinales subaru = new AutomovilConstantesFinales("Honda", "Rxj");
		subaru.setColor(Color.BLANCO);
		subaru.setCilindrada(3.4);

	// Añadimos Constantes para TipoAutomovil.java
		subaru.setTipoAutomovil(TipoAutomovil.HATCHBACK);
		
		AutomovilConstantesFinales mazda = new AutomovilConstantesFinales("Mazda", "rrLletjo", Color.AZUL);
		mazda.setCilindrada(2.5);

		AutomovilConstantesFinales hyunday = new AutomovilConstantesFinales("hyunday","Quizas",Color.ROJO,3.5,50);

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
		
		

		/* Llamando a la clase enum */
		AutomovilConstantesFinales asus = new AutomovilConstantesFinales();
		asus.setColor(Color.ROJO);
		
		
	}


}
