package com.master.java9cero.experto.lambda.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {

	public static void main(String[] args) {

		/* Recibe un argaumento como parámetro y devuelve el valor. Es una combinación entre Consumer (Consume) y Supplier (Devuelve un resultado)
		  	1 Argumento es el que consume
		  	2 Argumento es el que devuelve.
		 	
		  Casos de uso: Api Stream de java, Programación funcional.
		  */
		
		
		Function<String, String> f1 = param -> "Hola que tal!"+ param;
		String resultado = f1.apply("jose");
		System.out.println(resultado);
		
		// ##################################################################################################
		// ##################################################################################################
		
		//Function<String, String> f2 = param -> param.toUpperCase();
		Function<String, String> f2 = String::toUpperCase;
		System.out.println(f2.apply("pruebas"));
		
		// ##################################################################################################
		// ##################################################################################################
		
		/* Ahora utilizaremos BiFunction que es igual simplemente que recibe dos argumentos y solo devuelve un solo resultado. */
		BiFunction<String, String, String> f3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
		String r2 = f3.apply("Jose", "Plasencia");
		System.out.println(r2);
		
	}

}
