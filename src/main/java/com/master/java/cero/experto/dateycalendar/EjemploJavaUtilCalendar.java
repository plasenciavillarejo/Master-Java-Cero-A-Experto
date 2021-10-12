package com.master.java.cero.experto.dateycalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {

	public static void main(String[] args) {
		
		// Se inyecta con el .getInstance no se hace con el new Calendar(); por que es una clase abstracta
		Calendar calendario = Calendar.getInstance();
		
		Calendar calendario2 = Calendar.getInstance();
		
		//  1.- Forma
		calendario.set(2020, 2, 17);
		
		// 2 .- Forma
		calendario2.set(2021, 2, 12, 04, 01, 12);
		
		Date fecha = calendario.getTime();
		System.out.println("calendario = " + fecha);
		
		Date fecha2 = calendario2.getTime();
		System.out.println("Calendario 2 = " + fecha2);
		
		
		// 3.- Forma
		
		Calendar calendario3 = Calendar.getInstance();
		calendario3.set(Calendar.YEAR, 2021);
		calendario3.set(Calendar.MONTH, 5);
		calendario3.set(Calendar.DATE, 04);
		calendario3.set(Calendar.HOUR_OF_DAY, 21);
		
		Date fecha3 = calendario3.getTime();
		System.out.println("Fecha 3 = " + fecha3);
		
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-yy HH:mm:ss");
		
		String fechaConFormato = formato.format(fecha3);
		
		
		
		System.out.println("Fecha3 es =" + fechaConFormato);
		
		
		
	}

}
