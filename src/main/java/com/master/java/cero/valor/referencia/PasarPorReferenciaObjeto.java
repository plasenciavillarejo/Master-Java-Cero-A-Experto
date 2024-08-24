package com.master.java.cero.valor.referencia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PasarPorReferenciaObjeto {

  private static final Logger LOGGER = LoggerFactory.getLogger(PasarPorReferenciaObjeto.class);
  
	public static void main(String[] args) {

			
			int[] edad = {10,11,12};
			
			LOGGER.info("Iniciamos el método main = {}", edad);
			
			for(int i=0; i<edad.length; i++) {
				LOGGER.info("Edad[i] = {}", edad[i]);
			}
			
			LOGGER.info("Antes de llamar al metodo test");
			
			test(edad);
			
			LOGGER.info("Despues de llamar al método test");
			for(int i=0; i<edad.length; i++) {
				LOGGER.info("Edad[i] = {}", edad[i]);
			}
			
			
			LOGGER.info("Finaliza el método main con los datos del arreglo cambiados.");
		}
		
	/* 1.- Si pasamos una referencia de un arreglo, lo que se pasa es un puntero hacia una instancia real que está guardado
	 * 	en memoría. Se pasa un puntero, una dirección que apunta a esa referencia.
	 * 2.- Si esa referencia cambia, también va afectar en el método donde se creo esa instancia. 
	 * 3.- Resumen: Al crear un arreglo edad, mantiene la misma referencia que el arreglo edadArreglo, por lo que vale lo mismo. */
	
		public static void test(int[] edadArreglo) {
			
			
			LOGGER.info("Inicia el valor test" );
			
			for(int i=0; i<edadArreglo.length; i++) {
				edadArreglo[i] = edadArreglo[i] + 20;
			}
		} 

	}


