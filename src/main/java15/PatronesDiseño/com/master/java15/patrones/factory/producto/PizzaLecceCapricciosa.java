package com.master.java15.patrones.factory.producto;

import com.master.java15.patrones.factory.PizzaProducto;

public class PizzaLecceCapricciosa extends PizzaProducto {

	public PizzaLecceCapricciosa() {
		// Tenemos que inicializar el constructor de el padre ya que extendemos de PizzaProducto y contiene un constructor
		super();
		nombre = "Pizza di funghi";
		masa = "Questa massa che vado a utilizzare si chiama massa di la mamma";
		salsa = "Cucinerò con salsa di pomodoro";
		ingredientes.add("Queso Vegano");
		ingredientes.add("Pommodoro");
		ingredientes.add("Olive");
		ingredientes.add("Melanzane");
	}
	
	@Override
	public void cocinar() {
		System.out.println("Si inizia a prepare la pizza con il forno di pietra a centocinquantacinque gradi");		
	}

	@Override
	public void cortar() {
		System.out.println("Si procede a tagliare la pizza in otto pezzi, ¿Vuole che lo taglie più o meno pezzi?");	
	}

}
