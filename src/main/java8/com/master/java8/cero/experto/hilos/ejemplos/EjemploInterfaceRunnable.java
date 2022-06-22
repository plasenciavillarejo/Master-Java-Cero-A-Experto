package com.master.java8.cero.experto.hilos.ejemplos;

import com.master.java8.cero.experto.hilos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {

	public static void main(String[] args) {
		new Thread(new ViajeTarea("Canada")).start();
		new Thread(new ViajeTarea("Italia")).start();
		new Thread(new ViajeTarea("Francia")).start();
		new Thread(new ViajeTarea("Rusia")).start();
		new Thread(new ViajeTarea("Alemania")).start();
	}

}
