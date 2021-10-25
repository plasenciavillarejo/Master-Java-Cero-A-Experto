package com.master.java.cero.experto.orientadaObjetos;

public enum TipoAutomovil {
	SEDAN("Sedan","Auto normal",4),
	STATION_WAGON("Station Wagon","Auto grande",4),
	HATCHBACK("Hatchback","Auto compacto",4),
	PICKUP("Pickup","Auto normal",4),
	COUPE("Coupe","Auto pequeño",4),
	CONVERTIBLE("Convertible","Auto normal",2),
	FURGON("Furgon","Auto utilitario",4);
	
	// Vamos añadir atributos a los ENUM.	
	private final String nombre;
	private final String descripcion;
	private final int numeroPuerta;
	
	// Debemos de crear un constructor.
	private TipoAutomovil(String nombre,  String descripcion, int numeroPuerta) {
		this.nombre = nombre;
		this.numeroPuerta = numeroPuerta;
		this.descripcion = descripcion;
	}

	// Solo tiene elementos de electura por que no es un elemento modificable.	
	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getNumeroPuerta() {
		return numeroPuerta;
	}
	
	
}
