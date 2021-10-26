package com.master.java.cero.experto.orientadaObjetos.Enum;

public class Estanque {
	
	private int capacidad;

	/* Inicializamos el constructor con la capacidad = 40;
	 * En la clase solo tenemos que crear la instancia Estanque mazdaEstanque = new Estanque();
	 * Luego setear el valor a la nueva instancia:
	 * 		mazda.setEstanque(mazdaEstanque) -> Con esto el valor por defecto en la salida será: 40 */
	public Estanque() {
		this.capacidad = 40;
	}
	
	public Estanque(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "" + capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	
	
	
}
