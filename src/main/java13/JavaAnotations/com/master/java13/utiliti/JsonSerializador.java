package com.master.java13.utiliti;

import java.lang.reflect.Field;
import java.util.Arrays;

import com.master.java13.anotaciones.JsonAtributo;

public class JsonSerializador {

	public static String convertirJson(Object object) {
		// Debemos procesar las anotaciones utilizando Field que nos proporciona la api de reflexión de java.
		Field[] atributos = object.getClass().getDeclaredFields();
		
		// Utilizamos el API Stream para que sea más fluido la programación funcional.
		return Arrays.stream(atributos)
				// Va a preguntar si el campo está anotado con JsonAtributo
				.filter(f -> f.isAnnotationPresent(JsonAtributo.class)) 
				// Ahora obtenemos los campos y lo vamos a convertir en un String pero con una estructura Json.
				.map( f -> {
					/* Para que pueda leer los atributos de el objeto privados se debe indicar: 
					 	De lo contrario lanzará un error: cannot access a member of class com.master.java13.models.Producto with modifiers "private" */
					f.setAccessible(true);
					// Primero obtenemos la anotacion y comparamos con vacío. 
					String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
							// Si es igual le asignamos el valor de el campo.
							? f.getName()
							// Si no, obtenemos el valor por defecto anotado en JsonAtributo.class
							: f.getAnnotation(JsonAtributo.class).nombre();
					// Devolvemos los atributos con vertido el Json pero debemos escapar ya que la comilla es parte de el string
					try {
						return "\"" + nombre + "\":\"" + f.get(object) + "\"";
					} catch (IllegalArgumentException | IllegalAccessException e) {
						throw new RuntimeException("Error al serializar a json: " + e.getMessage());
					}
				})
				
				/* Vamos aplicar un Reduce para reducir todo el flujo para que se obtenga una única salida con todos los campos convertidos en JSON.
					 Reduce -> Devuelve un único String
				 */
				.reduce("{" , (a,b) -> {
					// Si "a" es igual a "{" no agregamos la "," -> Es el inicio de el objeto Json { "nombre": "jose"....
						if("{".equals(a)) {
							return a + b;
						}
					// De lo contrario retornamos
					return a + ", " + b;
					// AL devover un único String devemos concaternarlo con el cierre de la llave '}'
					}).concat("}");
	}
	
}
