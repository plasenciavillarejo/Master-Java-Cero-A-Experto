package com.master.java10cero.experto.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class EjemploZoneDateTime {
	
	/*  */
	public static void main(String[] args) {
		LocalDateTime fechaLoca = LocalDateTime.now();
		
		// Creamos nuestra zona horaria
		ZoneId newYork = ZoneId.of("America/New_York");
		ZonedDateTime zonaNy = ZonedDateTime.of(fechaLoca, newYork);
		
		System.out.println("Zona horaria de New York: " + zonaNy);
		
		ZoneId madrid = ZoneId.of("Europe/Madrid");
		ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid);
		
		System.out.println("Zona horaría de Madrid:" + zonaMadrid);
	}
}
