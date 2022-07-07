package com.master.java9cero.experto.lambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {

	public static void main(String[] args) {

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
	}

}
