package com.master.java.cero.experto.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.master.java.cero.experto.jdbc.models.dao.IRepositorioGenericoDao;
import com.master.java.cero.experto.jdbc.models.dao.impl.ProductoDaoImpl;
import com.master.java.cero.experto.jdbc.models.entity.Producto;
import com.master.java.cero.experto.jdbc.util.ConexionBbdd;

public class EjemploMainJdbc {

  private static final Logger LOGGER = LoggerFactory.getLogger(EjemploMainJdbc.class);
    
  public static void main(String[] args) {
    
    // DriverManagement se encarga de adminstrar las conexiones y los drivers que tengamos disponibles
    try(Connection conn = ConexionBbdd.getInstance()) {      
      IRepositorioGenericoDao<Producto> repositorio = new ProductoDaoImpl();
      repositorio.listar().forEach(resultado -> 
      LOGGER.info("Id Producto: '{}', Nombre Producto: '{}', Precio Producto: '{}'", 
          resultado.getId(),
          resultado.getNombre(),
          resultado.getPrecio()));
      
      LOGGER.info("Se procede a buscar el productor por el ID 2");
      repositorio.buscarPorId(2L);
      
    } catch (SQLException e) {
      LOGGER.error("Error al realizar la conexión a la BBDD: {}",e.getMessage(), e.getCause());
    } 
  }

}