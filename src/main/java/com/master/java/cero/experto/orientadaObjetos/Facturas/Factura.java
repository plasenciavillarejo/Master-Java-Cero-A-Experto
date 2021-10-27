package com.master.java.cero.experto.orientadaObjetos.Facturas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
	
	private int folio;
	private String descripcion;
	private Date fecha;
	private Cliente cliente;
	/* Al ser un arreglo debemos de meter un indiceItems para incrementar el indice. */
	private ItemFactura[] itemFactura;
	private int indiceItems;
	/* Creamos una Constante para el array de ItemFactura []*/
	public static final int MAX_ITEMS = 12;
	/* Creamos variable estática para incrementar el folio. */
	private static int ultimoFolio;
	
	/* Incrementamos la Factura. 
	 * Necesitamos crear un constructor para que el itemFactura se inicialice.*/
	public void addItemFactura(ItemFactura itemFactura) {
		if(indiceItems<MAX_ITEMS) {
		this.itemFactura[indiceItems++] = itemFactura;
		}
	}
	
	/* Creación del Constructor. */
	public Factura(String descripcion, Cliente cliente) {
		this.descripcion = descripcion;
		this.cliente = cliente;
		this.itemFactura = new ItemFactura[MAX_ITEMS];
		/* Incrementamos el Folio.*/
		this.folio= ++ultimoFolio;
		this.fecha = new Date();
	}
		
	public int getFolio() {
		return folio;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ItemFactura[] getItemFactura() {
		return itemFactura;
	}
	public void setItemFactura(ItemFactura[] itemFactura) {
		this.itemFactura = itemFactura;
	}
	
	/* Calculamos el total de la factura*/
	public float calcularTotalFactura() {
		float total = 0.0f;
		
		for(ItemFactura items : this.itemFactura) {
			if(items != null) {
			total += items.calcularImporte();
			}
		}
		return total;
	}
	
	/* Generamos el detalle de la factura. */
	public String generarDetalle() {
		StringBuilder sb = new StringBuilder("Factura Nº: ");
		sb.append(folio)
			.append("\nCliente: ")
			.append(this.cliente.getNombre())
			.append("\t Nif: ")
			.append(cliente.getNif())
			.append("\nDescripcion: ")
			.append(this.descripcion)
			.append("\n")
			.append("\n#\tNombre\t$\tCant.\tTotal\n");
		
		SimpleDateFormat formato = new SimpleDateFormat("dd 'de' MMMM,yyyy");
		sb.append("Fecha Emisión: ")
			.append(formato.format(this.fecha))
			.append("\n");
	
		for(ItemFactura item: this.itemFactura) {
			if(item != null) {
				sb.append("\n")
				.append(item.getProducto().getCodigo())
				.append("\t")
				.append(item.getProducto().getNombre())
				.append("\t")
				.append(item.getProducto().getPrecio())
				.append("\t")
				.append(item.getCantidad())
				.append("\t")
				.append(item.calcularImporte())
				.append("\n\n");
			}
		}
		sb.append("\nGran Total Factura: ")
			.append(calcularTotalFactura());
		
		return sb.toString();
	}
	
	
}
