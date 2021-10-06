package com.master.java.cero.experto.tipostringcadenas;

public class EjemploString {
	public static void main(String[] args) {
		
		String curso = "Programación Java";
		
		/* */
		String curso2 = new String("Programación Java");
	
		boolean esIgual = curso == curso2;
	
		
	/* 1.- De está forma se están comparando las instancias curso = curso2. No se compara el valor de la cadena string*/
		System.out.println("es igual : " + esIgual);
	
	
	/* 2.- Vamos a compara la cadena de string */
		
		esIgual = curso.equals(curso2);
		System.out.println("Comparamos con el operador equals, mediante el atributo string : " + esIgual);
		
	
	/* 3.- Ignorando mayusculas y mínusculas */
		
		esIgual = curso.equalsIgnoreCase(curso2);
		System.out.println("Comparamos con el operador equals, mediante el atributo string : " + esIgual);
	
	/* 4.- El resultado de la comparación es true debido a que el objeto curso ya está creado, entonce internamente
	 * no vuelve a crear otro objeto string ya que es el mismo que ha creado anteriormente por lo que ahorra en memoría.*/	
		String curso3 = "Programación Java";
		esIgual = curso ==curso3;
		
		System.out.println("Comparación método 3 -> " + esIgual);
		
		
		
	}
}
