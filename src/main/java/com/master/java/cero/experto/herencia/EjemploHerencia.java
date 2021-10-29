package com.master.java.cero.experto.herencia;

public class EjemploHerencia {

	public static void main(String[] args) {
		
		/* Al ejecutar la Instancia de Alumno, primero se Imprime el padre (Persona) y luego el Alumno.*/
		System.out.println("======== Creando la Instnacia a Alumno.java ==========");
		Alumno alumno = new Alumno();
		/* Accedemos a los métodos de persona (Herencia) */
		alumno.setNombre("Jose");
		alumno.setApellido("Plasencia");
		alumno.setNotaCastellano(5.5);
		alumno.setNotaMatematica(4);
		System.out.println("======== Finalizando la Instancia hacia el padre ========");
		System.out.println("");
				

		/* Implementacion del constructor Alumno con 4 parámetros de entrada. */
		Alumno alumno4Parametros = new Alumno("4parametros","Entrada",7,"Aguilas");
		
		/* Al ejecutar la Instancia de AlumnoInternacional, primero se Imprime el padre (Persona),
		 *  luego el Alumno y por último AlumnoInternacional.*/
		System.out.println("======== Creando la Instnacia a AlumnoInternacional.java ==========");
		AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
		alumnoInternacional.setNombre("Pepe Italiano");
		alumnoInternacional.setPais("Italia");
		System.out.println("======== Finalizando la instancia hacia el padre ========");
		System.out.println("");
		

		System.out.println("======== Creando la Instnacia a Profesor.java ==========");
		Profesor profesor = new Profesor();
		profesor.setNombre("Lola");
		profesor.setApellido("Lelis");
		profesor.setAsignatura("Programación");
		System.out.println("======== Finalizando la instancia hacia el padre ");
		System.out.println("");
		
		/* Implementacion del constructor Profesor con 2 parámetros de entrada*/
		Profesor profesor2 = new Profesor("Pepe","Garcia");

		Persona persona = new Persona("Prue","aa",1);
		System.out.println(persona.imprimirPersona());
		System.out.println();
		
		
		/* Implementación del constructor Alumno con 7 parámetros de entrada. */
		Alumno alumno7Parametros = new Alumno("Dominator","Lopez",22,"UJAEN",5.8,7.7,9.56);
		System.out.println(alumno7Parametros.imprimirAlumno(alumno7Parametros));
		System.out.println();
		
		/* Implementacíon del constructor AlumnoInternacional con 3 parámetros de entrada*/
		AlumnoInternacional alumnoInternacional2 = new AlumnoInternacional("Gabriele","Luca","Italia");
		System.out.println(alumnoInternacional2.imprimirAlumnoInternacional(alumnoInternacional2));
	}

}
