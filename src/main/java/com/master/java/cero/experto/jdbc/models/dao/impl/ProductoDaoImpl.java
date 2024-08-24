package com.master.java.cero.experto.jdbc.models.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.master.java.cero.experto.jdbc.models.dao.IRepositorioGenericoDao;
import com.master.java.cero.experto.jdbc.models.entity.Producto;
import com.master.java.cero.experto.jdbc.util.ConexionBbdd;

public class ProductoDaoImpl implements IRepositorioGenericoDao<Producto> {
  
  private static final Logger LOGGER = LoggerFactory.getLogger(ProductoDaoImpl.class);

  
  // Método que devuelva la conexíon a la BBDD  
  public Connection getConnection() throws SQLException {
    return ConexionBbdd.getInstance();
  }
  
  @Override
  public List<Producto> listar() {
    List<Producto> productos = new ArrayList<>();
    try(Statement stmt = getConnection().createStatement();
        ResultSet rs = stmt.executeQuery("Select * from productos")) {
      while (rs.next()) {
        Producto p = crearProducto(rs);
        productos.add(p);
      }
    } catch (Exception e) {
      LOGGER.error(e.getMessage(), e.getCause());
    }
    return productos;
  }

  @Override
  public Producto buscarPorId(Long id) {
    Producto producto = null;
    try(PreparedStatement stmt = getConnection()
        .prepareStatement("select * from productos where id = ?")) {
      // Indicamos el índice del valor "1" que es donde se ubica el "id"
      stmt.setLong(1, id);
      
      // Ejecutamos la query
      ResultSet rs = stmt.executeQuery();      
      if(rs.next()) {
        producto = crearProducto(rs);
        LOGGER.info("Id Producto: '{}', Nombre Producto: '{}', Precio Producto: '{}',"
            + "Fecha Registro: {}", 
            producto.getId(),
            producto.getNombre(),
            producto.getPrecio(),
            producto.getFechaRegistro());
      }
      rs.close();
    } catch (SQLException e) {
      LOGGER.error(e.getMessage(), e.getCause());
    }
    return producto;
  }

  @Override
  public void guardar(Producto objeto) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void elminar(Long id) {
    // TODO Auto-generated method stub
    
  }

  private Producto crearProducto(ResultSet rs) throws SQLException {
    Producto p = new Producto();
    p.setId(rs.getLong("id"));
    p.setNombre(rs.getString("nombre"));
    p.setPrecio(rs.getInt("precio"));
    p.setFechaRegistro(rs.getDate("fecha_registro"));
    return p;
  }
  
}
