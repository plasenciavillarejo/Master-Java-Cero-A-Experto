package com.master.java.cero.experto.operadores;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
	//	variable = condicion ? si es verdadero: si es falso;
		
		String variable = 7 == 7 ? "Si es verdadero": "Es falso";
		System.out.println(variable);
		

		
	String estado ="";
	double promedio = 0.0;
	
	double matematicas = 0.0;
	double ciencia = 0.0;
	double historia = 0.0;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ingrese la nota de matemáticas entre 2.0 y 7.0");
	matematicas = scanner.nextDouble();
	
	System.out.println("Ingrese la nota de cienca entre 2.0 y 7.0");
	ciencia = scanner.nextDouble();
	
	System.out.println("Ingrese la nota de historia entre 2.0 y 7.0");
	historia = scanner.nextDouble();
	
	promedio =(matematicas + ciencia + historia) / 3;
		
		
	estado = promedio >= 5.49 ? "Aprobado" : "Suspenso";
	System.out.println("Estado ->" + estado);
	System.out.println("Promedio de las nota ha sido de: " + promedio);
		
		
		
	
		
	/*String estado = "";
	double promedio = 6.2;
	
	estado = promedio >= 5.49 ? "Aprobado": "Suspenso";
	System.out.println("estado: " + estado);
	*/	
		
		
	}

}
