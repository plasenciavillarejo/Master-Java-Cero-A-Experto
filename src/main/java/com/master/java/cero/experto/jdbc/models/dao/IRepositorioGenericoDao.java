package com.master.java.cero.experto.jdbc.models.dao;

import java.util.List;

// Hacemos la Interface Genérica 
public interface IRepositorioGenericoDao<T> {

  List<T> listar();
  
  T buscarPorId(Long id);
  
  // Este objeto nos valdrá para guardar y actualizar el mismo objeto
  void guardar(T producto);
  
  void elminar(Long id);
}
