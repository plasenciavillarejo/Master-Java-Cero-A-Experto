package com.master.java.cero.experto.herencia;

/* 1.- Alumno es clase Hija (extends) de Persona*/
public class Alumno extends Persona{

	private String colegio;
	private double notaMatematica;
	private double notaCastellano;
	private double notaHistoria;
	
	public Alumno() {
		// Invoco el constructor del padre.
		super();
		System.out.println("Alumno: Inicializando el constructor...");
	}
	
	/* Creamos un 2 constructor el cual hace referencia al padre, hereda el nombre y apellido*/
	public Alumno (String nombre, String apellido) {
		/* Con super() -> Hace referencia a los parámetros del padre 
		 * Tenemos que indicar el constructor que queremos llamar del padre.(Forma Explicita)*/
		super(nombre,apellido);
	}
	
	public Alumno(String nombre, String apellido, int edad) {
		super(nombre,apellido,edad);	
	}
	
	public Alumno(String nombre, String apellido, int edad,String colegio) {
		super(nombre,apellido,edad);
		this.colegio = colegio;
	}	
	public Alumno(String nombre, String apellido, int edad, String colegio,
			double notaMatematica, double notaCastellano, double notaHistoria) {
		/* reutilizamos el constructor de arriba con this()*/
		this(nombre,apellido,edad,colegio);
		this.notaMatematica = notaMatematica;
		this.notaCastellano = notaCastellano;
		this.notaHistoria = notaHistoria;
	}
	
	public String imprimirAlumno(Persona persona) {
		StringBuilder sb = new StringBuilder();
		sb.append(" Nombre Persona: " + persona.getNombre())
			.append("\n Apellido Persona: " + persona.getApellido())
			.append("\n Edad Persona:" + persona.getEdad())
			.append("\n Colegio Alumno: " + this.colegio)
			.append("\n Nota Matematica: " + this.notaMatematica)
			.append("\n Nota Historia: " + this.notaHistoria)
			.append("\n Nota Castellano: " + this.notaCastellano);
		
		return sb.toString();
	}
	
	
	
	public String getColegio() {
		return colegio;
	}
	public void setColegio(String colegio) {
		this.colegio = colegio;
	}
	public double getNotaMatematica() {
		return notaMatematica;
	}
	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}
	public double getNotaCastellano() {
		return notaCastellano;
	}
	public void setNotaCastellano(double notaCastellano) {
		this.notaCastellano = notaCastellano;
	}
	public double getNotaHistoria() {
		return notaHistoria;
	}
	public void setNotaHistoria(double notaHistoria) {
		this.notaHistoria = notaHistoria;
	}
	
	
	
}
