package com.master.java.cero.experto.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.master.java.cero.experto.jdbc.models.dao.IRepositorioGenericoDao;
import com.master.java.cero.experto.jdbc.models.dao.impl.ProductoDaoImpl;
import com.master.java.cero.experto.jdbc.models.entity.Categoria;
import com.master.java.cero.experto.jdbc.models.entity.Producto;
import com.master.java.cero.experto.jdbc.util.ConexionBbdd;

public class EjemploMainJdbc {

  private static final Logger LOGGER = LoggerFactory.getLogger(EjemploMainJdbc.class);
  
  private static final String LISTADOPRODUCTOS = "Id Producto: '{}', Nombre Producto: '{}'"
      + ", Precio Producto: '{}', Nombre_Categoria '{}'";
  
  private static IRepositorioGenericoDao<Producto> repositorio = new ProductoDaoImpl();
  
  public static void main(String[] args) {
    // DriverManagement se encarga de adminstrar las conexiones y los drivers que tengamos disponibles
    try(Connection conn = ConexionBbdd.getConnectionBasicDataSource()) {
      // Por defecto se le indica que el auto commit sea falso, y una vez que funcione le indicaremos el commit()
      if(conn.getAutoCommit()) {
        conn.setAutoCommit(false);
      }
      logicaNegocioSeparada(conn);
    } catch (SQLException e) {
      LOGGER.error("Error al realizar la conexión a la BBDD: {}",e.getMessage(), e.getCause());
    }
  }
  
  private static void logicaNegocioSeparada(Connection conn) throws SQLException {
    try {
      
      repositorio.listar().forEach(resultado -> 
      LOGGER.info(LISTADOPRODUCTOS, 
          resultado.getId(),
          resultado.getNombre(),
          resultado.getPrecio(),
          resultado.getCategoria().getNombreCategoria()));
      
      LOGGER.info("Se procede a buscar el productor por el ID 2");
      repositorio.buscarPorId(2L);
      
      insertarProductos(conn);
      
      LOGGER.info("Listando todos los productos");
      repositorio.listar().forEach(resultado -> 
      LOGGER.info(LISTADOPRODUCTOS, 
          resultado.getId(),
          resultado.getNombre(),
          resultado.getPrecio(),
          resultado.getCategoria().getNombreCategoria()));
           
      editarProducto();
      
      LOGGER.info("LISTANDO LOS PRODUCDTOS ACTUALIZADOS");
      repositorio.listar().forEach(resultado -> 
      LOGGER.info(LISTADOPRODUCTOS, 
          resultado.getId(),
          resultado.getNombre(),
          resultado.getPrecio(),
          resultado.getCategoria().getNombreCategoria()));
      
      borrarProductos();
      
      // Si va bien, se hace el commit
      conn.commit();

      } catch (Exception e) {
        LOGGER.error(e.getMessage(), e.getCause());
        // En caso de que falle, se hace el rollback
        conn.rollback();
      }
  }
  
  private static void insertarProductos(Connection conn) throws SQLException {
    LOGGER.info("Se procede a realizar el insert");
    Producto producto = new Producto();
    producto.setNombre("PC Apple");
    producto.setPrecio(1500);
    producto.setFechaRegistro(new Date());
    
    Categoria categoria = new Categoria();
    categoria.setCategoriaId(3L);
    categoria.setNombreCategoria("Pokemon");
    producto.setCategoria(categoria);
    
    repositorio.guardar(producto);
    
    Producto productoDos = new Producto();
    productoDos.setId(1L);
    productoDos.setNombre("Apple Watch");
    productoDos.setPrecio(450);
    productoDos.setFechaRegistro(new Date());
    productoDos.setCategoria(categoria);
    
    repositorio.guardar(productoDos);
  }
  
  private static void editarProducto() throws SQLException {
    LOGGER.info("Se procede a editar un producto");
    Producto productoActualizar = new Producto();
    productoActualizar.setId(25L);
    productoActualizar.setNombre("Apple Watch PRO");
    productoActualizar.setPrecio(900);
    productoActualizar.setFechaRegistro(new Date());
    
    Categoria categoria = new Categoria();
    categoria.setCategoriaId(3L);
    categoria.setNombreCategoria("Pokemon Actualizado");
    productoActualizar.setCategoria(categoria);
    
    repositorio.guardar(productoActualizar);
  }
  
  private static void borrarProductos() {
    LOGGER.info("Se procede a borrar un producto - Lógica no implentada");
    // Lógica no Implementada
  }
  
}