package com.master.java15.patrones.factory;

public abstract class PizzeriaZonaAbstractFactory {

	abstract PizzaProducto crearPizza(String tipo);
	
	public PizzaProducto ordenarPizza(String tipo) {
		PizzaProducto pizza = crearPizza(tipo);

		System.out.println("-----Fabricando la pizza " + pizza.getNombre() + "-------");
		pizza.preparar();
		pizza.cocinar();
		pizza.cortar();
		pizza.empaquetar();
		return pizza;
	}

	

}
