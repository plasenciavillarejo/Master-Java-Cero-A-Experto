package com.master.java4.cero.experto.interfaces.repositorio;

import java.util.List;

import com.master.java4.cero.experto.interfaces.modelo.Cliente;

public interface CrudRepositorio {

	List<Cliente> listar();

	Cliente busquedaId(Integer id);

	void crearCliente(Cliente cliente);

	void editarCliente(Cliente cliente);

	void eliminar(Integer id);
}
