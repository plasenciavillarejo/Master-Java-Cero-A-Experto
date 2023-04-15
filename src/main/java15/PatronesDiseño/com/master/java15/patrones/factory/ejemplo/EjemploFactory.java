package com.master.java15.patrones.factory.ejemplo;

import com.master.java15.patrones.factory.PizzaProducto;
import com.master.java15.patrones.factory.PizzeriaNewYorkFactory;
import com.master.java15.patrones.factory.PizzeriaZonaAbstractFactory;
import com.master.java15.patrones.factory.producto.PizzaLecceCapricciosa;

public class EjemploFactory {

	public static void main(String[] args) {
		PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
		PizzaLecceCapricciosa lc = new PizzaLecceCapricciosa();
		
		PizzaProducto pizza = ny.ordenarPizza("vegetariana");
		System.out.println("Pepe ordena la pizza " + pizza.getNombre());
		
		pizza = ny.ordenarPizza("italiana");
		System.out.println("Manuel ordena la pizza "+ pizza.getNombre());
		
		
		
		 
	}

}
