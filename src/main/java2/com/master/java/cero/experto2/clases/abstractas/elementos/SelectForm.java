package com.master.java.cero.experto2.clases.abstractas.elementos;

import java.util.ArrayList;
import java.util.List;

import com.master.java.cero.experto2.clases.abstractas.elementos.select.Opcion;

public class SelectForm extends ElementoForm{

	/* Colección de objetos -> Pasamos una Lista y seleccionamos un elemento.*/
	
	private List<Opcion> opciones;
	

	public SelectForm(String nombre) {
		super(nombre);
		this.opciones = new ArrayList<Opcion>();
	}

	public SelectForm(String nombre, List<Opcion> opciones) {
		this(nombre);
		this.opciones = opciones;
	}

	/* Implementamos el método get para poder obtener las opciones.*/
	
	public SelectForm addOpcion(Opcion opcion) {
		this.opciones.add(opcion);
		return this;
	}
	
	
	@Override
	public String dibujarHtml() {
		StringBuilder sb = new StringBuilder("<select ")
				.append("name ='")
				.append(this.nombre)
				.append("'>");
		
		for(Opcion opcion: this.opciones) {
			sb.append("\n <option value='")
				.append(opcion.getValor())
				.append("'");
			if(opcion.isSelected()) {
				sb.append(" selected");
				this.valor = opcion.getValor();
			}
			sb.append(">")
				.append(opcion.getNombre())
				.append("</option>");
		}
		sb.append("")
		.append("</selected>");
		return sb.toString();
	}

}
