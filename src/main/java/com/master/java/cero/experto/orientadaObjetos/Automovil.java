package com.master.java.cero.experto.orientadaObjetos;

public class Automovil {
	
	String fabricante;
	String modelo;
	String color = "gris";
	double cilindrada;
	int capacidadEstanque = 40;
	
	/* 1.- Static= Hace que el atributo sea de la clase.
	 * 2.- Final = Hace que el atributo sea una constante y no se pueda modificar en la herencia .*/
	
	public String verDetalle() {
		/* 1.- Mostramos el detalle del Automovil.
		 * 2.- Siempre que quiera acceder aun método de la misma clase tengo que usar el -> "this." */
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("auto.fabricante = " + this.fabricante);
		sb.append("\nauto.modelo = " + this.modelo);
		sb.append("\nauto.color = " + this.color);
		sb.append("\nauto.cilindrada = " + this.cilindrada);
		
		return sb.toString();
	}
	
	public String acelerar(int rpm) {
		return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm";
	}
	
	public String frenar() {
		return this.fabricante + " " + this.modelo + " frenando!";
	}
	
	public String acelerarFrenar(int rpm) {
		String acelerar = this.acelerar(rpm);
		String frenar = this.frenar();
		
		return acelerar + "\n" + frenar;
	}
	
	/* Calculamos la cantidad de gasolina gastada*/
	
	public float calcularConsumo(int km, float porcentajeGasolina) {
		return km/(capacidadEstanque*porcentajeGasolina);
	}
	
	/* Otra versión con mismo nombre diferentes métodos -> Se llama sobrecarga de métodos, mismo método pero diferentes tipos de entrada
	 * También llamado principio de Encapsulamiento. */
	
	public float calcularConsumo(int km, int porcentajeGasolina) {
		return km/(capacidadEstanque*(porcentajeGasolina/100f));
	}
	
	
	
	
	
	
}
