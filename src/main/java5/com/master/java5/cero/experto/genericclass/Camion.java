package com.master.java5.cero.experto.genericclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.management.RuntimeErrorException;

@SuppressWarnings("unused")

// Cualquier clase que implemente esta clase puede ser iterada forEac. Debemo de implementar el método iterator.
// Creamos el método Camion que sea genérico "T"
public class Camion<T> implements Iterable<T>{

	private List<T> objetos;
	private int max;

	public Camion(int max) {
		this.max = max;
		this.objetos = new ArrayList<>();
	}

	public void add(T objeto) {
		if (this.objetos.size() <= max) {

			this.objetos.add(objeto);
		}else {
			throw new RuntimeException("no hay más espacio");
		}

	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return this.objetos.iterator();
	}
}
