package com.master.java.cero.experto.arreglos;

import java.util.Arrays;

public class EjemploArreglosFor {
	public static void main(String[] args) {

		String productos[] = new String[7];

	
		productos[0] = "Kingston pen drive";
		productos[1] = "Samsung";
		productos[2] = "Iphone";
		productos[3] = "Apple";
		productos[4] = "Mcbook";
		productos[5] = "Asus";
		productos[6] = "Rock Star";

		
		/* Vamos a ordernar con Sort de forma Alfabeticamente. */
		Arrays.sort(productos);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("===== Usando ForEach =====");
		for (String pro : productos) {
			System.out.println("Lista de Productos: " + pro);
		}
		
		System.out.println("");		
		System.out.println("");
		
		System.out.println("===== Usando For Normal =====");
		for (String pro : productos) {
			System.out.println("Lista de Productos: " + pro);
		}
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("===== Usando while =====");
		int total = productos.length;
		int i = 0;
		while (i < total) {
			System.out.println("Lista de Productos: " + productos[i]);
			i++;
		}
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("===== Usando Do while =====");
		int j = 0;
		// Se ejeucta una vez y luego pasa al while, mientra siga siendo menos se vuelve a iterar.
		do{
			System.out.println("Lista de Productos: " + productos[j]);
			j++;
		}while (j < total);
		
		System.out.println("");
		System.out.println("");
		
		
		// Vamos a rellenar con un for un array de números
		int[] numeros = new int[10];
		
		for (int num: numeros) {
			int k = 2;
			num = k*3;
			System.out.println("Numeros :" + num);
		}
		
		
		
		
		
		
		
		
		
		
		

	}
}
