package com.master.java7.cero.experto.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetAgregar {

	public static void main(String[] args) {

		// Los treeSet son "Set" ordenados de forma alfabética, ya sea cadenas o
		// números.

		// Una desventaja es que al ser ordenador consume recursos por lo que el tiempo
		// de ejecucion se puede demorar.
		Set<String> treeSet = new TreeSet<>();

		System.out.println(
				"Una regla para poder utilizar estos métodos es que la clase que se quiera comparar debe contener el metodo "
						+ "compareTo, de otro modo no funcionaría");
		System.out.println("\n =============================================");
		System.out.println("\n");

		treeSet.add("uno");
		treeSet.add("dos");
		treeSet.add("tres");
		treeSet.add("tres");
		treeSet.add("cuatro");
		treeSet.add("cinco");

		System.out.println("Mantiene el orden alfabetico y no devuelve elementos duplicados: " + treeSet);

		Set<Integer> numero = new TreeSet<>();

		numero.add(1);
		numero.add(3);
		numero.add(5);
		numero.add(2);

		System.out.println("Ordenando la lista de numero de forma automática: " + numero);

		// Si queremos ordenar de forma ascendente podemos implementar el Comparator
		// implementandolo al vuelo. (Ejemplo)
		Set<String> treeSetOrdenadoAscedente = new TreeSet<String>(new Comparator<String>() {
			// Se implementa el método de forma automática.
			@Override
			public int compare(String a, String b) {
				// Se ordena de forma ascendente.
				return b.compareTo(a);
			}
		});
		
		treeSetOrdenadoAscedente.add("uno");
		treeSetOrdenadoAscedente.add("dos");
		treeSetOrdenadoAscedente.add("tres");
		treeSetOrdenadoAscedente.add("tres");
		treeSetOrdenadoAscedente.add("cuatro");
		treeSetOrdenadoAscedente.add("cinco");
		
		System.out.println("\n");
		System.out.println(" ==== Imprimiendo el valor de forma ordenada ALFABETICAMENTE ascedente utilizando la clase Comparator al vuelo === ");
		System.out.println(treeSetOrdenadoAscedente);
		
		
		
		// Otra forma de implementar al vuelo sería la siguiente
		Set<String> otraForma = new TreeSet<String>((a,b) -> b.compareTo(a));
		
		
		otraForma.add("uno");
		otraForma.add("dos");
		otraForma.add("tres");
		otraForma.add("tres");
		otraForma.add("cuatro");
		otraForma.add("cinco");
		
		System.out.println("\n");
		System.out.println(" ==== Imprimiendo el valor utilizando otra forma: (a,b) -> b.compareTo(a) === ");
		System.out.println(otraForma);
		
		
		
		// Utilizando el Comparator.reverseOrder()
		Set<String> impleReverOrder = new TreeSet<String>(Comparator.reverseOrder());
		
		
		impleReverOrder.add("uno");
		impleReverOrder.add("dos");
		impleReverOrder.add("tres");
		impleReverOrder.add("tres");
		impleReverOrder.add("cuatro");
		impleReverOrder.add("cinco");
		
		System.out.println("\n");
		System.out.println(" ==== Imprimiendo el valor utilizando otra forma de CompareTo.ReverseOrder() === ");
		System.out.println(impleReverOrder);
		
		
		
	}

}
