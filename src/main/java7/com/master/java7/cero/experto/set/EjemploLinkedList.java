package com.master.java7.cero.experto.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import com.master.java7.cero.experto.modelo.Alumno;

public class EjemploLinkedList {

	public static void main(String[] args) {
	
		LinkedList<Alumno> alumnoLista = new LinkedList<Alumno>();

		alumnoLista.add(new Alumno("Jose", 5));
		alumnoLista.add(new Alumno("Mariano", 8));
		alumnoLista.add(new Alumno("Rosa", 7));
		alumnoLista.add(new Alumno("Poseidon", 4));
		alumnoLista.add(new Alumno("Omar", 10));
		alumnoLista.add(new Alumno("Omar", 10));
		
		
		System.out.println(" =====================================================================================================");
		System.out.println(" Vamos añadir más alumnos a la lista enlazada que es mucho más rapida y eficiente que un ArrayList()");
		System.out.println(" ===================================================================================================== \n");
		
		alumnoLista.addFirst(new Alumno("Pepe", 5));
		alumnoLista.addLast(new Alumno("Lorca", 5));
		
		System.out.println(alumnoLista);
		
		System.out.println(" ==========================================================");
		System.out.println(" Vamos a obtener el primer y último elemento del LinkedList");
		System.out.println(" ========================================================== \n");
		
		System.out.println("Primer Alumno: " + alumnoLista.getFirst());
		System.out.println("Último Alumno: " + alumnoLista.getLast());
		System.out.println("Mostrando el alumno que se encuentra en el índice 2: " + alumnoLista.get(2));
		
		
		System.out.println(" ==========================================================");
		System.out.println(" Vamos a eliminar el primer y último elemento del LinkedList");
		System.out.println(" ========================================================== \n");
		
		System.out.println("Primer Alumno eliminado : " + alumnoLista.removeFirst());
		System.out.println("Segundo Alumno eliminado : " + alumnoLista.removeLast());
		System.out.println("Alumno Totales: \n"+ alumnoLista);
		
		
		System.out.println(" ===================================");
		System.out.println(" Iteramos utilizando List.Iterator() utilizando hasNext");
		System.out.println(" =================================== \n");
		
		ListIterator<Alumno> listIterator = alumnoLista.listIterator();
		
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
		
		
		System.out.println(" ===================================");
		System.out.println(" Iteramos utilizando List.Iterator() utilizando Previous");
		System.out.println(" =================================== \n");
		
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}
		
		
	}
}