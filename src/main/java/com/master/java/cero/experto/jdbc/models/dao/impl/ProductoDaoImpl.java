package com.master.java.cero.experto.jdbc.models.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.master.java.cero.experto.jdbc.models.dao.IRepositorioGenericoDao;
import com.master.java.cero.experto.jdbc.models.entity.Categoria;
import com.master.java.cero.experto.jdbc.models.entity.Producto;
import com.master.java.cero.experto.jdbc.util.ConexionBbdd;

public class ProductoDaoImpl implements IRepositorioGenericoDao<Producto> {
  
  private static final Logger LOGGER = LoggerFactory.getLogger(ProductoDaoImpl.class);

  
  // Método que devuelva la conexíon a la BBDD  
  public Connection getConnection() throws SQLException {
    /* Método antiguo:
     *  return ConexionBbdd.getInstance();
     */
    return ConexionBbdd.getConnectionBasicDataSource(); 
  }
  
  @Override
  public List<Producto> listar() {
    List<Producto> productos = new ArrayList<>();
    try(Statement stmt = getConnection().createStatement();
        ResultSet rs = stmt.executeQuery("Select p.*, c.nombre as Nombre_Categoria from productos as p inner join categorias as c"
            + " ON p.id = c.id")) {
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
    try (PreparedStatement stmt = getConnection()
        .prepareStatement("Select p.*, c.nombre as Nombre_Categoria from productos as p"
            + " inner join categorias as c ON p.id = c.id where p.id = ?")) {
      // Indicamos el índice del valor "1" que es donde se ubica el "id"
      stmt.setLong(1, id);

      // Ejecutamos la query
      try (ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) {
          producto = crearProducto(rs);
          LOGGER.info("Id Producto: '{}', Nombre Producto: '{}',"
              + " Precio Producto: '{}', Fecha_Registro: '{}',"
              + " Nombre_Categoria: '{}'",
              producto.getId(), producto.getNombre(), producto.getPrecio(),
              producto.getFechaRegistro(), producto.getCategoria().getNombreCategoria());
        }
      }
    } catch (SQLException e) {
      LOGGER.error(e.getMessage(), e.getCause());
    }
    return producto;
  }

  @Override
  public void guardar(Producto producto) throws SQLException {
    String sqlInsert = "";
    if(producto.getId() != null && producto.getId() > 0) {
      sqlInsert = "UPDATE productos SET nombre = ?, precio = ?, fecha_registro = ?, categoria_id = ? WHERE id = ?";
    } else {
      sqlInsert = "INSERT INTO productos(nombre, precio, categoria_id, fecha_registro) values (?,?,?,?)";
    }
    try(PreparedStatement stmt = getConnection().prepareStatement(sqlInsert)) {
      stmt.setString(1, producto.getNombre());
      stmt.setLong(2, producto.getPrecio());
      stmt.setLong(3, producto.getCategoria().getCategoriaId());
      
      if(producto.getId() != null && producto.getId() > 0) {
        // Para el Update
        stmt.setLong(4, producto.getId());
      } else {
        // Para el Insert
        stmt.setDate(4, new Date(producto.getFechaRegistro().getTime()));
      }
      stmt.executeUpdate();
      LOGGER.info("Producto ");
    } catch (SQLException e) {
      LOGGER.error("Error al insertar un producto: {}", e.getMessage(), e.getCause());
    }
  }

  @Override
  public void elminar(Long id) {
    try(PreparedStatement stmt = getConnection().prepareStatement("DELETE FROM productos WHERE ID = ?")) {
      stmt.setLong(1, id);
      stmt.executeUpdate();
    } catch (SQLException e) {
      LOGGER.error("Error al borar el producto con ID: '{}' {}", id, e.getMessage(), e.getCause());
    }
  }

  private Producto crearProducto(ResultSet rs) throws SQLException {
    Producto p = new Producto();
    p.setId(rs.getLong("id"));
    p.setNombre(rs.getString("nombre"));
    p.setPrecio(rs.getInt("precio"));
    p.setFechaRegistro(rs.getDate("fecha_registro"));
    
    Categoria c = new Categoria();
    c.setCategoriaId(rs.getLong(1));
    // EL nombre 'Nombre_Categoria' viene dado dentro de la consulta listar()
    c.setNombreCategoria(rs.getString("Nombre_Categoria"));
    p.setCategoria(c);
    return p;
  }
  
}
