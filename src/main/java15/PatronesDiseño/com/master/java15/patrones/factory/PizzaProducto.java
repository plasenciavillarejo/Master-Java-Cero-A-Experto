package com.master.java15.patrones.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProducto {

	protected String nombre;
	protected String masa;
	protected String salsa;
	protected List<String> ingredientes;

	public PizzaProducto() {
		this.ingredientes = new ArrayList<>();
	}

	public void preparar() {
		System.out.println("Preparando " + nombre);
		System.out.println("Seleccionando la masa " + masa);
		System.out.println("Seleccionando la salsa " + masa);
		System.out.println("Agregando ingredientes: ");
		this.ingredientes.forEach(System.out::println);
	}

	// Métodos abstracto para que cada uno implemente su forma de cocinar de forma
	// diferente
	public abstract void cocinar();

	public abstract void cortar();

	public void empaquetar() {
		System.out.println("Poniendo la pizza en una caja de empaque...");
	}

	// Método toString para ir mostrando el detalle de la pizza

	@Override
	public String toString() {
		return "PizzaProducto [nombre=" + nombre + ", masa=" + masa + ", salsa=" + salsa + ", ingredientes="
				+ ingredientes + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMasa() {
		return masa;
	}

	public void setMasa(String masa) {
		this.masa = masa;
	}

	public String getSalsa() {
		return salsa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

}
