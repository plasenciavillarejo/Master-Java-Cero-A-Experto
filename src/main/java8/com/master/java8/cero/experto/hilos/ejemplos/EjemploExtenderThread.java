package com.master.java8.cero.experto.hilos.ejemplos;

import com.master.java8.cero.experto.hilos.threads.NombreThread;

public class EjemploExtenderThread {

	public static void main(String[] args) throws InterruptedException {
		
		NombreThread hilo = new NombreThread("Jose Plasencia");
		
		
		hilo.start();

		// Podemo indicar una pausa
		//Thread.sleep(100);

		// Procedemos a crear otro hilo diferente
		NombreThread hilodos = new NombreThread("Mari Lola");
		hilodos.start();
		
		// Estado del ciclo de vida cuando se crea la intancia pero aúno no se asigna recursos.
		// Aún no se está ejecutando el thread.
		System.out.println(hilo.getState());
		
	}

}
