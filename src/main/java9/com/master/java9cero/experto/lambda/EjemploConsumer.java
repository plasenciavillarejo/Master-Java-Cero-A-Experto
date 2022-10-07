package com.master.java9cero.experto.lambda;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.springframework.expression.spel.ast.Assign;

import com.master.java9cero.experto.models.Usuario;

public class EjemploConsumer {

	public static void main(String[] args) {

		// ##################################################################################################
		// ##################################################################################################
		
		Consumer<Date> consumidor = fecha -> {
			SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-d");
			System.out.println(formatoFecha.format(fecha));
		};

		consumidor.accept(new Date());
		
		// Un consumidor que acepta dos parámetros
		
		BiConsumer<String, Integer> consumidorBi = (nombre, edad)->{
			System.out.println(nombre + " tiene " + edad + " años");
		};
		
		consumidorBi.accept("Plasencia", 24);
		
		
		// ##################################################################################################
		// ##################################################################################################
		// Un consumidor con expresiones lambda
		Consumer<String> consumidor2 = System.out::println;
		consumidor2.accept("Hola lambda");
		
		// Le pasamos un array de nombres al consumidor y lo va a imprimir por pantalla
		List<String> nombres = Arrays.asList("jose","manolo","andres","garcia","lorca");
		nombres.forEach(consumidor2);
		
		// ##################################################################################################
		// ##################################################################################################
		
		// Referencias a metodos utilizando BiConsumer
		Usuario usuario = new Usuario();
		
		// RECORDAD: Los consumers no devuelven nada, solo realiza un trabajo.
		BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
		
		// Procedemos a asignarle el nombre
		asignarNombre.accept(usuario, "José");
		System.out.println("Nombre del usuario: " + usuario.getNombre());
		
	}

}
