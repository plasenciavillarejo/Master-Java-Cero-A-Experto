package com.master.java13.main;

import java.time.LocalDate;

import com.master.java13.models.Producto;
import com.master.java13.utiliti.JsonSerializador;

public class EjemploAnotacion {

	public static void main(String[] args) {
						
		Producto p = new Producto();
		p.setFecha(LocalDate.now());
		p.setNombre("mesa centro roble");
		p.setPrecio(1000L);

		
		System.out.println("Imprimimos por salida el objeto transformado a JSON: " + JsonSerializador.convertirJson(p));
	}

}
