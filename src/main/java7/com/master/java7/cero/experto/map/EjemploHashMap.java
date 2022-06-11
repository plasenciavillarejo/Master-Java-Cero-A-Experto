package com.master.java7.cero.experto.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {

	public static void main(String[] args) {
		
		Map<String, String> persona = new HashMap<>();
		persona.put(null, "12345");
		persona.put("nombre", "Jhon");
		persona.put("apellido", "Doe");
		persona.put("email", "Jhon@gmail.com");
		persona.put("edad", "25");
		
		System.out.println(" =====================");
		System.out.println(" Imprimimos la persona");
		System.out.println(" ===================== ");
		
		System.out.println(persona);
		
		
		System.out.println("\n =====================================================================");
		System.out.println(" Para acceder algún atributo del HashMap debemos hacer con '.get(valor)' ");
		System.out.println(" ======================================================================= \n");
		
		String nombre = persona.get("nombre");
		System.out.println("Accediendo al nombre mediante -> persona.get('nombre'): " + nombre);
		
		
		System.out.println("\n ==============================================");
		System.out.println(" Procedemos a borrar un valor mediante su llave ");
		System.out.println(" ==============================================\n");
		
		persona.remove("apellido");
		
		System.out.println("Imprimiendo la persona despues de borrar su apellido: \n" + persona);
		
		System.out.println("\n ================================================================================================================");
		System.out.println(" Si se utiliza el método remove mediante 'key', 'value' devuelve un true o false, indicando si se ha borrado o no ");
		System.out.println(" ================================================================================================================ \n");
		
		boolean b = persona.remove("nombre", "pepe");
		String valor="";
		if(b == false) {
			valor = ", No existe en la colección HashMap.";
		}
		
		System.out.println("Se ha borrado el objeto: persona.remove('nombre', 'pepe') -> " + b + valor);
		
		
		System.out.println("\n =======================================================================================");
		System.out.println(" Procedemos a validar si existe utilizando el método contains. (Devuelve un valor boolean)");
		System.out.println(" =========================================================================================\n");
		
		
		boolean contains = persona.containsKey("nombre");
		
		System.out.println("Validamos si existe la persona con el nombre " + persona.get("nombre") + " -> " + contains );
	
		
		System.out.println("\n ==================================================");
		System.out.println(" Procedemos a iterar los valores utilizando la Collection<String>");
		System.out.println(" ====================================================\n");
		
		Collection<String> valores = persona.values();
		
		for(String a: valores) {
			System.out.println(a);
		}
		
		
		System.out.println("\n ==================================================");
		System.out.println(" Procedemos a iterar las llaves utilizando Set<String> (NO es ordenado)");
		System.out.println(" ====================================================\n");
		
		
		Set<String> llaves = persona.keySet();
		
		for(String iterarSet: llaves) {
			System.out.println(iterarSet);
		}
		
		
		System.out.println("\n ==================================================");
		System.out.println(" Procedemos a iterar mediante Pares y valores");
		System.out.println(" ====================================================\n");
		
		
		for(Map.Entry<String, String> par: persona.entrySet()) {
			System.out.println(par.getKey()+ " => " + par.getValue());
		}
		
		
		System.out.println("\n ==================================================================");
		System.out.println(" Procedemos a iterar mediante Pares y valores de forma personalizada");
		System.out.println(" ====================================================================\n");
		
		for(String llave: persona.keySet()) {
			String valo = persona.get(llave);
			System.out.println(llave + " => " +  valo);
		}
		
		
		System.out.println("\n ==================================================================");
		System.out.println(" Procedemos a iterar mediante JAVA 8");
		System.out.println(" ====================================================================\n");
	
		// el valor que se le indica 'key' , 'value' es el que nosotros queramos. No hace falta seguir ningún patro, por ejemplo voy a poner 
		// valorInventado1, valorInventado2 -> Automaticamente el ya sabe que me estoy refiriendo a 'key' , 'value'.
		persona.forEach((valorInventado1, valorInventado2) ->{
			System.out.println(valorInventado1 + " => " + valorInventado2);
		});
		
	}

}
