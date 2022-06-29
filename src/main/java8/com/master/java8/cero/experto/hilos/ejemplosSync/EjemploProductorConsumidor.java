package com.master.java8.cero.experto.hilos.ejemplosSync;

import com.master.java8.cero.experto.hilos.runnableSync.Cliente;
import com.master.java8.cero.experto.hilos.runnableSync.Panadero;

public class EjemploProductorConsumidor {

	public static void main(String[] args) {
		Panaderia p = new Panaderia();
		
		new Thread(new Panadero(p)).start();
		new Thread(new Cliente(p)).start();
	}

}
