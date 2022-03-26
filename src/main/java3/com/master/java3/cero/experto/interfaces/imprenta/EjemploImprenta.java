package com.master.java3.cero.experto.interfaces.imprenta;

import org.springframework.beans.factory.annotation.Autowired;

import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Curriculum;
import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Genero;
import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Hoja;
import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Imprimible;
import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Informe;
import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Libro;
import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Pagina;
import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Persona;

public class EjemploImprenta {

	public static void main(String[] args) {
		
		Persona personaCurriculum = new Persona("José", "Plasencia");
	
		
		Curriculum cv = new Curriculum(personaCurriculum, "Telecomunicaciones", "15 años en la vida");
		cv.addExperiencia("java")
		.addExperiencia("PL SQL")
		.addExperiencia("Back-End")
		.addExperiencia("Front-End");
		
		Persona personaLibro = new Persona("MariLola","López");
		
		Libro libro = new Libro(personaLibro,"El comienzo de una larga vida de éxitos"
				,Genero.AVENTURA);
		libro.addPagina(new Pagina("No se"))
		.addPagina(new Pagina("Quizas no sepa nada"));

		
		Persona personaInforme = new Persona("Pepe","Garcia");
		
		Informe informe = new Informe(personaInforme, "Jose Plasencia", "12 años");
		// Se llama a la Intefez "Imprimible" que contiene el método imprimible de forma estática
		Imprimible.imprimir(cv);
		Imprimible.imprimir(informe);
		Imprimible.imprimir(libro);
		
		
		/* Vamos a imprimir la constante desde la Interfaz de Imprimible */
		System.out.println(Imprimible.TEXTO_DEFECTO);
		
	}
	
}
