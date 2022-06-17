package com.master.java7.cero.experto.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EjemploTreeMap {

	public static void main(String[] args) {
		
		// Para que un HashMap se anide con otro tipo de HashMap deb ser del tibo objectj. Un ejemplo sería el siguiente.
		// El TreeMap -> Ordena por defecto las llaves de forma natural, no los valores.
		Map<String, Object > personaAnidada = new TreeMap<>();
		personaAnidada.put("nombre", "Jose");
		personaAnidada.put("apellido", "Plasencia Villarejo");
		personaAnidada.put("direccion", "C/ Francisco Flores Muelas, 12");
		personaAnidada.put("email", "prueba@gmail.com");
		personaAnidada.put("edad", 33);
		
		Map<String,String> direccion = new TreeMap<String, String>();
		direccion.put("pais", "España");
		direccion.put("comunidad", "Andalucía");
		direccion.put("provincia", "Jaén");
		direccion.put("pueblo", "Bailén");
		direccion.put("calle", "Rus de la puerta, bloque 3, 3ºA");
		
		personaAnidada.put("direccion", direccion);
		
		System.out.println(" ==============================================");
		System.out.println(" Ejemplo con TreeMap<>(), Imprimimos la persona");
		System.out.println(" ==============================================");
		
		System.out.println("Se ordena mediantes las llaves utilizando el TreeMap(): \n" + personaAnidada);
		
		
	}

}
