package com.master.java8.cero.experto.hilos.ejemplos;

import com.master.java8.cero.experto.hilos.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {

	public static void main(String[] args) {

		new Thread(new ImprimirFrases("Hola ", "que tal")).start();
		new Thread(new ImprimirFrases("¿Quíen eres ", "tú?")).start();
		new Thread(new ImprimirFrases("Muchas  ", "gracias amigo!")).start();

	}

	/* Creamos un métod estático que va a ser compartido por varios hilos con la idea de poder sincronizar,
	 de  modo que se pueda imprimir diferentes frases sin pisarse entre ellas.
	
	Para que todo este sincronizado debemos de añadir al método syncrhonize, de está forma se ejecutarán las frases
	de forma ordenada y no se mezclarán ninguna de ellas.
	*/
	
	public synchronized static void imprimirFrases(String frase1, String frase2) {
		System.out.print(frase1);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(frase2);
	}
	
	
}
