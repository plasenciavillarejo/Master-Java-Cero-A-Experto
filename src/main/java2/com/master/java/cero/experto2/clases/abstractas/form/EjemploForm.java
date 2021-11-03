package com.master.java.cero.experto2.clases.abstractas.form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.master.java.cero.experto2.clases.abstractas.elementos.ElementoForm;
import com.master.java.cero.experto2.clases.abstractas.elementos.InputForm;
import com.master.java.cero.experto2.clases.abstractas.elementos.SelectForm;
import com.master.java.cero.experto2.clases.abstractas.elementos.TextAreaFor;
import com.master.java.cero.experto2.clases.abstractas.elementos.select.Opcion;
import com.master.java.cero.experto2.clases.abstractas.form.validador.ColumnasValidador;
import com.master.java.cero.experto2.clases.abstractas.form.validador.EmailValidador;
import com.master.java.cero.experto2.clases.abstractas.form.validador.LargoValidador;
import com.master.java.cero.experto2.clases.abstractas.form.validador.NoNuloValidador;
import com.master.java.cero.experto2.clases.abstractas.form.validador.NumeroValidador;
import com.master.java.cero.experto2.clases.abstractas.form.validador.RequeridoValidador;

public class EjemploForm {

	public static void main(String[] args) {
	
	/* 1.- Las clases Abstractas no se pueden instanciar. 
	 * 2.- Se podía crear una clase anonima a partir de una interfaz, 
	 * se llama método al vuelo 		
		
		ElementoForm el = new ElementoForm() {
			
			@Override
			public String dibujarHtml() {
				return null;
			}
		}; 
		*/
		
		InputForm username = new InputForm("username");
		/* Añadimos la clase Validadores.java*/
		username.addValidador(new RequeridoValidador());
		InputForm password = new InputForm("clase", "password");
		username.addValidador(new RequeridoValidador());
		username.addValidador(new LargoValidador(6,12));
		InputForm email = new InputForm("email","email");
		email.addValidador(new RequeridoValidador())
			 .addValidador(new EmailValidador());
		InputForm edad = new InputForm("edad", "number");
		edad.addValidador(new NumeroValidador());
		TextAreaFor experiencia = new TextAreaFor("exp", 5,9);
		experiencia.addValidador(new ColumnasValidador());
		SelectForm lenguaje = new SelectForm("lenguaje");
		lenguaje.addValidador(new NoNuloValidador());
		Opcion java = new Opcion("1", "Java");
		lenguaje.addOpcion(java);
		lenguaje.addOpcion(new Opcion("2","Python"));
		lenguaje.addOpcion(new Opcion("3","JavaScript"));
		lenguaje.addOpcion(new Opcion("4","TypeScript"));
		lenguaje.addOpcion(new Opcion("5","PHP"));
		
		username.setValor("John.doe");
		username.setValor("a123");
		email.setValor("john.doe@gmail.com");
		edad.setValor("21");
		experiencia.setValor("5 años en java.");
		java.setSelected(true);
		
		/*
		List<ElementoForm> elementos = new ArrayList<>();
		elementos.add(username);
		elementos.add(password);
		elementos.add(email);
		elementos.add(edad);
		elementos.add(experiencia);
		elementos.add(lenguaje);
		*/
		
		List<ElementoForm> elementos = Arrays.asList(
				username,
				password,
				email,
				edad,
				experiencia,
				lenguaje);
		
		for(ElementoForm e : elementos) {
			System.out.println(e.dibujarHtml());
		}
		
		/* validamos los elementos*/
		elementos.forEach(e ->{
			if(!e.esValido()) {
				e.getErrores().forEach(err -> System.out.println(err));
				}
			});
		
	}

}
