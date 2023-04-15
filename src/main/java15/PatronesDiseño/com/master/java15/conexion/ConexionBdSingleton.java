package com.master.java15.conexion;

public class ConexionBdSingleton {

	// 1.- Tenemos que crear un atributo estático para poder reutilizarlo desde cualquier parte.
	//  	a) Debe ser de el mismo tipo de la clase -> ConexionBdSingleton
	
	private static ConexionBdSingleton instancia;
	
	/* 2.- Procedemos a crear un constructor pero evitamos utilizar el new ya que
	 		queremos restringir la creación a una sola instancia 
	   
	   3.- El constructor será privado para no crear una instancia desde fuera*/

	private ConexionBdSingleton() {
		System.out.println("Conectando a un motor de BBDD.");
	}
	
	// 4.- Devolvemos la instancia
	
	public static ConexionBdSingleton getInstance() {
		if(instancia == null) {
			instancia = new ConexionBdSingleton();
		}
		return instancia;		
	}
	
}
