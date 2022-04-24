package com.master.java4.cero.experto.interfaces.main;

import java.util.List;

import com.master.java4.cero.experto.interfaces.modelo.Cliente;
import com.master.java4.cero.experto.interfaces.repositorio.ClienteListRepositorio;
import com.master.java4.cero.experto.interfaces.repositorio.CrudRepositorio;
import com.master.java4.cero.experto.interfaces.repositorio.Direccion;
import com.master.java4.cero.experto.interfaces.repositorio.OrdenableRepositorio;
import com.master.java4.cero.experto.interfaces.repositorio.PaginableRepositorio;

public class EjemploRepositorio {

	public static void main(String[] args) {

		CrudRepositorio repositorio = new ClienteListRepositorio();
		
		repositorio.crearCliente(new Cliente("Jose","Plasencia"));
		repositorio.crearCliente(new Cliente("Maria","Lara"));
		repositorio.crearCliente(new Cliente("Ana","Villarejo"));
		repositorio.crearCliente(new Cliente("Treco","Pandon"));
		
		List<Cliente> clientes = repositorio.listar();
		
		/* Utilizando un for normal
		 	for(Cliente c: clientes) {
			System.out.println(c);
		}
		*/
		
		// Utilizando expresiones lambda.
		System.out.println("\n==== LISTAMOS CLIENTE SIN PAGINADOR MEDIANTE LA INTERFAZ CLIENTELISTREPOSOTIRY ====");
		clientes.forEach(System.out::println);
		
		
		// Implementamos un Listado pagindado. Debemos de casterlo para poder invocarlo
		List<Cliente> paginable = ((PaginableRepositorio) repositorio).listar(1, 3);
		System.out.println("\n==== LISTAMOS CLIENTE CON LA INTERFACE PAGINABLEPOSITORY ====");
		paginable.forEach(System.out::println);

		
		// Implementamos un Listado ordenado. Debemos implementarlo desde la interfaz ordenable
		List<Cliente> ordenable = ((OrdenableRepositorio) repositorio).listar("nombre", Direccion.DESC);
		System.out.println("\n==== LISTAMOS CLIENTE CON LA INTERFACE ORDENABLEREPOSITORY ====");
		ordenable.forEach(System.out::println);
		
		
		// Ahora vamos a implementar una actualiación. Actualizamos el Apellido medinte su id
		Cliente actualizarDato = new Cliente("Ana", "Balbuena");
		actualizarDato.setId(3);
		repositorio.editarCliente(actualizarDato);
		
		System.out.println("\n==== ACTUALIAMOS CLIENTE ====");
		System.out.println("Validamos que hemos actualizado el apellido de Villarejo a Balbuena : \n");
		// Buscamos a Ana.
		Cliente buscarAna = repositorio.busquedaId(3);
		System.out.println(buscarAna);
		
		
		// Implementamos el eliminar. Como es un método void, se debe llamar directamnte al repositorio.eliminar();
		repositorio.eliminar(1);
		System.out.println("\n==== BORRAMOS CLIENTE ====");
		System.out.println("Procedemos a borrar el cliente con el id 1, una vez ejecutado esto no debería ser listado a continuación: \n");
		repositorio.listar().forEach(System.out::println);
		
		
		
	}

}
