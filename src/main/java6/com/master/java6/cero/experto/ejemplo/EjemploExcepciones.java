package com.master.java6.cero.experto.ejemplo;

import javax.swing.JOptionPane;

import com.master.java6.cero.experto.excepciones.DivisionPorZeroException;
import com.master.java6.cero.experto.excepciones.FormatoNumeroException;

public class EjemploExcepciones {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();

		String numerador = JOptionPane.showInputDialog("Ingrese un número entero numerador: ");
		String divisor = JOptionPane.showInputDialog("Ingrese un número entero divisor: ");
		

		//double division;

		double divison2;

		try {
			/*division = calculadora.dividir(10, divisor);
			System.out.println(division); */

			divison2 = calculadora.dividir(numerador, divisor);

			System.out.println("=== Obteniendo la division de: " + numerador + " entre: " + divisor);
			System.out.println("===   El resultado es: " + divison2);
			
		} catch (DivisionPorZeroException e) {
			System.out.println("Error no se puede dividir por cero");
			main(args);
		} catch (FormatoNumeroException fm) {
			System.out.println("Se ha detectado alguna anomalía: ingrese nuevamente un número válido" + fm.getMessage());
			fm.printStackTrace(System.out);
			main(args);
		}

	}

}
