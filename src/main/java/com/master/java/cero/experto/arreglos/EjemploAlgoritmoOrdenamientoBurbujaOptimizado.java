package com.master.java.cero.experto.arreglos;

public class EjemploAlgoritmoOrdenamientoBurbujaOptimizado {
	public static void main (String[] args) {
		
		String productos[] = {"Kingston pen drive","Samsung","Iphone","Apple","Mcbook","Asus","Rock Star"};
		
		 
		int total = productos.length;
		
		int contador = 0;
		for(int i =0; i<total -1; i ++) {
			
			for(int j=0; j<total -1 - i; j++) {
				if(productos[j+1].compareTo(productos[j])< 0) {
					// Intercambiamos de posición, creamos auxiliar para que guarde la posicions de [i]
					String auxiliar = productos[j];
					// Igualamos el valor de i al valor de [j].
					productos[j] = productos[j+1];
					// Asignamos el valor del auxiliar a [j]
					productos[j+1] = auxiliar;
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
