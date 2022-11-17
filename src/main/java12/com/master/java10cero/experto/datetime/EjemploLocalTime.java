package com.master.java10cero.experto.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {

	public static void main (String[] args) {
		
		// NO se utiliza el operador new ya que es de forma estática.
		
		/* ##########################################################
		  	IMPORTANTE -> LocalDate solo se obtiene la fecha unicamente.
		  ##########################################################
		 */
		
		System.out.println(" --- 1ª Forma de mostrar la fecha utilizando -> LocalDate.now() --- ");
		System.out.println("#############################################################");
		
		LocalDate fechaActual = LocalDate.now();
		System.out.println("Fecha Actual: " + fechaActual);
		
		/*########################################################################################*/
		/*########################################################################################*/
		
		System.out.println("");
		System.out.println(" --- 2ª Forma de mostrar la fecha utilizando LocalDate.of(y,m,d) --- ");
		System.out.println("#############################################################");
		
		
		fechaActual = LocalDate.of(2022, 3, 17);
		System.out.println("Fecha Actual: " + fechaActual);
		
		/*########################################################################################*/
		/*########################################################################################*/
		
		System.out.println("");
		System.out.println(" --- 3ª Forma de mostrar la fecha utilizando LocalDate.of(y,Month.MARCH.,d) --- ");
		System.out.println("#############################################################");
		
		
		fechaActual = LocalDate.of(2022, Month.MARCH, 17);
		System.out.println("Fecha Actual: " + fechaActual);
		
		/*########################################################################################*/
		/*########################################################################################*/
		
		System.out.println("");
		System.out.println(" --- 4ª Forma de mostrar la fecha utilizando LocalDate.parse() --- ");
		System.out.println("#############################################################");
		
		
		fechaActual = LocalDate.parse("2022-03-17");
		System.out.println("Fecha Actual: " + fechaActual);
		
		/*########################################################################################*/
		/*########################################################################################*/
		
		System.out.println("");
		System.out.println(" --- Utilizando el método LocalDate.now().pluse() para sumarle días a una fecha --- ");
		System.out.println("####################################################################################");
		
		LocalDate diaDeManiana = LocalDate.now().plusDays(1);
		System.out.println("Fecha Actual más un día: " + diaDeManiana);
		
		
		/*########################################################################################*/
		/*########################################################################################*/
		
		System.out.println("");
		System.out.println(" --- Utilizando el método LocalDate.now().minusMonths(1) para restar un mes al mismo día --- ");
		System.out.println("####################################################################################");
		
		LocalDate mesAnteriorMismoDia = LocalDate.now().minusMonths(1);
		System.out.println("Mes anterior con el mismo día al actual: " + mesAnteriorMismoDia);

		/*########################################################################################*/
		/*########################################################################################*/
		
		System.out.println("");
		System.out.println(" --- Utilizando el método LocalDate.now().minus(1, ChronoUnits.MONTHS) para restar un mes al mismo día --- ");
		System.out.println("####################################################################################");
		
		mesAnteriorMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		System.out.println("Mes anterior con el mismo día al actual: " + mesAnteriorMismoDia);
		
		
		
		/*########################################################################################*/
		/*########################################################################################*/
		
		System.out.println("");
		System.out.println(" --- Utilizando el método DayOfWekk para obtener el día de la semana en una fecha dada --- ");
		System.out.println("###########################################################################################");
		
		DayOfWeek diaSemanaFuturo = LocalDate.parse("2022-11-11").getDayOfWeek();
		System.out.println("Día de la semana: " + diaSemanaFuturo);
		
		
		/*########################################################################################*/
		/*########################################################################################*/
		
		System.out.println("");
		System.out.println(" --- Utilizando el método LocalDate.of(y,m,d).getDayOfMont() para obtener el día del mes --- ");
		System.out.println("####################################################################");
		
		int diaMes = LocalDate.of(2022,03,17).getDayOfMonth();
		System.out.println("Día del mes: " + diaMes);	
		
		
		/*########################################################################################*/
		/*########################################################################################*/
		
		System.out.println("");
		System.out.println(" --- Utilizando el método LocalDate.of(y,m,d).getDayOfYear() para obtener el día del año --- ");
		System.out.println("####################################################################");
		
		int diaAnio = LocalDate.of(2022,03,17).getDayOfYear();
		System.out.println("Día del Año: " + diaAnio);	
		
		
		/*########################################################################################*/
		/*########################################################################################*/
		
		System.out.println("");
		System.out.println(" --- Utilizando el método LocalDate.now().isLeapYear() para saber si el años es bisiesto --- ");
		System.out.println("#############################################################################################");
		
		boolean esBisiesto = LocalDate.now().isLeapYear();
		System.out.println("¿El año es bisiesto?: " + esBisiesto);	
		
		
		/*########################################################################################*/
		/*########################################################################################*/
		
		System.out.println("");
		System.out.println(" --- Comparación de fechas para saber si es mayor, menor o igual --- ");
		System.out.println("#############################################################################################");
	
		boolean esAntes = LocalDate.now().isBefore(LocalDate.parse("2022-10-08"));
		System.out.println("¿Es antes la fecha a la actual?: " + esAntes);	
		
		boolean esDespues = LocalDate.now().isAfter(LocalDate.parse("2022-10-08"));
		System.out.println("¿Es antes la fecha a la actual?: " + esDespues);	
		
		
		/*########################################################################################*/
		/*########################################################################################*/
		
		System.out.println("");
		System.out.println("Fecha actual = " + fechaActual);
		System.out.println("Día: " + fechaActual.getDayOfMonth());
		System.out.println("Mes: " + fechaActual.getMonth());
		System.out.println("Año: " + fechaActual.getYear());
		System.out.println("Era: " + fechaActual.getEra());
		
		
		
		
		
		
	}
}
