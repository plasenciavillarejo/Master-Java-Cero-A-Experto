package com.master.java.cero.valorReferencia;

public class PasarPorReferenciaObjeto {

	public static void main(String[] args) {

			
			int[] edad = {10,11,12};
			
			System.out.println("Iniciamos el método main = " + edad);
			
			for(int i=0; i<edad.length; i++) {
				System.out.println("Edad[i] = "+ edad[i]);
			}
			
			System.out.println("Antes de llamar al metodo test");
			
			test(edad);
			
			System.out.println("Despues de llamar al método test");
			for(int i=0; i<edad.length; i++) {
				System.out.println("Edad[i] = "+ edad[i]);
			}
			
			
			System.out.println("Finaliza el método main con los datos del arreglo cambiados.");
		}
		
	/* 1.- Si pasamos una referencia de un arreglo, lo que se pasa es un puntero hacia una instancia real que está guardado
	 * 	en memoría. Se pasa un puntero, una dirección que apunta a esa referencia.
	 * 2.- Si esa referencia cambia, también va afectar en el método donde se creo esa instancia. 
	 * 3.- Resumen: Al crear un arreglo edad, mantiene la misma referencia que el arreglo edadArreglo, por lo que vale lo mismo. */
	
		public static void test(int[] edadArreglo) {
			
			
			System.out.println("Inicia el valor test" );
			
			for(int i=0; i<edadArreglo.length; i++) {
				edadArreglo[i] = edadArreglo[i] + 20;
			}
		} 

	}


