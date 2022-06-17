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
		
		
		// Para que un HashMap se anide con otro tipo de HashMap deb ser del tibo objectj. Un ejemplo sería el siguiente.
		Map<String, Object > personaAnidada = new HashMap<>();
		personaAnidada.put("nombre", "Jose");
		personaAnidada.put("apellido", "Plasencia Villarejo");
		personaAnidada.put("direccion", "C/ Francisco Flores Muelas, 12");
		personaAnidada.put("email", "prueba@gmail.com");
		personaAnidada.put("edad", 33);
		
		Map<String,String> direccion = new HashMap<String, String>();
		direccion.put("pais", "España");
		direccion.put("comunidad", "Andalucía");
		direccion.put("provincia", "Jaén");
		direccion.put("pueblo", "Bailén");
		direccion.put("calle", "Rus de la puerta, bloque 3, 3ºA");
		
		// Procedemos asignar Dirección a PersonaAnidada. De está forma tenemos un HashMap personaAnidada asignada a una dirección
		
		personaAnidada.put("direccion", direccion);
		
		
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
		
		System.out.println("\n ==================================================================");
		System.out.println(" ==================================================================");
		System.out.println(" ==================================================================");
		
		System.out.println("\n ==================================================================");
		System.out.println(" Procedemos a imprimir el HashMap 'PersonaAnidada' ");
		System.out.println(" ====================================================================\n");
		
		System.out.println(personaAnidada + "\n");
		
		Collection<Object> mostrarPersona = personaAnidada.values();
		
		System.out.println("\n ==================================================================");
		System.out.println(" Mostramos la colección utilizando Collection<Object> ");
		System.out.println(" ====================================================================\n");
		
		for(Object a: mostrarPersona){
			System.out.println(a);
		}
		
		System.out.println("\n ==================================================================");
		System.out.println(" Mostramos la colección obteniendo la llave y su valor asigando a ella. ");
		System.out.println(" ====================================================================\n");
		
		
		for(Object a: personaAnidada.keySet()){
			Object key = personaAnidada.get(a);
			System.out.println(a + " => " + key);
		}
		
		
		
		System.out.println("\n ==================================================================");
		System.out.println(" ==================================================================");
		System.out.println(" ==================================================================");
		
		System.out.println("\n =======================================================================================");
		System.out.println(" Procedemos a obtener la información de personaAnidada que tiene asiganda una dirección ");
		System.out.println(" ==========================================================================================\n");
		
		
		System.out.println(personaAnidada);
		
		
		System.out.println("\n ===========================================");
		System.out.println(" Obtenemos los datos asociados a una dirección ");
		System.out.println(" =============================================\n");
		
		Map<String,String> direccionPersona = (Map<String, String>) personaAnidada.get("direccion");
		
		String pais = direccionPersona.getOrDefault("pais", "No existe el atributo 'pais' ");
		String ciudad = direccionPersona.getOrDefault("comunidad", "No existe el atributo 'direccion'");
		String calle = direccionPersona.getOrDefault("calle", "No existe el atributo 'calle'");
		
		System.out.println("Pais: "+ pais + "\n"+ 
		"Ciudad: "+ ciudad + "\n" + "Calle: " + calle);
		
		System.out.println("\n =============================================================");
		System.out.println(" Recorremos el personaAnidada y preguntamos con el instanceof ");
		System.out.println(" ================================================================\n");
		
		for(String a: personaAnidada.keySet()){
			Object key = personaAnidada.get(a);
			
		/* InstanceOf => básicamente, su función es la de determinar si el objeto al que apunta una referencia dada es una 
			instancia de una clase o interfaz concretas. 
			Validamos si el dato es de un tipo Map, debemos de convertirlo realizando un cast (String) */
		if(key instanceof Map) {
			Map<String,String> direccionMap = (Map<String,String>) key;
			System.out.println("El país de: " + personaAnidada.get("nombre") + "es: "
					+ direccionMap.get("pais") + ", vive en la calle: " + direccionMap.get("calle") + 
					" situado en la comunidad autónoma: " + direccionMap.get("comunidad"));
		}else {
			System.out.println(a + " => " + key);
			}
		}
		
		
		System.out.println("\n ===============================================");
		System.out.println(" Se procede a iterar la personaAnidad y Direccion ");
		System.out.println(" =================================================\n");
		
		
		for(Map.Entry<String, Object> par: personaAnidada.entrySet()) {
			
			Object obj= par.getValue();
			
			if(obj instanceof Map){
				String nom= (String) personaAnidada.get("nombre");
				Map<String,String> direccionMap = (Map<String,String>) obj;
				for(Map.Entry<String, String> parDir: direccionMap.entrySet()) {
					System.out.println(parDir.getKey() + " " + parDir.getValue());
				}
				
			}
			
		}
		
		
	}

}
