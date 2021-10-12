package com.master.java.cero.experto.arreglos;

public class EjemploArreglosOrdenPrincipioFinal {

	public static void main(String[] args) {
		
		int[] numeros = new int[11];
		int[] a = new int[11];
		
		
		// Rellenamos los numeros
		for(int i =0; i < numeros.length; i ++) {
			numeros[i] = i+1;
		}
		
		int aux =0;
		// Procedemos a ordendar por delante y detrás.
		// Posicion 0: Valor 1
		// Posicion 1: Valor 10
		// Vamos ordenando tanto desde el principo como el final.
		
		for(int j =0; j<numeros.length /2; j++) {
			a[aux++] = numeros[j];
			a[aux++] = numeros.length -1 -j;
			
			//System.out.print(numeros[j] + " ");
			//System.out.println(numeros.length -1 -j);
		}
		
		// Mostramos los datos del a.
		
		for(int i=0; i <a.length; i++) {
			System.out.println("i = "+ i +  " valor= "+ a[i]);
		}
		
	}

	
	
	
	
}
