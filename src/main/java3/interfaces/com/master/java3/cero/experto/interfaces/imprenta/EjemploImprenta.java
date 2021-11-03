package com.master.java3.cero.experto.interfaces.imprenta;

import com.master.java3.cero.experto.interfaces.imprenta.modelo.Curriculum;
import com.master.java3.cero.experto.interfaces.imprenta.modelo.Hoja;
import com.master.java3.cero.experto.interfaces.imprenta.modelo.Informe;

public class EjemploImprenta {

	public static void main(String[] args) {
		
		Curriculum cv = new Curriculum("Jose", "Telecomunicaciones", "15 años en la vida");
		cv.addExperiencia("java")
		.addExperiencia("PL SQL")
		.addExperiencia("Back-End")
		.addExperiencia("Front-End");
		
		Informe informe = new Informe("Pepe garcia", "Jose Plasencia", "12 años");
		imprimir(cv);
		imprimir(informe);

	}

	
	public static void imprimir(Hoja imprimible) {
		System.out.println(imprimible.imprimir());
	}
	
}
