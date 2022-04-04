package com.master.java4.cero.experto.interfaces.main;

import java.util.List;

import com.master.java4.cero.experto.interfaces.modelo.Cliente;
import com.master.java4.cero.experto.interfaces.repositorio.ClienteListRepositorio;
import com.master.java4.cero.experto.interfaces.repositorio.CrudRepositorio;

public class EjemploRepositorio {

	public static void main(String[] args) {

		CrudRepositorio repositorio = new ClienteListRepositorio();
		
		repositorio.crearCliente(new Cliente("Jose","Plasencia"));
		repositorio.crearCliente(new Cliente("Maria","Lara"));
		repositorio.crearCliente(new Cliente("Ana","Villarejo"));
		repositorio.crearCliente(new Cliente("Treco","Pandon"));
		
		List<Cliente> cliente = repositorio.listar();
		for(Cliente c: cliente) {
			System.out.println(c);
		}
	}

}
