package com.master.java4.cero.experto.interfaces.main;

import java.util.List;

import com.master.java4.cero.experto.interfaces.enume.Direccion;
import com.master.java4.cero.experto.interfaces.interfaz.CrudRepositorio;
import com.master.java4.cero.experto.interfaces.interfaz.OrdenablePaginableCrudRepositorio;
import com.master.java4.cero.experto.interfaces.interfaz.OrdenableRepositorio;
import com.master.java4.cero.experto.interfaces.interfaz.PaginableRepositorio;
import com.master.java4.cero.experto.interfaces.modelo.Cliente;
import com.master.java4.cero.experto.interfaces.repositorio.AbstractListRepositorio;
import com.master.java4.cero.experto.interfaces.repositorio.ClienteListRepositorio;

public class EjemploRepositorio {

	public static void main(String[] args) {
		
		
		// Al heredar de la interfaz padre, ahora no es necesario hacer el cast de las clases ya que está engloba a todas.
		OrdenablePaginableCrudRepositorio<Cliente> repositorio = new ClienteListRepositorio();
		
		repositorio.crearCliente(new Cliente("Jose","Plasencia"));
		repositorio.crearCliente(new Cliente("Maria","Lara"));
		repositorio.crearCliente(new Cliente("Ana","Villarejo"));
		repositorio.crearCliente(new Cliente("XATA","London"));
		
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
		//List<Cliente> paginable = ((PaginableRepositorio) repositorio).listar(1, 3);
		
		// No es necesario hacer el cast ya que la interfaz padre hereda de todas
		List<Cliente> paginable = repositorio.listar(1, 3);
		System.out.println("\n==== LISTAMOS CLIENTE CON LA INTERFACE PAGINABLEPOSITORY ====");
		paginable.forEach(System.out::println);

		
		// Implementamos un Listado ordenado. Debemos implementarlo desde la interfaz ordenable
		//List<Cliente> ordenable = ((OrdenableRepositorio) repositorio).listar("nombre", Direccion.DESC);
		
		// No es necesario hacer el cast ya que la interfaz padre hereda de todas
		List<Cliente> ordenable = repositorio.listar("nombre", Direccion.DESC);
		System.out.println("\n==== LISTAMOS CLIENTE CON LA INTERFACE ORDENABLEREPOSITORY ====");
		ordenable.forEach(System.out::println);
		
		
		// Ahora vamos a implementar una actualiación. Actualizamos el Apellido medinte su id
		Cliente actualizarDato = new Cliente("Ana", "Balbuena");
		actualizarDato.setId(3);
		repositorio.editarCliente(actualizarDato);
		
		System.out.println("\n==== ACTUALIAMOS CLIENTE ====");
		System.out.println("Validamos que hemos actualizado el apellido de Villarejo a Balbuena : \n");
		// Buscamos a Ana.
		Object buscarAna = repositorio.busquedaId(3);
		System.out.println(buscarAna);
		
		
		// Implementamos el eliminar. Como es un método void, se debe llamar directamnte al repositorio.eliminar();
		repositorio.eliminar(1);
		System.out.println("\n==== BORRAMOS CLIENTE ====");
		System.out.println("Procedemos a borrar el cliente con el id 1, una vez ejecutado esto no debería ser listado a continuación: \n");
		repositorio.listar().forEach(System.out::println);
		
		
		// Implementamos el método que devuelve los numeros de registro que cuenta nuestro dataSource.
		System.out.println("\n==== CONTAMOS LOS CLIENTES ====");
		int contarRegistros = repositorio.total();
		System.out.println("Hay un total de " + contarRegistros + " clientes.");
		
		
	}

}
