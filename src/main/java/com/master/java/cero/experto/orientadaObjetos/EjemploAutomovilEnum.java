package com.master.java.cero.experto.orientadaObjetos;

public class EjemploAutomovilEnum {

public static void main(String[] args) {
		
	
	AutomovilConstantesFinales subaru = new AutomovilConstantesFinales("Subaru", "Rxj");
		subaru.setColor(Color.BLANCO);
		subaru.setCilindrada(3.4);

	// Añadimos Constantes para TipoAutomovil.java
		subaru.setTipoAutomovil(TipoAutomovil.HATCHBACK);
		
		AutomovilConstantesFinales mazda = new AutomovilConstantesFinales("Mazda", "rrLletjo", Color.AZUL);
		mazda.setCilindrada(2.5);

		AutomovilConstantesFinales hyunday = new AutomovilConstantesFinales("hyunday","Quizas",Color.ROJO,3.5,50);
		
		TipoAutomovil tipo = subaru.getTipoAutomovil();
		System.out.println("Tipo Subaru:  " + tipo.getNombre());
		
		// Usando switch nos indicara que tipo de automóvil es.
		
		switch(tipo) {
		case CONVERTIBLE:
			System.out.println("El automovil es deportivo  y descapotable de dos puertas");
			break;
		case COUPE:
			System.out.println("El automovil es pequeño y de dos puertas");
			break;
		case FURGON:
			System.out.println("El automovil utilitario de transporte, de empresas");
			break;
		case HATCHBACK:
			System.out.println("El automovil es mediano compacto, aspecto deportivo");
			break;
		case PICKUP:
			System.out.println("El automovil mediano y deportivo");
			break;
		case SEDAN:
			System.out.println("El automovil normal y corriente");
			break;
		case STATION_WAGON:
			System.out.println("El automovil más grande, con maletero grande...");
			break;
		}
		
	// Iterando los Enumerados.
		TipoAutomovil[] tipos =  TipoAutomovil.values();
		for(TipoAutomovil ta: tipos) {
			System.out.println(ta + " => "  
					+ ta.getNombre() + " , "
					+ ta.getDescripcion() + " , "
					+ ta.getNumeroPuerta());
		}

		
		

		
		
		
	}


}
