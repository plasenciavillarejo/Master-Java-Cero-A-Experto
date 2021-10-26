package com.master.java.cero.experto.orientadaObjetos.Enum;

import com.master.java.cero.experto.orientadaObjetos.Color;
import com.master.java.cero.experto.orientadaObjetos.TipoAutomovil;
import com.master.java.cero.experto.orientadaObjetos.TipoMotor;

public class EjemploAutomovilPersona {

public static void main(String[] args) {
		
/* 1.- Cuando no hemos creado un constructor en AutomovilPersona - debemos de crearlo de está forma, 
 * seteando los campos uno a uno. */
	Estanque subaruEstanque = new Estanque();
	Persona subaruPersona = new Persona("Jose", "plasencia");
	Rueda subaruRueda = new Rueda("Pirelli", 154 , 165);
	
	AutomovilPersona subaru = new AutomovilPersona();
		subaru.setPersona(subaruPersona);
		subaru.setFabricante("Subaru");
		subaru.setModelo("X14JR");
		subaru.setTipoAutomovil(TipoAutomovil.HATCHBACK);
		subaru.setColor(Color.BLANCO);
		subaru.setColorPatente(Color.ROJO);
		subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
		subaruEstanque.setCapacidad(45);
		subaru.setEstanque(subaruEstanque);
		subaru.setRuedas(subaruRueda);
		
		
/* 2.- Creo instancia solo con 2 campos(Fabricante y Modelo) inicializados. */	
		Motor mazdaMotor = new Motor();
		Estanque mazdaEstanque = new Estanque();
		Persona mazdaPersona = new Persona("Mari Lola","López");	
	/* Creamos un Array de Ruedas de otra forma.*/
		Rueda[] ruedasMazda = new Rueda[5];
		ruedasMazda[0] = new Rueda("Michelin",15,7.5);
		ruedasMazda[1] = new Rueda("Yamaha",12,7.5);
		ruedasMazda[2] = new Rueda("Silverstone",21,7.5);
		ruedasMazda[3] = new Rueda("Estrella",20,7.5);
		ruedasMazda[4] = new Rueda("Good Year",10 ,8.9);
		
		AutomovilPersona mazda = new AutomovilPersona("Mazda", "Rx-J43");
		mazda.setPersona(mazdaPersona);
		mazda.setTipoAutomovil(TipoAutomovil.COUPE);
		mazda.setColor(Color.AMARILLO);	
		//mazda.setMotor(new Motor(1.5,TipoMotor.DIESEL));
		mazdaMotor.setTipo(TipoMotor.DIESEL);
		mazdaMotor.setCilindrada(2.7);
		mazda.setMotor(mazdaMotor);
		mazda.setEstanque(mazdaEstanque);
		mazda.setRuedas(ruedasMazda[0]);
		

		
/* 3.- Creo instancia con 4 campos inicializados los demás seteados. */
		Motor hyundayMotor = new Motor(3.5,TipoMotor.DIESEL);
		Rueda[] ruedasHyunday = {new Rueda("Michelin",15,18),
				new Rueda("Pegaso",15,18),
				new Rueda("Volandreras",15,18),
				new Rueda("Pimpollo",15,18),};
		
		AutomovilPersona hyunday = new AutomovilPersona("Hyunday","I30",Color.AMARILLO,hyundayMotor);
		hyunday.setTipoAutomovil(TipoAutomovil.CONVERTIBLE);
		hyunday.setEstanque(new Estanque());
		hyunday.setRuedas(ruedasHyunday[3]);
				
		
		System.out.println("Constructor sin Inicialización: \n" + subaru.verDetalle());				
		System.out.println("");
		System.out.println("#-------------------------------#");
		System.out.println("");
		System.out.println("Constructor con 2 campos Inicializados: \n" + mazda.verDetalle());
		System.out.println("#-------------------------------#");
		System.out.println("");
		System.out.println("Constructor con 4 campos Inicializados: \n" + hyunday.verDetalle());
		
		
		
		
		
	}


}
