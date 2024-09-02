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
  
  public static void main(String[] args) {
    
    // DriverManagement se encarga de adminstrar las conexiones y los drivers que tengamos disponibles
    try(Connection conn = ConexionBbdd.getInstance()) {      
      IRepositorioGenericoDao<Producto> repositorio = new ProductoDaoImpl();
      repositorio.listar().forEach(resultado -> 
      LOGGER.info(LISTADOPRODUCTOS, 
          resultado.getId(),
          resultado.getNombre(),
          resultado.getPrecio(),
          resultado.getCategoria().getNombreCategoria()));
      
      LOGGER.info("Se procede a buscar el productor por el ID 2");
      repositorio.buscarPorId(2L);
      
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
      productoDos.setNombre("Apple Watch");
      productoDos.setPrecio(450);
      productoDos.setFechaRegistro(new Date());
      
      repositorio.guardar(productoDos);
      
      LOGGER.info("Listando todos los productos");
      repositorio.listar().forEach(resultado -> 
      LOGGER.info(LISTADOPRODUCTOS, 
          resultado.getId(),
          resultado.getNombre(),
          resultado.getPrecio(),
          resultado.getCategoria().getNombreCategoria()));
      
      LOGGER.info("Se procede a editar un producto");
      Producto productoActualizar = new Producto();
      productoActualizar.setId(8L);
      productoActualizar.setNombre("Apple Watch PRO");
      productoActualizar.setPrecio(900);
      productoActualizar.setFechaRegistro(new Date());
      
      repositorio.guardar(productoActualizar);
      
      LOGGER.info("LISTANDO LOS PRODUCDTOS ACTUALIZADOS");
      repositorio.listar().forEach(resultado -> 
      LOGGER.info(LISTADOPRODUCTOS, 
          resultado.getId(),
          resultado.getNombre(),
          resultado.getPrecio(),
          resultado.getCategoria().getNombreCategoria()));
      
      LOGGER.info("Se procede a borrar un producto");
      
    } catch (SQLException e) {
      LOGGER.error("Error al realizar la conexión a la BBDD: {}",e.getMessage(), e.getCause());
    }
    
  }

}