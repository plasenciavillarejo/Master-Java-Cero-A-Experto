package com.master.java4.cero.experto.interfaces.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.master.java4.cero.experto.interfaces.enume.Direccion;
import com.master.java4.cero.experto.interfaces.interfaz.OrdenablePaginableCrudRepositorio;
import com.master.java4.cero.experto.interfaces.modelo.Cliente;
import com.master.java4.cero.experto.interfaces.modelo.EntidadGenerica;

/* Implementación múltiple de Interfaces también conocido como Herencia múltiple de interfaces
public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio{ */

// Optimizamos la implemenación de las herencias de interfaces, creando una sola interfaz que englobe a todas.	
// Ahora como está siendo una clase implementada de forma genérica, añadiendo el <Cliente> ya tendríamos nuestra clase herededada.
// Cambiamos la clase por abstracta para ponerla totalmente genérica.
public abstract class AbstractListRepositorio<T extends EntidadGenerica> implements OrdenablePaginableCrudRepositorio<T>{
	
	
	// Simulamos una fuente de datos.
	// Ponemos los métodos protected para que lo podamos reutilizar
	protected List<T> dataSource;
	
	
	// Constructor para inicializar el ArrayList de datasource	
	public AbstractListRepositorio(){
		this.dataSource = new ArrayList<>();
	}
	
	@Override
	public List<T> listar() {
		return dataSource;
	}

	@Override
	public void crearCliente(T t) {
		this.dataSource.add(t);
	}

	/* Para utilizar el método remove debemos implementar en la clase Cliente un método equals, que es el que compara los ID para eliminar
	 Se implementar de forma automática */
	@Override
	public void eliminar(Integer id) {
		this.dataSource.remove(this.busquedaId(id));
	}


	// Una forma de abreviar la paginación de arriba es implementando el siguiente método.
	
	@Override
	public List<T> listar(int desde, int hasta) {	
	
		// Implementamos un subList(desde,hasta). Tenemos un subconjunto paginado.
		return dataSource.subList(desde, hasta);
	}

	// Vamos a devolver el númeor de registros que cuenta nuestro dataSource
	@Override
	public int total() {
		return dataSource.size();
	}


	// Utilizamos el método para buscar por ID de forma genérica.
	@Override
	public T busquedaId(Integer id) {
		T clienteEncontrado = null;

		for (T t : dataSource) {
			if (t.getId() != null && t.getId().equals(id)) {
				clienteEncontrado = t;
				break;
			}
		}
		return clienteEncontrado;
	}
	



}
