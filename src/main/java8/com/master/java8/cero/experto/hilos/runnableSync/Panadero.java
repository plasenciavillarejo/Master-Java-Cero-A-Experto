package com.master.java8.cero.experto.hilos.runnableSync;

import java.util.concurrent.ThreadLocalRandom;

import com.master.java8.cero.experto.hilos.ejemplosSync.Panaderia;

public class Panadero implements Runnable{

	private Panaderia panaderia;
	
	// Creamos el constructor que es igual que si creamos los get() and Set().
		public Panadero(Panaderia panaderia) {
			this.panaderia = panaderia;
		}
	
	@Override
	public void run() {

		for(int i =0; i<10; i++) {
			panaderia.hornera("Pan n:" + i);
			try {
				Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	

}
