package com.master.java.cero.experto.dateycalendar;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class EjemploJavaUtilDate {

	public static void main(String[] args) {
		
		Date fecha = new Date();
		
		System.out.println("Fecha Actual es : " + fecha);

		SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy");
		
		String fechaStr = fechaFormateada.format(fecha);
		System.out.println("Fecha Formateada a nuestro gusto = " + fechaStr);
		
		
		SimpleDateFormat fechaFormateada2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String fechaStr2 = fechaFormateada2.format(fecha);
		
		System.out.println("Fecha Formateada con minutos y segundos = " + fechaStr2);
	
		
		SimpleDateFormat fechaFormateada3 = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy HH:mm:ss" );
		String fechaStr3 = fechaFormateada3.format(fecha);
		
		System.out.println("Fecha indicada en formato de letras = " + fechaStr3);
		
		SimpleDateFormat fechaFormateada4 = new SimpleDateFormat("yyyyMM-ddHHmmss");
		String fechaStr4 = fechaFormateada4.format(fecha);
		
		System.out.println("Fecha indicada en formato de letras = " + fechaStr4);		
		
		/* Tiempo en Milisegundos */
		
		long j = 0;
		for (int i =0; i < 100000000; i ++) {
			j += i;
		}
		
		System.out.println("j = " + j);
		
		Date fechaSegundos = new Date();
		
		long tiempoFinal = fechaSegundos.getTime() - fecha.getTime();
		System.out.println("Tiempo transcurrido en el for: " + tiempoFinal);
		System.out.println("fechaStr3 = " + fechaStr3);
		
	}

}
