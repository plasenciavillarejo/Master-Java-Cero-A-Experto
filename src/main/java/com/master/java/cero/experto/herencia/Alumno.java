package com.master.java.cero.experto.herencia;

/* 1.- Alumno es clase Hija (extends) de Persona*/
public class Alumno extends Persona{

	private String colegio;
	private double notaMatematica;
	private double notaCastellano;
	private double notaHistoria;
	
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
