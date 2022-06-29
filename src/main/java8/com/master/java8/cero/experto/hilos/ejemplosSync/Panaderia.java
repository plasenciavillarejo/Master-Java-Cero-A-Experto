package com.master.java8.cero.experto.hilos.ejemplosSync;

public class Panaderia {

	private String pan;
	private boolean disponible;
	
	public synchronized void hornera(String masa) {
		
		// Esperar que el consumidor haya comido el pan para que el panadera pueda hacer más pan
		
		while(disponible) {
			try {
				// Realizamos una espera si ya tenemos el pan horneado.
				wait();
			} catch (Exception e) {
			
			}
		}
		
		this.pan = masa;
		System.out.println("Panadero hornea: " + this.pan);
		this.disponible = true;
		
		// Aviamos al cliente de que el pan puede ya ser consumido
		notify();
		
	}
	
	public synchronized String consumir() {
	
		// Mientras el pan no esté disponible debemos de esperar a que el panadero lo fabrique
		while(!disponible){
			try {
				wait();
			} catch (Exception e) {
				System.out.println("Error");
			}
		}
		System.out.print("Cliente se consume el " + this.pan  + "\n\n");
		
		// Notificamos al panadero.
		this.disponible = false;
		notify();
		
		return pan;
	}
	
}
