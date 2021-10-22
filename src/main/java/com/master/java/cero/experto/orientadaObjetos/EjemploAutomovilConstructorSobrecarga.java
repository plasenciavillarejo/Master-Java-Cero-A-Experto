package com.master.java.cero.experto.orientadaObjetos;

public class EjemploAutomovilConstructorSobrecarga {
	
	public static void main(String[] args) {
		
		/* vamos creando clases con los diferentes métdos de sobrecarga creados.*/
		AutomovilConstructorSobrecarga subaru = new AutomovilConstructorSobrecarga("Honda", "Rxj");
		subaru.setColor("Negro");
		subaru.setCilindrada(3.4);

		AutomovilConstructorSobrecarga mazda = new AutomovilConstructorSobrecarga("Mazda", "rrLletjo", "Blanco");
		mazda.setCilindrada(2.5);

		AutomovilConstructorSobrecarga hyunday = new AutomovilConstructorSobrecarga("hyunday","Negro","Quizas",3.5,50);
		
		
		System.out.println(subaru.verDetalle());
		System.out.println(mazda.verDetalle());
		System.out.println(hyunday.verDetalle());

	}
}
