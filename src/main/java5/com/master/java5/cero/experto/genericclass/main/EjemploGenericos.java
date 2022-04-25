package com.master.java5.cero.experto.genericclass.main;

import com.master.java5.cero.experto.genericclass.Animal;
import com.master.java5.cero.experto.genericclass.Camion;
import com.master.java5.cero.experto.genericclass.Maquinaria;

public class EjemploGenericos {

	public static void main(String[] args) {
		
		// Como la clase Camion esta implementando la interfaz Iterable, el propio método ya se puede iterar sin ningun tipo de problema.
		Camion<Animal> transporteCaballos = new Camion<>(5);
		transporteCaballos.add(new Animal("Peregrino", "Caballo"));
		transporteCaballos.add(new Animal("PepeGrillo", "CaballoBueno"));
		transporteCaballos.add(new Animal("CaballoBlanco", "CaballoMalo"));
		
		for(Animal a: transporteCaballos) {
			System.out.println(a.getNombre() + " y el tipo es " + a.getTipo());
		}
		
		
		Camion<Maquinaria> transMaquinas = new Camion<>(3);
		transMaquinas.add(new Maquinaria("a"));
		transMaquinas.add(new Maquinaria("b"));
		transMaquinas.add(new Maquinaria("c"));
		
		transMaquinas.forEach(System.out::println);
	}

}
