package com.master.java4.cero.experto.interfaces.repositorio;

import java.util.List;

import com.master.java4.cero.experto.interfaces.modelo.Cliente;


public interface OrdenableRepositorio {

	// Vamos a tener una sobrecarga de métodos para ordenar los métodos.
	
	List<Cliente> listar(String campo, Direccion dir);
	
}
