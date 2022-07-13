package com.master.java8.cero.experto.hilos.ejemplosExecutor;

import java.sql.Time;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduledExecutorServiceRepeticion {

	public static void main(String[] args) {

		
		// tarea programada - 2 tareas
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		
		System.out.println("Simulamos alguna tarea ...");
		
		executor.scheduleAtFixedRate(() ->{
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Ejemplo de tarea programada");
		},0,2,TimeUnit.MILLISECONDS);
		
		
		System.out.println("Ejecutando alguna otra tarea...");
		
		executor.shutdown();
	}

}
