package com.master.java4.cero.experto.interfaces.interfaz;

/* INTERFAZ QUE VA A ENGLOBAR TODAS LAS INTERFACES EN UNA SOLA
Extends si que pueda heredas de múltiples interfaces
*/
public interface OrdenablePaginableCrudRepositorio
		extends CrudRepositorio, OrdenableRepositorio, PaginableRepositorio, ContarRepositorio {

}
