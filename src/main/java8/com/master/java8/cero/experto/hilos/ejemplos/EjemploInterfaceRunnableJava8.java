package com.master.java8.cero.experto.hilos.ejemplos;

import com.master.java8.cero.experto.hilos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {

	public static void main(String[] args) {
		
		// Lo vamos a reutilizar por lo que vamos a dejarlo como una instancia anonima mediante la instancia al vuelo
	/*
		Runnable viaje = new Runnable(){
			@Override
			public void run() {
				// Desacoplamos el atributo nombre por getName(), de está forma le pasamos el nombre al ejecutar el hilo.
				for(int i=0; i<10; i++) {
					System.out.println(i + " - " + Thread.currentThread().getName());
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Finalmente me voy a ir a: " + Thread.currentThread().getName());
				
			}
			
		};
		
		new Thread(viaje,"Canada").start();
		new Thread(viaje,"Italia").start();
		new Thread(viaje,"Francia").start();
		new Thread(viaje,"Rusia").start();
		new Thread(viaje, "Alemania").start();
	}

	*/
		
		
	// Ejecutando el proceso con expresiones lambda.
	
	// Procedemos a valir el estado en el que se encuentra nuestro main.
	
	Thread principal = Thread.currentThread();
		
		
	Runnable viaje = () -> {
			for(int i=0; i<10; i++) {
				System.out.println(i + " - " + Thread.currentThread().getName());
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Finalmente me voy a ir a: " + Thread.currentThread().getName());
			
		};
	
	
	Thread v1 = new Thread(viaje,"Canada");
	Thread v2 = new Thread(viaje,"Italia");
	Thread v3 = new Thread(viaje,"Francia");
	Thread v4 = new Thread(viaje,"Rusia");
	Thread v5 = new Thread(viaje, "Alemania");
	
	v1.start();
	v2.start();
	v3.start();
	v4.start();
	v5.start();
	
	// Vamos a unir el Thread principal con el Thread de viaje 1, de está forma esperamos a que finalicen
	// todos los Threads para continuar con la ejecución.
	try {
		v1.join();
		v2.join();
		v3.join();
		v4.join();
		v5.join();
		System.out.println(principal.getState());
	} catch (InterruptedException e) {
		System.out.println("Se ha producido un error en la union de los join" + e.getMessage());
	}
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	
	System.out.println("\n==========================================================================================");
	System.out.println("==========================================================================================");
	System.out.println(" === Cuando finalizan todos los Threads de viajes se ejecuta nuestro último mensaje === \n");
	
	System.out.println("Continuando con la ejecución del método main");
	
}
	
	
	
	
}
