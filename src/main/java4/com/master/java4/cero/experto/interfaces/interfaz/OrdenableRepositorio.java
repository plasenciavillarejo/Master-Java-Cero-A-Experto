package com.master.java4.cero.experto.interfaces.interfaz;

import java.util.List;

import com.master.java4.cero.experto.interfaces.enume.Direccion;
import com.master.java4.cero.experto.interfaces.modelo.Cliente;


public interface OrdenableRepositorio<T> {

	// Vamos a tener una sobrecarga de métodos para ordenar los métodos.
	
	List<T> listar(String campo, Direccion dir);
	
}
