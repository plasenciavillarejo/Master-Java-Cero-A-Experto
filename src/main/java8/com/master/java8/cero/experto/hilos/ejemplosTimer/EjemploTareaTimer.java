package com.master.java8.cero.experto.hilos.ejemplosTimer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploTareaTimer {

	public static void main(String[] args) {

		// Creamos un scheduler con un retraso de 5 segundos.
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			Date date = new Date();
			SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
			String fechaFormateada = formato.format(date);
			
			@Override
			public void run() {
				System.out.println("Tarea realizada el día: " + fechaFormateada + ", nombre del Hilo (Thread): " +
			Thread.currentThread().getName());
			System.out.println("Finaliza la tarea.");
			
			// Si no se ejecuta más, se cierra el timer;
			timer.cancel();
			}
		}, 5000);
		
		System.out.println("Retrasamos la tarea inicial 5 segundos ...");
	}

}
