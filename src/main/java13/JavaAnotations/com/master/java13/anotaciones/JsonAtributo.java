package com.master.java13.anotaciones;

import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Se indica que solamente puede ser aplicado en un campo
@Target(ElementType.FIELD)
// Cuando se ejecute
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAtributo {

	// Puede tenr atributos para esta clase
	String nombre() default"";
}
