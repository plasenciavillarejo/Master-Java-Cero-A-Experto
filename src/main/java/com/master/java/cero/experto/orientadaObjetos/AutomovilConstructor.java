package com.master.java.cero.experto.orientadaObjetos;

public class AutomovilConstructor {


	private String fabricante;
	private String modelo;
	private String color = "gris";
	private double cilindrada;
	private int capacidadEstanque = 40;
	
	/* 1.- Creamos el constructor public. Sirve para prepara el método inicilizando. */
	public AutomovilConstructor(String fabricante, String modelo) {
		this.fabricante = fabricante;
		this.modelo = modelo;
	}
	
	
	
	
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
	 * También llamado principio de Encapsulamiento.
	 * Esté metodo también utiliza el polimorfismo -> Diferentes formar para realizar la misma acción. */
	
	public float calcularConsumo(int km, int porcentajeGasolina) {
		return km/(capacidadEstanque*(porcentajeGasolina/100f));
	}
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getCapacidadEstanque() {
		return capacidadEstanque;
	}

	public void setCapacidadEstanque(int capacidadEstanque) {
		this.capacidadEstanque = capacidadEstanque;
	}

	public String acelerar(int rpm) {
		return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm";
	}
}
