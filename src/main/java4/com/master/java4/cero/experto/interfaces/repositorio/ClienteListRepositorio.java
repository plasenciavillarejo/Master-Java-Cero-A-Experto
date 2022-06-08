package com.master.java4.cero.experto.interfaces.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.master.java4.cero.experto.interfaces.enume.Direccion;
import com.master.java4.cero.experto.interfaces.interfaz.OrdenablePaginableCrudRepositorio;
import com.master.java4.cero.experto.interfaces.modelo.Cliente;

/* Implementación múltiple de Interfaces también conocido como Herencia múltiple de interfaces
public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio{ */

// Vamos a heredar de nuestra clase abstracta genérica
public class ClienteListRepositorio extends AbstractListRepositorio<Cliente> {

	@Override
	public Cliente busquedaId(Integer id) {
		Cliente clienteEncontrado = null;

		for (Cliente cliente : dataSource) {
			if (cliente.getId() != null && cliente.getId().equals(id)) {
				clienteEncontrado = cliente;
				break;
			}
		}
		return clienteEncontrado;
	}

	@Override
	public void editarCliente(Cliente cliente) {
		Cliente editarCliente = this.busquedaId(cliente.getId());
		editarCliente.setApellido(cliente.getApellido());
		editarCliente.setNombre(cliente.getNombre());
	}

	/*
	 * Implemenamos la optimización de la lista ordenada del método anterior a este.
	 */
	
	@Override
	public List<Cliente> listar(String campo, Direccion dir) {
		List<Cliente> listaOrdenada = new ArrayList<Cliente>(this.dataSource);

		listaOrdenada.sort((Cliente a, Cliente b) -> {

			// 1º Ordenamos por dirección.
			int resultado = 0;
			if (dir == Direccion.ASC) {
				resultado = ordernar(campo, a, b);

			} else if (dir == Direccion.DESC) {
				resultado = ordernar(campo, b, a);

			}
			return resultado;
		});
		return listaOrdenada;
	}

	private static int ordernar(String campo, Cliente a, Cliente b) {
		int resultado = 0;

		switch (campo) {
		case "id":
			resultado = a.getId().compareTo(b.getId());
		case "nombre":
			resultado = a.getNombre().compareTo(b.getNombre());
		case "apellido":
			resultado = a.getApellido().compareTo(b.getApellido());
		}
		return resultado;
	}

}
