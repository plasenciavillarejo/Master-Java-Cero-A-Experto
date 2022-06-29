package com.master.java8.cero.experto.hilos.ejemplosTimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploAgendarTareaTimer {

	public static void main(String[] args) {

		// Creamos un scheduler con un retraso de 5 segundos.
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("Tarea realizada en: " + new Date() + " nombre del Thread" +
			Thread.currentThread().getName());
			System.out.println("Finaliza la tarea.");
			
			// Si no se ejecuta más, se cierra el timer;
			timer.cancel();
			}
		}, 5000);
		
		System.out.println("Agendamos una tarea para 5 segundos más ...");
	}

}
