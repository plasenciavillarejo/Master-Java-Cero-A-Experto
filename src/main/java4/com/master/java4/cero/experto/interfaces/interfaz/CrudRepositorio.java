package com.master.java4.cero.experto.interfaces.interfaz;

import java.util.List;

import com.master.java4.cero.experto.interfaces.modelo.Cliente;

// Vamos a crear una clase reposotorio de forma genérica.
// Indicamos al CrudRepositorio<T>
public interface CrudRepositorio<T> {

	// Procedemos a cambiar todo la clase donde se Indique Cliente por (T)
	
	List<T> listar();

	T busquedaId(Integer id);

	void crearCliente(T cliente);

	void editarCliente(T cliente);

	void eliminar(Integer id);
}
