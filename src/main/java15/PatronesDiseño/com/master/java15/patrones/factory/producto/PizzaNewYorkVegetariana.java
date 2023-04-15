package com.master.java15.patrones.factory.producto;

import com.master.java15.patrones.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

	public PizzaNewYorkVegetariana() {
		// Tenemos que inicializar el constructor de el padre ya que extendemos de PizzaProducto y contiene un constructor
		super();
		nombre = "Pizza vegetariana New York";
		masa = "Masa integral vegana";
		salsa = "Salsa de tomate con mozzarella";
		ingredientes.add("Queso Vegano");
		ingredientes.add("Tomate");
		ingredientes.add("Aceitunas");
		ingredientes.add("Berenjenas");
	}
	
	@Override
	public void cocinar() {
		System.out.println("Se prepara la pizza a 45º durante 45 mint.");
	}

	@Override
	public void cortar() {
		System.out.println("Se procede a cortar la pizza en recuadros largos");
	}

}
