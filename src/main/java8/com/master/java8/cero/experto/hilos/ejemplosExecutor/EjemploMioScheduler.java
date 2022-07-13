package com.master.java8.cero.experto.hilos.ejemplosExecutor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploMioScheduler {

	public static void main(String[] args) {

		
		System.out.println("Ejecutando una tarea de prueba...");

		// tarea programada - 2 tareas
		// ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		executor.scheduleAtFixedRate(() -> {
			Date date = new Date();
			SimpleDateFormat formato = new SimpleDateFormat("HH:mm:SS");
			String fechaFormateada = formato.format(date);
			System.out.println("Ejecutando el proceso cada: " + fechaFormateada);

			System.out.println("Ejemplo de tarea programada");
		},0,1, TimeUnit.MINUTES);

		//System.out.println("Ejecutando alguna otra tarea...");

		//executor.shutdown();
		
		
		
		
		
		/*
		String cronExpression = "0/5 * * * * *";
		ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
		
		scheduler.initialize();
		scheduler.setPoolSize(1);
		
		scheduler.schedule(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello Date:" + new Date());
			}
		}, new CronTrigger(cronExpression));
	*/
	}

}
