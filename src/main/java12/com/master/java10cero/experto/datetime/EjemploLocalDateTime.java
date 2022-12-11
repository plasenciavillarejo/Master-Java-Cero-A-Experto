package com.master.java10cero.experto.datetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {

	public static void main(String[] args) {

		LocalDateTime fechaTiempo = LocalDateTime.now();
		System.out.println("#####################################");
		System.out.println(" 1ª forma de crear la fecha ");
		System.out.println("Fecha actual: " +fechaTiempo + "\n");
		
		
		System.out.println("#####################################");
		fechaTiempo = LocalDateTime.of(2022, 12, 05, 18, 30);
		System.out.println("2º forma de crear la fecha");
		System.out.println(fechaTiempo + "\n");
		
		System.out.println("#####################################");
		fechaTiempo = LocalDateTime.parse("2022-12-05T18:30");
		System.out.println("3º forma de crear la fecha");
		System.out.println(fechaTiempo + "\n");
		
		System.out.println("#####################################");
		LocalDateTime fechaTiempo2 = fechaTiempo.plusDays(1);
		System.out.println("Comparación de las fechas");
		System.out.println("¿fechaTiempo2 es mayor que fechaTiempo? (isAfter)" + fechaTiempo2.isAfter(fechaTiempo) + "\n");
		
		System.out.println("#####################################");
		fechaTiempo2 = fechaTiempo.plusDays(1).plusHours(3);
		System.out.println("Sumandole 1 día a fechaTiempo y aumentando en 3 horas");
		System.out.println("Fecha tiempo: " + fechaTiempo + " Fecha tiempo modificada: "+ fechaTiempo2 + "\n");
		
		System.out.println("#####################################");
		fechaTiempo2 = fechaTiempo.minusHours(5);
		System.out.println("Restandole 5 horas a fecha tiempo");
		System.out.println("Fecha tiempo: " + fechaTiempo + " Fecha tiempo modificada: "+ fechaTiempo2 + "\n");

		
		System.out.println("#####################################");
		Month mes = fechaTiempo.getMonth();
		int dia = fechaTiempo.getDayOfMonth();
		int anio = fechaTiempo.getYear();
		
		System.out.println("Obtener 'Mes, dia y añor' mediante Month");
		System.out.println("Mes: " + mes +" Día: " +dia + " Anio: " + anio +"\n");
		
		System.out.println("#####################################");
		System.out.println("Formateo de la fecha utilizando DateTimeFormatter.ISO_DATE");
		System.out.println("Fecha formateada es: " + fechaTiempo.format(DateTimeFormatter.ISO_DATE ) + "\n");
		
		System.out.println("#####################################");
		System.out.println("Formateo de la fecha de forma personalizada");
		System.out.println(fechaTiempo.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss a")) + "\n");
		
		System.out.println("#####################################");
		System.out.println("Formateo de la fecha utilizando df.format(fechaTiempo)");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss a");
		System.out.println(df.format(fechaTiempo));
		
	}

}
