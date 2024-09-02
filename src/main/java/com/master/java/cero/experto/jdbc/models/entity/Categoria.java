package com.master.java.cero.experto.jdbc.models.entity;

import java.io.Serializable;

public class Categoria implements Serializable {

  private Long categoriaId;

  private String nombreCategoria;

  public Categoria() {
    super();
  }

  public Categoria(Long categoriaId, String nombreCategoria) {
    super();
    this.categoriaId = categoriaId;
    this.nombreCategoria = nombreCategoria;
  }

  public Long getCategoriaId() {
    return categoriaId;
  }

  public void setCategoriaId(Long categoriaId) {
    this.categoriaId = categoriaId;
  }

  public String getNombreCategoria() {
    return nombreCategoria;
  }

  public void setNombreCategoria(String nombreCategoria) {
    this.nombreCategoria = nombreCategoria;
  }

  private static final long serialVersionUID = -3844589165772590243L;

}
