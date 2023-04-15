package com.master.java15.patrones.factory;

import com.master.java15.patrones.factory.producto.PizzaLecceCapricciosa;
import com.master.java15.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {

	@Override
	PizzaProducto crearPizza(String tipo) {

		PizzaProducto producto = null;
		switch (tipo) {
		case "vegetariana":
			producto = new PizzaNewYorkVegetariana();
			break;
		case "italiana":
			producto = new PizzaLecceCapricciosa();
			break;
		}
		return producto;
	}

}
