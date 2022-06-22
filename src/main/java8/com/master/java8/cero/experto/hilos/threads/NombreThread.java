package com.master.java8.cero.experto.hilos.threads;

public class NombreThread extends Thread{

	// Para personalizar el thread debemos de sobreescribir el constructor.
	
	public NombreThread(String name) {
		super(name);
	}
	
	// Debemos sobrescribir el metod Run
	@Override
	public void run() {
		System.out.println("Se inicia el método run del hilo " + getName());
		
		for(int i=0; i<10; i++){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.getName());
		}
		System.out.println("Finaliza el thread");
	}



	
	 
	 
}
