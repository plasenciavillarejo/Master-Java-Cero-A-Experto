package com.master.java.cero.experto.herencia;

public class AlumnoInternacional extends Alumno{
	private String pais;
	private double notaIdiomas;
	
	public AlumnoInternacional() {
		System.out.println("AlumnoInternacional: Inicializando el constructor");
	}
	
	/* Constructo que se hereda del padre Alumno que a su vez depende de Persona.*/
	public AlumnoInternacional(String nombre, String apellido) {
		super(nombre,apellido);
	}
	
	public AlumnoInternacional(String nombre, String apellido, String pais) {
		this(nombre,apellido);
		this.pais = pais;
	}
	
	/* Método para imprimir por pantalla. */
	public String imprimirAlumnoInternacional(Alumno alumno) {
		StringBuilder sb = new StringBuilder();
		sb.append(" Nombre Persona heredada de AlumnoInternacional: " + alumno.getNombre())
			.append("\n Apellido persona Heredada de AlumnoInternacional: " + alumno.getApellido())
			.append("\n Pais AlumnoInternacional: " + this.pais);
		
		return sb.toString();
	}
	
	
	
	
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public double getNotaIdiomas() {
		return notaIdiomas;
	}
	public void setNotaIdiomas(double notaIdiomas) {
		this.notaIdiomas = notaIdiomas;
	}
	
	
}
