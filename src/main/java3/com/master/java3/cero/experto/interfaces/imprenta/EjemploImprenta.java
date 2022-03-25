package com.master.java3.cero.experto.interfaces.imprenta;

import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Curriculum;
import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Genero;
import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Hoja;
import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Imprimible;
import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Informe;
import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Libro;
import interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo.Pagina;

public class EjemploImprenta {

	public static void main(String[] args) {
		
		Curriculum cv = new Curriculum("Jose", "Telecomunicaciones", "15 años en la vida");
		cv.addExperiencia("java")
		.addExperiencia("PL SQL")
		.addExperiencia("Back-End")
		.addExperiencia("Front-End");
		
		Libro libro = new Libro("Jose Plasencia","El comienzo de una larga vida de éxitos"
				,Genero.AVENTURA);
		libro.addPagina(new Pagina("No se"))
		.addPagina(new Pagina("Quizas no sepa nada"));

		Informe informe = new Informe("Pepe garcia", "Jose Plasencia", "12 años");
		imprimir(cv);
		imprimir(informe);
		imprimir(libro);
		
	}

	
	public static void imprimir(Imprimible imprimible) {
		System.out.println(imprimible.imprimir());
	}
	
}
