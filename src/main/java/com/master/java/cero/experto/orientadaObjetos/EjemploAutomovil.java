package com.master.java.cero.experto.orientadaObjetos;

public class EjemploAutomovil {

	public static void main(String[] args) {
		
		Automovil subaru = new Automovil();
		subaru.setFabricante("Honda");
		subaru.setModelo("Rxj");
		subaru.setColor("Negro");
		subaru.setCilindrada(3.4);
		
		
		Automovil mazda = new Automovil();
		mazda.setFabricante("Mazda");
		mazda.setModelo("rrLletjo");
		mazda.setColor("Blanco");
		mazda.setCilindrada(2.5);
		
		
		/* 1.- Ahora llamamos a la clase detalle dentro de "Automovil" la cual nos imprimira la información.*/
		System.out.println(subaru.verDetalle());
		System.out.println("");
//		System.out.println(mazda.verDetalle());
		
		/* 2.- Llamamos al segundo método creado. */
		System.out.println("");
		System.out.println(subaru.acelerar(1500));
		System.out.println(subaru.frenar());
		
		
		/* 3.- Llamamos a los 2 métods juntos dentro de la misma clase. */
		System.out.println("");
		System.out.println(subaru.acelerarFrenar(4500));
		
		
		/* 4.- Llamamos clase calcularConsumo con float*/
		System.out.println("");
		System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.6f));
		
		
		/* 4.- Llamamos clase calcularConsumo con int*/
		System.out.println("");
		System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 60));
		
	}

}
