package com.master.java.cero.experto.orientadaObjetos;

public class EjemploAutomovilPersona {

public static void main(String[] args) {
		
	
	AutomovilPersona subaru = new AutomovilPersona("Honda", "Rxj");
		subaru.setColor(Color.BLANCO);
		subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
		subaru.setTipoAutomovil(TipoAutomovil.HATCHBACK);
		
		AutomovilPersona mazda = new AutomovilPersona("Mazda", "rrLletjo", Color.AZUL);
		mazda.setMotor(new Motor(1.5,TipoMotor.DIESEL)); 

		AutomovilPersona hyunday = new AutomovilPersona("hyunday","Quizas",Color.ROJO,
new Motor(2.4,TipoMotor.BENCINA));
		hyunday.setEstanque(new Estanque(55));

		
		AutomovilPersona cocheJose  = new AutomovilPersona("Kawasaki","RX-11",Color.BLANCO,new Motor(2.0,TipoMotor.BENCINA),
			new Estanque(10),new Persona("Jose", "Plasencia"), null);
		
		
		
		
		System.out.println(cocheJose.verDetalle());
		
		System.out.println(cocheJose.frenar());
		
		
		

	}


}
