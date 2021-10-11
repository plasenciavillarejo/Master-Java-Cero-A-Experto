package com.master.java.cero.experto.operadores;

import java.util.Scanner;

public class OperadoresLogicosLoginArreglos {
	public static void main(String[] args) {

		/*
		 * String [] usuariosArreglos = new String [2]; String [] passwordArreglos = new
		 * String [2]; usuariosArreglos[0] = "jose"; passwordArreglos[0] =
		 * "Plasencia_1";
		 * 
		 * usuariosArreglos[1] = "admin"; passwordArreglos[1] = "12345";
		 */

		String[] usuariosArreglos = { "jose", "admin", "M.Lola" };
		String[] passwordArreglos = { "Plasencia_1", "12345", "Lola" };

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese el usuario");

			String usu = scanner.next();
			System.out.println("Ingrese el passowrd");

			String pas = scanner.next();
			boolean esAutenticado = false;

			for (int i = 0; i < usuariosArreglos.length; i++) {
				if (usu.equalsIgnoreCase(usuariosArreglos[i]) && pas.equalsIgnoreCase(passwordArreglos[i])) {
					System.out.println("Bievenido al formulario -> " + usu);
					break;
				}
			}

		}

	}
}
