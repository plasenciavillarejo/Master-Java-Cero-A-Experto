package com.master.java.cero.experto.orientadaObjetos.Facturas;

public class ItemFactura {
	
	private int cantidad;
	private Producto producto;
	
	
	/*Constructor para que inicialice cantidad y producto.*/	
	public ItemFactura(int cantidad, Producto producto) {
		this.cantidad = cantidad;
		this.producto = producto;
	}
	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	/* Calculamos la factura. */	
	public float calcularImporte() {
		return this.cantidad * this.producto.getPrecio(); 
	}
	
	
}
