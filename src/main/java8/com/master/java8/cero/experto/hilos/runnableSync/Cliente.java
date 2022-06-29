package com.master.java8.cero.experto.hilos.runnableSync;

import java.util.concurrent.ThreadLocalRandom;

import com.master.java8.cero.experto.hilos.ejemplosSync.Panaderia;

public class Cliente implements Runnable{

	private Panaderia panaderia;

	
	public Cliente(Panaderia panaderia) {
		this.panaderia = panaderia;
	}


	@Override
	public void run() {

		for(int i =0; i<10; i++) {
			panaderia.consumir();
			try {
				Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
