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
	
	
	new Thread(viaje,"Canada").start();
	new Thread(viaje,"Italia").start();
	new Thread(viaje,"Francia").start();
	new Thread(viaje,"Rusia").start();
	new Thread(viaje, "Alemania").start();
}
	
	
	
	
}
