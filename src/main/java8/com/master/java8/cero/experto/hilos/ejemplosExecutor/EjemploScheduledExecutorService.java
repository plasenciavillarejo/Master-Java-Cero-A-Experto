package com.master.java8.cero.experto.hilos.ejemplosExecutor;

import java.sql.Time;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploScheduledExecutorService {

	public static void main(String[] args) throws InterruptedException {

		
		// tarea programada - 2 tareas
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		
		System.out.println("Simulamos alguna tarea ...");
		
		// Creamos una instacia a una cuenta regresiva
		// CountDownLatch bloqueadorThread = new CountDownLatch(5);
		
		// Utilizamos el AtomicInteger que es igual que el CountDownLatch
		AtomicInteger contador = new AtomicInteger(5);
		
		executor.scheduleAtFixedRate(() ->{
			
			
			
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
				
				// Descontamos cada vez que se ejecuta la tarea.
				//bloqueadorThread.countDown();
				
				contador.getAndDecrement();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Ejemplo de tarea programada repetitiva");
			
		// Retraso de 1 segundo y se va ejecutando cada 2 segundos.
			
		},1000,2000, TimeUnit.MILLISECONDS);
		
		 
		// Bloqueamos la tarea hasa que llegue a 0.
		//bloqueadorThread.await();
		
		while(contador.get() >= 0) {
			if(contador.get() == 0)
				contador.getAndDecrement();
		}
		
		System.out.println("Ejecutando alguna otra tarea...");
		executor.shutdown();
	}

}
