package com.master.java4.cero.experto.interfaces.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.master.java4.cero.experto.interfaces.enume.Direccion;
import com.master.java4.cero.experto.interfaces.interfaz.OrdenablePaginableCrudRepositorio;
import com.master.java4.cero.experto.interfaces.modelo.Cliente;

/* Implementación múltiple de Interfaces también conocido como Herencia múltiple de interfaces
public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio{ */

// Optimizamos la implemenación de las herencias de interfaces, creando una sola interfaz que englobe a todas.	
public class ClienteListRepositorio implements OrdenablePaginableCrudRepositorio{
	
	
	// Simulamos una fuente de datos.
	private List<Cliente> dataSource;
	
	// Constructor para inicializar el ArrayList de datasource
	
	public ClienteListRepositorio(){
		this.dataSource = new ArrayList<>();
	}
	
	@Override
	public List<Cliente> listar() {
		return dataSource;
	}


	@Override
	public Cliente busquedaId(Integer id) {
		Cliente clienteEncontrado = null;
		
		for(Cliente cliente : dataSource) {
			if(cliente.getId() != null && cliente.getId().equals(id)) {
				clienteEncontrado = cliente;
				break;
			}
		}
		return clienteEncontrado;
	}

	@Override
	public void crearCliente(Cliente cliente) {
		this.dataSource.add(cliente);
	}

	@Override
	public void editarCliente(Cliente cliente) {
		Cliente editarCliente = this.busquedaId(cliente.getId());
		editarCliente.setApellido(cliente.getApellido());
		editarCliente.setNombre(cliente.getNombre());
	}

	// Para utilizar el método remove debemos implementar en la clase Cliente un método equals, que es el que compara los ID para eliminar
	// Se implementar de forma automática
	@Override
	public void eliminar(Integer id) {
		this.dataSource.remove(this.busquedaId(id));
	}

	/* 
	 
	  Vamos a implementar una mejora a este método.
	  
	@Override
	public List<Cliente> listar(String campo, Direccion dir) {
		// Ordenamos utilizando el método sort que implementa una clase de forma anónima.
		dataSource.sort(new Comparator<Cliente>() {

			// El método compareTo compara un número entero por lo que debemos de crear una variable int resultado.
			@Override
			public int compare(Cliente a, Cliente b) {
				// 1º Ordenamos por dirección.
				int resultado = 0;
				if(dir == Direccion.ASC) {
					switch (campo) {
					case "id":
						resultado = a.getId().compareTo(b.getId());
					case "nombre":
						resultado = a.getNombre().compareTo(b.getNombre());
					case "apelido":
							resultado = a.getApellido().compareTo(b.getApellido());
					}	
				}else if(dir == Direccion.DESC) {
					switch (campo) {
					case "id":
						resultado = b.getId().compareTo(a.getId());
					case "nombre":
						resultado = b.getNombre().compareTo(a.getNombre());
					case "apelido":
							resultado = b.getApellido().compareTo(a.getApellido());
					}
				}
				return resultado;
			}
		});
		return dataSource;
	}

*/

	/* Implemenamos la optimización de la lista ordenada del método anterior a este. */
	
	@Override
	public List<Cliente> listar(String campo, Direccion dir) {
		List<Cliente> listaOrdenada = new ArrayList<Cliente>( this.dataSource);
		
		listaOrdenada.sort((Cliente a, Cliente b) ->{
			
				// 1º Ordenamos por dirección.
				int resultado = 0;
				if(dir == Direccion.ASC) {
					resultado = ordernar(campo, a, b);
				
				}else if(dir == Direccion.DESC) {
					resultado = ordernar(campo, b, a);

				}
				return resultado;
		});
		return listaOrdenada;
	}
	
	private static int ordernar(String campo, Cliente a , Cliente b) {
		int resultado = 0;
		
		switch(campo) {
			case "id":
				resultado = a.getId().compareTo(b.getId());
			case "nombre":
				resultado = a.getNombre().compareTo(b.getNombre());
			case "apellido":
				resultado = a.getApellido().compareTo(b.getApellido());
		}
		return resultado;
	}
	
	
	
	// Una forma de abreviar la paginación de arriba es implementando el siguiente método.
	
	@Override
	public List<Cliente> listar(int desde, int hasta) {	
		
		// Implementamos un subList(desde,hasta). Tenemos un subconjunto paginado.
		return dataSource.subList(desde, hasta);
	}

	// Vamos a devolver el númeor de registros que cuenta nuestro dataSource
	@Override
	public int total() {
		return dataSource.size();
	}





}
