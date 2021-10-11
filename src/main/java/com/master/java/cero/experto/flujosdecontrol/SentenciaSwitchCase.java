package com.master.java.cero.experto.flujosdecontrol;

public class SentenciaSwitchCase {
	public static void main(String[] args) {

		int num = 3;

		switch (num) {
		case 0:
			System.out.println("Numero es 0");
			break;
		case 1: 
			System.out.println("Numero 1");
			break;
		case 2:
			System.out.println("Numero 2");
			break;
		case 3:
			System.out.println("Numero 3");
			break;
		}
	
	
	
	String nombre = "";
	
	switch(nombre) {
	case "jose":
		System.out.println("Eres jose");
		break;
	case "javi":
		System.out.println("Eres javi");
	default:
		System.out.println("No eres nadie");
	}
	
	}
	
}
