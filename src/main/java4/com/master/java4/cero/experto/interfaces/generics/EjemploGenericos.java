package com.master.java4.cero.experto.interfaces.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.master.java4.cero.experto.interfaces.modelo.Cliente;
import com.master.java4.cero.experto.interfaces.modelo.ClientePremium;

public class EjemploGenericos {

	/*
	  Vamos a implementar clases genéricas de java de esta forma podremos
	  reutilizar cualquier método sobre cualquier entidad De esta forma sería mas
	  seguro trabjar con cualquier tipo de datos, mucho más generico, reduce
	  errores de compilacion, etc ..
	 */

	public static void main(String[] args) {
		
		// Clase Genérica.
		 List<Cliente> clientes = new ArrayList<>();
		 clientes.add(new Cliente("Cliente", "Generico"));
	
		 // De está forma obtenemos el cliente
		 Cliente cliente = clientes.get(0);
	
		 // Otra forma sería utilizando el Iterator
		 Cliente clienteIterator = clientes.iterator().next();
		 
		 /* Proceemos a validar el método genérico.*/
		 Cliente[] clientesArreglo = {new Cliente ("Arreglo 1","ArregloApellido1"),
				 new Cliente("Arreglo 2", "ArregloApellido2")};
		 
		 Integer[] enterosArreglo = {1,2,3};
		 
		 /* Procedemos a utiizar el método genérico. */ 
		 List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
	
		 List<Integer> enteroLista = fromArrayToList(enterosArreglo);
	
		 
		 // Imprimimos el resultado.
		 clientesLista.forEach(System.out::println);
		 enteroLista.forEach(System.out::println);
		 
		 
		 List<String> nombres = fromArrayToList(new String[] {"Andres", "Pepe",
				 "Jose","David"}, enterosArreglo);
		 System.out.println("\nImprimimos la lista de nombres");
		 nombres.forEach(System.out::println); 
		 
		 /* Creamos un cliente premium*/
		 List<ClientePremium> clientePemiumList = fromArrayToList(new ClientePremium[]{
				 new ClientePremium("Jose", "plasencia")});
		 
		 
		 System.out.println("\n\n===== Imprimiendo las diferentes listas de clientes que hay: ===== \n");
		 /* Vamos a imprimir los clientes que hay */
		 imprimirClientes(clientes);
		 imprimirClientes(clientesLista);
		 
		 /* Para que nos deje impriimr los clientePremiumList debemos de cambiar el método imprimirClientes 
		   Le añadimos al método una comodin ? extends Clientes. Con esto ya nos deja imprimir cualquier clase que herede de Clientes. 
		 */
		 imprimirClientes(clientePemiumList);
		 
	}
	
	/* Para implementar los métodos genéricos y pode utilizarlo en cualquier clase lo haremos de la siguiente manera
	  Al indicar <T>,estamos indicano que es un método genérico. (Se puede indicar cualquier letra pero T se indica para trabajar con listas
	 * */
	
	public static <T> List<T> fromArrayToList(T[] c){		
		// El método Arrays.asList puede convertir un array en una lista.
		return Arrays.asList(c);
	}
	
	/* Procedemos a realizar sobre carga de métodos para tener más parámetros de entrada. 
	 El tipo C: Convierte el dato a una lista.
	 El tipo G: Itera el dato. 
	  */
	
	public static <T,G> List<T> fromArrayToList(T[] c, G[] g){		
		for(G elemento: g) {
			System.out.println(elemento);
		}
		return Arrays.asList(c);
	}	

	/* Ahora creamos un método genérico que extienda de Cliente y añadimos un Comparable para evitar usar cast al usar compareTo(). */
	
	public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c){		
		// El método Arrays.asList puede convertir un array en una lista.
		return Arrays.asList(c);
	}
	
	/* Creamos un método para imprimi clientes
	 * Para que imprima cualquier clase que herede de Clientes debemos de pasarle comodines ->? extends */
	
	public static void imprimirClientes(List<? extends Cliente> clientes) {
		clientes.forEach(System.out::println);
	}
	
	
	
}
