package com.master.java10cero.experto.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class EjemploLocalDate {

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
		System.out.println(time);
		System.out.println("Hora: " + time.getHour());
		System.out.println("Minutos: " + time.getMinute());
		System.out.println("Segundos: " + time.getSecond());
		
		LocalTime seisConTreinta = LocalTime.of(6,  30);
		System.out.println(seisConTreinta);
		
		seisConTreinta = LocalTime.parse("06:30");
		System.out.println(seisConTreinta);
		
		
		
		
	}
}
