package com.master.java.cero.experto.dateycalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/* Convertismo un objeto string a una fecha. */
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-yy");

		System.out.println("Ingrese una fecha con formato yyyy-MM-yy");
		try {
			Date fecha = format.parse(scanner.next());
			System.out.println("Fecha = " + fecha);
			System.out.println("Format = " + format.format(fecha));
			
		/* 1.- Forma de compara fechas. */	
			
			Date fecha2 = new Date();
			System.out.println("Fecha2 = " + fecha2);
			
			if(fecha.after(fecha2)) {
				System.out.println("Fecha1 del usuario es después que Fecha2");
			}else if(fecha.before(fecha2)) {
				System.out.println("Fecha1 es anterior que Fecha2");
			}else if(fecha.equals(fecha2)) {
				System.out.println("Las fechas son iguales.");
			}
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
		/* 2.- Forma de comparar Fechas */
			if(fecha.compareTo(fecha2) > 0) {
				System.out.println("Fecha1 del usuario es después que Fecha2");
			}else if(fecha.compareTo(fecha2) < 0) {
				System.out.println("Fecha1 es anterior que Fecha2");
			}else if(fecha.compareTo(fecha2) == 0) {
				System.out.println("Las fechas son iguales.");
			}
			
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
