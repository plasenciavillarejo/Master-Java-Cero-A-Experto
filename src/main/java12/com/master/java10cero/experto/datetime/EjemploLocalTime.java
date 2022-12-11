package com.master.java10cero.experto.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalTime {

	public static void main (String[] args) {
		
		// NO se utiliza el operador new ya que es de forma estática.
		
		/* ##########################################################
		  	IMPORTANTE -> LocalDate solo se obtiene la fecha unicamente.
		  ##########################################################
		 */
		
		LocalTime time = LocalTime.now();
		
		
		/*########################################################################################*/
		/*########################################################################################*/
		
		System.out.println("");
		System.out.println("Hora completa: " + time);
		System.out.println("Hora: " + time.getHour());
		System.out.println("Minutos: " + time.getMinute());
		System.out.println("Segundos: " + time.getSecond());
		
		LocalTime seisConTreinta = LocalTime.of(6,  30);
		System.out.println(seisConTreinta);
		
		seisConTreinta = LocalTime.parse("06:30");
		System.out.println(seisConTreinta);
		
		
		/* Formateo de fechas*/
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss a");
		String horaFormateada = time.format(df);
		System.out.println("La hora formateada en formato a.m/p.m. según la hora que sea: "+ horaFormateada);
		
		horaFormateada = df.format(seisConTreinta);
		System.out.println("Obteniendo otra forma de formatear las fechas, "+ time );
	
		
		// Hora máxima y míninma del día.
		LocalTime max = LocalTime.MAX;
		LocalTime min = LocalTime.MIN;
		
		System.out.println("");
		System.out.println("Hora máxima del día: " + max);
		System.out.println("Hora mínima del día: " +min);
		
	}
}
