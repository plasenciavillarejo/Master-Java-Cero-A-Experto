package com.master.java8.cero.experto.hilos.ejemplosExecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class EjemploExecutorFuture2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// Se indica las tareas que se ejutarán al mismo tiempo y las restantes quedarán en espera.(newFixedThreadPool(2))
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

		System.out.println("Tamaño del Pool: " + executor.getPoolSize());
		System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());
		
		Callable<String> tarea = () -> {

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
			return "Algún resultado que se quiera obtener desde BBDD.";
		};
		
		// Creamos la tercera tarea
		Callable<Integer> tarea2 = () ->{
			System.out.println("Iniciando tarea 3 ...");
			TimeUnit.SECONDS.sleep(3);
			return 10;
		};
		
		
		// Creamos la tercera tarea
		Callable<Integer> tarea3 = () ->{
			System.out.println("Iniciando tarea 3 ...");
			TimeUnit.SECONDS.sleep(3);
			return 2022;
		};
		
		
		// Vamos obtener la tarea Futura
		Future<String> resultado =  executor.submit(tarea);
		Future<Integer> resultado2 = executor.submit(tarea2);
		Future<Integer> resultado3 = executor.submit(tarea3);
		
		// Apagamos el proceso una vez que finalizan todas las tareas esten ejecutandose o en cola.
		executor.shutdown();

		System.out.println("Continuando con la ejecución del método main");
		
		// Indica si ha terminado la tarea.
		System.out.println(resultado.isDone());
		
		// El get() devuelve el thread actual, si hay una tarea en ejecución antes, espera a que finalice para iniciar luego la sigiuente tarea. 
		System.out.println(resultado.get());
		System.out.println(resultado2.get());
		System.out.println(resultado3.get());
		System.out.println("Continuamos .....");
	
	
		while(!(resultado.isDone()) && resultado2.isDone() && resultado3.isDone()) {
			System.out.println(String.format("resultado1: %s - resultado2: %s - resultado3: %s", 
					resultado.isDone()? "finalizó" : "en proceso",
							resultado2.isDone()? "finalizó" : "en proceso",
									resultado3.isDone()? "finalizó" : "en proceso"));
		}
	
	}

}
