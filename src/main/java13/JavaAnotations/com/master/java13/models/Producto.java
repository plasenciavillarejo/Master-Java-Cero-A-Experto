package com.master.java13.models;

import java.time.LocalDate;

import com.master.java13.anotaciones.JsonAtributo;

public class Producto {
	
	// Cada atributo que anotamos con @JsonAtributo se va a exportar a Json
	// Por defecto le damos un nombre
	@JsonAtributo(nombre = "descripcion")
	private String nombre;
	
	@JsonAtributo
	private Long precio;
	
	private LocalDate fecha;

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

}
