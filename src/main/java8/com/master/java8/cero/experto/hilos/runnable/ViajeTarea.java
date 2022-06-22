package com.master.java8.cero.experto.hilos.runnable;

public class ViajeTarea implements Runnable {

	private String nombre;
	
	
	// La gran diferencia entre Thread y Runnable está mucho más desacoplado y nos permite además heredar
	// de cualquier otra clase por lo que no nos obliga a la implementación de un THREAD.
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println(i + " - " + nombre);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finalmente me voy a ir a: " + nombre);
	}

	// Constructor
	public ViajeTarea(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	
	
}
