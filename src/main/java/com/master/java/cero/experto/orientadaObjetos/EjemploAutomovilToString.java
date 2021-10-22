package com.master.java.cero.experto.orientadaObjetos;

public class EjemploAutomovilToString {

	public static void main(String[] args) {
		
		AutomovilToString subaru = new AutomovilToString("Honda", "Rxj");
		subaru.setColor("Negro");
		subaru.setCilindrada(3.4);

		AutomovilToString mazda = new AutomovilToString("Mazda", "rrLletjo", "Blanco");
		mazda.setCilindrada(2.5);

		AutomovilToString hyunday = new AutomovilToString("hyunday","Negro","Quizas",3.5,50);
		
		/* Cuando imprimimos el método hyunday nos devuelve la clase con un hasid, para cambiarlo deberemos de llamar
		 * a un to.String() y personalizarlo en la Clase AutomovilToString.java*/
		System.out.println("Nos devuelve la clase con un hasId: " + hyunday + "\n");
		System.out.println("Personalizando el toString() : \n " + hyunday.toString());

	}

	}


