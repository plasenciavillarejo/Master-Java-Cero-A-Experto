package com.master.java.cero.experto.arreglos;

public class EjemploAlgoritmoBurbujaOptimizadoEnteros {
	
	// Recibe un array de Object[] para poder usarlo en cualquier sitio "Entero,Integer,String.."
	public static void sortBurbuja(Object[] arreglo) {
		
		int contador = 0;
		int total = arreglo.length;
		
		for(int i =0; i<total-1; i ++) {
			
			for(int j=0; j<total -1 - i; j++) {
				if(((Integer) arreglo[j+1]).compareTo((Integer) arreglo[j])< 0) {
					// Intercambiamos de posición, creamos auxiliar para que guarde la posicions de [i]
					Object auxiliar = arreglo[j];
					// Igualamos el valor de i al valor de [j].
					arreglo[j] = arreglo[j+1];
					// Asignamos el valor del auxiliar a [j]
					arreglo[j+1] = auxiliar;
				}
				contador ++;
			}
		}

		
		
	}
	
	
	public static void main (String[] args) {
		
		Integer[] numeros = new Integer[4];
		
		numeros [0] = 5;
		numeros [1] = 4;
		numeros [2] = 1;
		numeros [3] = 2;
		
		sortBurbuja(numeros);
		
		for(int ent : numeros) {
			System.out.println("Ordenado: " + ent);
		}
		
	}
	
}
