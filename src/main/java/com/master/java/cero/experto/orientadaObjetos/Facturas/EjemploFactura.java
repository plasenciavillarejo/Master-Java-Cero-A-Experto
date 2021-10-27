package com.master.java.cero.experto.orientadaObjetos.Facturas;

import java.util.Scanner;

public class EjemploFactura {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
	
		cliente.setNif("26245446P");
		cliente.setNombre("Jose");
		
		/* Metemos la factura mediante el scanner */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese una descripcion de la factura");
		String descripcion = scanner.nextLine();
		Factura factura = new Factura(descripcion, cliente);
		
		
		Producto producto;
		String nombre;
		float precio;
		int cantidad;
		
		System.out.println();
		
		for(int i=0; i<2; i ++) {
			
			producto = new Producto();
			System.out.print("Ingrese el producto nº " + producto.getCodigo() + ": ");
			nombre = scanner.next();
			producto.setNombre(nombre);
			
			System.out.print("Ingrese el precio: ");		
			precio = scanner.nextFloat();
			producto.setPrecio(precio);
			
			System.out.print("Ingrese la cantidad: ");
			cantidad = scanner.nextInt();
			
			ItemFactura item = new ItemFactura(cantidad, producto);
		/*Agregamos la factura a la linea */	
			factura.addItemFactura(item);
			
			System.out.println();
			
			
			
		}
		System.out.println(factura.generarDetalle());
		
		
		
		
		
		
		
		
		
	}

}
