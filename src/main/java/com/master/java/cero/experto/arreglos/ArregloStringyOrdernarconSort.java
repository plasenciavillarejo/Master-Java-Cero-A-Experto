package com.master.java.cero.experto.arreglos;

import java.util.Arrays;

public class ArregloStringyOrdernarconSort {
	public static void main(String[] args) {

		String productos[] = new String[7];
		
		productos[0] = "Kingston pen drive";
		productos[1] = "Samsung";
		productos[2] = "Iphone";
		productos[3] = "Apple";
		productos[4] = "Mcbook";
		productos[5] = "Asus";
		productos[6] = "Rock Star";
		
		
		String prod1 = productos[0];
		String prod2 = productos[1];
		String prod3 = productos[2];
		String prod4 = productos[3];
		String prod5 = productos[4];
		String prod6 = productos[5];
		String prod7 = productos[6];
		
		
		/* Vamos a ordernar con Sort de forma Alfabeticamente. */
		Arrays.sort(productos);
		
		System.out.println("Ordenando de forma alfabeticamente");
		
		System.out.println("productos[0]" + prod1);
		System.out.println("productos[1]" + prod2);
		System.out.println("productos[2]" + prod3);
		System.out.println("productos[3]" + prod4);
		System.out.println("productos[4]" + prod5);
		System.out.println("productos[5]" + prod6);
		System.out.println("productos[6]" + prod7);
		
		System.out.println("");
		
		
		int numeros[] = new int[4];

		numeros[0] = 5;
		numeros[1] = 4;
		numeros[2] = 1;
		numeros[3] = 2;

		int i = numeros[0];
		int j = numeros[1];
		int k = numeros[2];
		int l = numeros[3];

		System.out.println("Valor i = " + i);
		System.out.println("Valor j = " + j);
		System.out.println("Valor k = " + k);
		System.out.println("Valor l = " + l);

	}
}
