package com.master.java10cero.experto.datetime;

import java.time.Duration;
import java.time.LocalDateTime;

public class EjemploDuration {

	public static void main(String[] args) {
		/* Se procede a calcular el tiempo que pasa entre la fecha1 y la fecha2 .*/
		
		LocalDateTime fecha1 = LocalDateTime.now();
		LocalDateTime fecha2 = LocalDateTime.now().plusHours(1).plusMinutes(20).plusDays(2);
		
		Duration lapsusTiempo = Duration.between(fecha1, fecha2);
		System.out.println("Diferencia de tiempo: " + lapsusTiempo);
		System.out.println("Cuantos días ha transcurrido entre las fechas : " + lapsusTiempo.toDays() + " días.");
		System.out.println("Cuantas horas ha transcurrido entre las fechas " + lapsusTiempo.toHours() + " horas.");
	}
}
