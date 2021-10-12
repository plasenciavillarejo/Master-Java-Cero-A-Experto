package com.master.java.cero.valorReferencia;


/* 1.- Vamos a crear una clase Perosna para este ejemplo, lo recomendado es crearlo en otro paquete y llamarlo aquí.*/ 
class Persona {
	/* Private: Solo se puede leer, escribir y manipular en la misma clase. No se puede leer ni acceder desde fuera. */
	private String nombre;
	
	/* Creamos un método el cual puede modificar y cambiar el valor de nombre de la clase persona. */
	public void modificarNOmbre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	/* 2.- Creamos el método leerNombre el cual podra acceder desde fuera con leerNombre.nombre()*/
	public String leerNombre() {
		return this.nombre;
	}
}

public class PasarPorReferenciaPersona {

	public static void main(String[] args) {

			
			Persona persona = new Persona();
			
			persona.modificarNOmbre("jose");
			
			System.out.println("Iniciamos el método main");
			
			System.out.println("Nombre Incial de la persona = " + persona.leerNombre());
			
			System.out.println("Antes de llamar al metodo test");
			
			test(persona);
			
			System.out.println("Despues de llamar al método test");
			
			System.out.println("Nombre Incial de la persona = " + persona.leerNombre());
			
		}
		
		public static void test(Persona persona) {	
			
			System.out.println("Inicia el valor Test" );
			persona.modificarNOmbre("Mari Lola");
			System.out.println("Finaliza el método Test");
			
		} 

	}


