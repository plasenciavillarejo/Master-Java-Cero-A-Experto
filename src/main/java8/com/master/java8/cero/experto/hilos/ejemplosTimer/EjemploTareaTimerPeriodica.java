package com.master.java8.cero.experto.hilos.ejemplosTimer;


import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploTareaTimerPeriodica {

	public static void main(String[] args) {

		// Creamos un scheduler con un retraso de 5 segundos.
		Timer timer = new Timer();

		// Para poder pasarle un contador desde fuera deberemos de utilizar la clase AtomiInteger.
		AtomicInteger contadorAtomic = new AtomicInteger(3);
		
		// Se indica el beep de windows.
		//Toolkit toolkit = new Toolkit.getDefaultToolkit();
		
		timer.schedule(new TimerTask() {
			// Variable local para poder pasarle el contador, se sustituye por AtomicInteger
			//int contador = 3;

			Date date = new Date();
			SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
			String fechaFormateada = formato.format(date);

			@Override
			public void run() {
				
				int decrementarContador = contadorAtomic.getAndDecrement();
				if (decrementarContador > 0) {
					
					//toolkit.beep();
					System.out.println("Tarea " + decrementarContador + " periódica ejecutada el día: " + fechaFormateada + ", nombre del Hilo (Thread): "
							+ Thread.currentThread().getName());
					
					//contadorAtomic--;
				} else {
					System.out.println("Finaliza la tarea.");
				timer.cancel();
				}

			}
			/*
			  Para indicar que la tarea se repita debemos de indicar un tercer parámetro
			  para indicar cada cuanto tiempo queremos que se ejecute (20 sec, 2 mint, 3
			 días, etc... )
			 (TiempoRetardo, TiempoRepeticion) -> (0,1) Se ejcuta directamente.
			 */
		//}, 0, 1);
		}, 0, 10000);	
		System.out.println("Retrasamos la tarea inicial en 5 segundos ...");
	}

}
