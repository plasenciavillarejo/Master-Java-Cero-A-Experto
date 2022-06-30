package com.master.java8.cero.experto.hilos.ejemplosExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutor {

	public static void main(String[] args) throws InterruptedException {

		/* Executor tenemos dos interfaces. Las diferencia entre ellas son: 
		  	Executor: Solo Ejecuta una tarea.
		  	ExecutorsService: Nos permite ejecuar una tarea y hacer un seguimiento de ella. Nos retorna la tarea que se está ejecutando como un objeto
		  	futuro (Future). Podemos administrarla, cancelarla, si ha finalizado, validar si está en ejecución, etc ...
		  	
		  	Se implementa diferentes clases através de la clase Executors -> Es una clase de utilidad que nos permite crear instancias con el new que 
		  	contiene diferentes impementaciones.

			La más típica es: newSingleThreadExecutor() -> Para ejecutar un solo Thread, maneja una sola instancia. Se puede ejecutar varias tareas pero 
			primero deberá de terminar una para continuar con la siguiente.
			
			Para ejecutar 5 Thread al mismo tiempo -> newFixedThreadPool el se encarga de asignar nuestras tareas a los 
			threads que estén disponibles. (Siempre maneja 5 Threads, por lo que si tenemos 10 tareas se ejecutarán primero 5 tareas al mismo tiempo  y 
			cuando vayan finalizando se iran asignado las tareas restantes a los Threads que estén disponibles)	
		  */
		
		// Tarea simple
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		// Utilizamos expresiones lambda
		Runnable tarea = () -> {
			System.out.println("Iniciamos la tarea...");

			// Esto es similaral Thread.sleep() pero está más automatizado.
			try {
				// Simulamos que estamos accediendo a BBDD y consultado algo, por esto indicamos el sleep del hilo.
				System.out.println("El nombre del usuario encontrado en BBDD es: José Plasencia Villarejo");
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// Si falla, deberemos de interrumpir la ejecución.
				Thread.currentThread().interrupt();
				
				System.out.println("Ha fallado el tiempo que se ha domido el hilo actual, se ha interrumpido la sesión.");
			}
			
			
			System.out.println("Finaliza la tarea");

			
		};
		// Ahora debemos de enviar la tarea
		executor.submit(tarea);
		
		// Apagamos el proceso una vez que finalizan todas las tareas esten ejecutandose o en cola.
		executor.shutdown();
		
		System.out.println("Continuando con la ejecución del método main 1");
		
		// Espera a que finalicen todas la tareas para continuar con la ejecución del método main o hilo principal.
		executor.awaitTermination(2, TimeUnit.SECONDS);
		
		System.out.println("Continuando con la ejecución del método main 2");
	}

}
