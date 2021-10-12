package com.master.java.cero.valorReferencia;

public class PasarPorValor {
	public static void main (String[] args) {
		
		int i = 10;
		
		System.out.println("Iniciamos el método main con i = " + i);
		
		/* Invocamos el método creado anteriormente -> Test y mostrara el system.*/
		test(i);
		// Mantenemos el mismo valor ya que estamos usando el valor de i que tiene en el main y no el que esta usando
		// en la clase test -> Se llama método Inmutables.
		System.out.println("Vemos que siguimos mantienendo el valor inicial de i = "+ i);
	}
	
	/* Creamos otro método.
	 static: Se puede invocar sin necesidad de crear el objeto, simplemente usando el nombre de la clase 
	 			o de forma directa si estamos en otro método estático como el main. 
	 voi: No devuelve ningún valor, no retorna nada. */
	public static void test(int i) {
		System.out.println("Inicia el valor test i = " +i );
		i= 35;
		System.out.println("Finalizar el métood test con el nuevo valor  i = " + i);
	} 
	
}
