package com.master.java.cero.experto.orientadaObjetos;

public class EjemploAutomovilConstructor {

	public static void main(String[] args) {
		
		/* Ahora al tener creado un constructor en la clase nos da error, tendremos que indicar en el new los valores,
		 * del fabricante y del modelo, de modo que podemos quitar la llamda ya que se está definiendo en la clase Auto-
		 * movil */
		AutomovilConstructor subaru = new AutomovilConstructor("Honda", "Rxj");
		subaru.setColor("Negro");
		subaru.setCilindrada(3.4);

		AutomovilConstructor mazda = new AutomovilConstructor("Mazda", "rrLletjo");
		mazda.setColor("Blanco");
		mazda.setCilindrada(2.5);

		System.out.println(subaru.verDetalle());

	}

}
