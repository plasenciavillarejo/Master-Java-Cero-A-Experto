package com.master.java.cero.experto.orientadaObjetos.Facturas;

public class Producto {
	private int codigo;
	private String nombre;
	private float precio;
	/* Creamos variables para autogenerar el código. */
	private static int ultimoCodigo;
	
	/* Generamos un constructor vacío.*/
	public Producto() {
		this.codigo = ++ultimoCodigo;
	}

	public int getCodigo() {
		return codigo;
	}

	/* Lo comentamos por lo que vamos a genear auto-increment. 
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	*/
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
