package com.master.java.cero.experto.arreglos;

public class EjemploArreglos3Combinados {
	public static void main(String[] args) {

		int[] a, b, c;
		a = new int[9];
		b = new int[9];
		c = new int[20];

		// La idea es llenar el a y el b para poblar el c.

		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}

		for (int i = 0; i < b.length; i++) {
			b[i] = (i + 1) * 5;
		}

		// Vamos a iterar y nos mostrar 3 elemenetos de a y de b.
		int aux = 0;
		for (int i = 0; i <b.length; i+=3) {
			// Va a llenar 3 elementos a
			for (int j = 0; j<3; j++) {
				c[aux++] = a[i+j];
			}
			// Va a llenar 3 elementos b
			for (int j = 0; j<3; j++) {
				c[aux++] = b[i+j];
			}

		}

		for (int i = 0; i < c.length; i++) {
			System.out.print(i + " :");
			System.out.println(" " + c[i]);
		}

	}
}
