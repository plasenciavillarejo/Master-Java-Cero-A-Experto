package com.master.java4.cero.experto.interfaces.interfaz;

import java.util.List;

import com.master.java4.cero.experto.interfaces.modelo.Cliente;

public interface PaginableRepositorio<T> {

	List<T> listar(int desde, int hasta);
}
