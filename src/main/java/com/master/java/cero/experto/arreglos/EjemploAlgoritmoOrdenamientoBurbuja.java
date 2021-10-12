package com.master.java.cero.experto.arreglos;

public class EjemploAlgoritmoOrdenamientoBurbuja {
	public static void main (String[] args) {
		
		String productos[] = {"Kingston pen drive","Samsung","Iphone","Apple","Mcbook","Asus","Rock Star"};
		
		 
		int total = productos.length;
		
		int contador = 0;
		for(int i =0; i<total; i ++) {
			for(int j=0; j<total; j++) {
				if(productos[i].compareTo(productos[j])< 0) {
					// Intercambiamos de posición, creamos auxiliar para que guarde la posicions de [i]
					String auxiliar = productos[i];
					// Igualamos el valor de i al valor de [j].
					productos[i] = productos[j];
					// Asignamos el valor del auxiliar a [j]
					productos[j] = auxiliar;
				}
				contador ++;
			}
		}
		System.out.println("");
		System.out.println("");
		
		System.out.println("Veces en las que ha iterado para ordenar el Arrays = " + contador);
		System.out.println("");
		
		System.out.println("===== Usando ForEach =====");
		System.out.println("");
		for (String pro : productos) {
			System.out.println("Lista de Productos: " + pro);
		}
	}
}
