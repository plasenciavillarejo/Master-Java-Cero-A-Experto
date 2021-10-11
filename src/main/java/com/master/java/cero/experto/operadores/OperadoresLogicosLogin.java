package com.master.java.cero.experto.operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {

	public static void main(String[] args) {

		String username = "jose";
		String password = "Plasencia_1";

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese el usuario");

			String usu = scanner.next();

			System.out.println("Ingrese el passowrd");

			String pas = scanner.next();

			boolean esAutenticado = false;

			if (usu.equalsIgnoreCase(username) && pas.equalsIgnoreCase(password)) {
				esAutenticado = true;
			}

			if (esAutenticado) {
				System.out.println("Bievenido al formulario");
			} else {
				System.out.println("Error no es el usuario");
			}
		}

	}

}
