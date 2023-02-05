package com.master.java14.ejemplos;

import java.util.stream.Stream;

import com.master.java14.models.Componente;

public class EjemploRecursividad {

	// 1.- La recursividad es simplemente una clase que contiene elementos de su mismo tipo.
	
	public static void main(String[] args) {
		Componente pc = new Componente("Gabinete PC ATX");
		Componente fuente = new Componente("Fuente Energía 700w");
		Componente placaBase = new Componente("Asus Rox Strike Intel x64");
		Componente cpu = new Componente("Interl core i7 6700k");
		Componente ventilador = new Componente("Ventilador cpu");
		Componente disipador = new Componente("Disipador cpu");
		Componente grafica = new Componente("Asus 1080 16 GB");
		Componente gpu = new Componente("Nvidia GPU");
		Componente ramUno = new Componente("DDR4 1600Mhz 8GB");
		Componente ramDos = new Componente("DDR4 1600MHZ 8GB");
		Componente ramPlacaBase = new Componente("DDR4 1600MHZ 32GB");
		Componente gpuVentiladores = new Componente("Ventiladores GPU");
		Componente ssd = new Componente("Disco SSD 750GB");
		
		// Pasamos a agregar los componentes de el pc.
		// Nivel 0
		cpu.addComponente(ventilador)
			.addComponente(disipador);
		
		// Nivel 1
		grafica.addComponente(gpu)
			.addComponente(ramUno)
			.addComponente(ramDos)
			.addComponente(gpuVentiladores);
		
		// Nivel 2
		placaBase.addComponente(cpu)
			.addComponente(grafica)
			.addComponente(ramPlacaBase)
			.addComponente(ssd);
		
		// Nivel 3
		pc.addComponente(fuente)
			.addComponente(placaBase)
			.addComponente(new Componente("Teclado"))
			.addComponente(new Componente("Raton"));
		
		System.out.println("#### Imprimiendo metodoRecursivo #### ");
		System.out.println("##################################### ");
		metodoRecursivo(pc,0);
		
		System.out.println("\n\n");
		
		System.out.println("#### Imprimiendo metodoRecursivoJava8 #### ");
		System.out.println("##################################### ");
		metodoRecursivoJava8(pc, 0).forEach(c -> System.out.print("\t".repeat(c.getNivel()) + c.getNombre() + "\n"));
	}
	
	// Método recursivo para poder Iterar sobre el
	public static void metodoRecursivo(Componente c, int nivel) {
		// Le concatenamos el nivel para que nos tabule cada componente por niveles, el padre (PC) será el nivel 0
		System.out.print("\t".repeat(nivel) + c.getNombre() + "\n");
		
		// Vamos a validar si tiene hijos los iteramos
		if(c.tieneHisjo()) {
			// De forma recursiva recorremos el hijo y cada hijo va a preguntar si contiene hijos.
			for(Componente hijo: c.getHijos()) {
				metodoRecursivo(hijo,nivel + 1);
			}
		}
	}

	// 
	public static Stream<Componente> metodoRecursivoJava8(Componente c, int nivel) {
		// Utilizamos el APi Strem java 8
		c.setNivel(nivel);
		
		// El objeto Componente debemos transformarlo a Stream para poder devolverlo -> Stream.of(c)
		return Stream.concat(Stream.of(c), 
				// Los hijos se puede devolver -> c.getHijos().stream() pero debemos navegar e forma recursiva ya que los hijos pueden contener más hijos.
				// FlatMap -> Obtiene varios String y los une en una única salida.
				c.getHijos().stream().flatMap(hijo ->
						metodoRecursivoJava8(hijo, nivel + 1)));
	}
	
}
