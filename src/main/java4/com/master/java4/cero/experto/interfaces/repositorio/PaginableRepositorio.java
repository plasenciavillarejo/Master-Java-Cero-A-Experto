package com.master.java4.cero.experto.interfaces.repositorio;

import java.util.List;

import com.master.java4.cero.experto.interfaces.modelo.Cliente;

public interface PaginableRepositorio {

	List<Cliente> listar(int desde, int hasta);
}
