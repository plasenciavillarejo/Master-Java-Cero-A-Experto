package com.master.java8.cero.experto.hilos.ejemplosExecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class EjemploExecutorFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// Tarea simple
		ExecutorService executor = Executors.newSingleThreadExecutor();

		// Utilizamos expresiones lambda
		Runnable tarea = () -> {
			System.out.println("Iniciamos la tarea...");

			// Esto es similaral Thread.sleep() pero está más automatizado.
			try {
				// Simulamos que estamos accediendo a BBDD y consultado algo, por esto indicamos
				// el sleep del hilo.
				System.out.println("El nombre del usuario encontrado en BBDD es: José Plasencia Villarejo");
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// Si falla, deberemos de interrumpir la ejecución.
				Thread.currentThread().interrupt();

				System.out
						.println("Ha fallado el tiempo que se ha domido el hilo actual, se ha interrumpido la sesión.");
			}

			System.out.println("Finaliza la tarea");

		};
		// Vamos obtener la tarea Futura
		Future<?> resultado =  executor.submit(tarea);

		// Apagamos el proceso una vez que finalizan todas las tareas esten ejecutandose o en cola.
		executor.shutdown();

		System.out.println("Continuando con la ejecución del método main");
		
		// Indica si ha terminado la tarea.
		System.out.println(resultado.isDone());
		
		// El get() devuelve el thread actual, si hay una tarea en ejecución antes, espera a que finalice para iniciar luego la sigiuente tarea. 
		System.out.println(resultado.get());
		System.out.println("Continuamos .....");
	}

}
