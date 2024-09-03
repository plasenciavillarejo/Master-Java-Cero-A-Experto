package com.master.java.cero.experto.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Clase Singleton encargada de realizar la conexión una única vez a la BBDD y reutilizarla en toda la aplicación
 */
public class ConexionBbdd {
  
  private ConexionBbdd() {
    // Constructor vacio
  }
  
  private static final Logger LOGGER = LoggerFactory.getLogger(ConexionBbdd.class);

  private static final String URL = "jdbc:sqlserver://localhost:1443;encrypt=true;trustServerCertificate=true;databaseName=java_curso";
  private static final String USUARIO = "GestExp_User";
  private static final String PASS = "Joseplasencia10_";
  
  // Conección Singleton
  private static Connection connection;
  
  private static BasicDataSource basicDataSource;
  
  /**
   * Servicio encargado de realizar la conexión a la BBDD 
   */
  public static Connection getInstance() throws SQLException {
    if(connection == null) {
      connection = DriverManager.getConnection(URL,USUARIO,PASS);
      LOGGER.info("Se ha conectado correctamente");
    }
    return connection;
  }
 
  /**
   * Configuración DataSource por un Pool de Conexiones.
   * 
   */
  
  public static BasicDataSource getInstanceBasicDatasource() {
   if(basicDataSource == null) {
     basicDataSource = new BasicDataSource();
     
     // Configuramos el POOL
     basicDataSource.setUrl(URL);
     basicDataSource.setUsername(USUARIO);
     basicDataSource.setPassword(PASS);

     // Tamaño del Pool Inicial - 3 Conexiones Habilitadas
     basicDataSource.setInitialSize(3);
     
     // Conexiones minimas que van a estar esperando para ser utilizadas
     basicDataSource.setMinIdle(3);
     
     // Conexiones máximas que van a estar esperando para ser utilizadas
     basicDataSource.setMaxIdle(8);
     
     // Inactivas que esten esperando a ser utilizadas
     basicDataSource.setMaxTotal(8);

     // Desactivamos el AutoCommit
     basicDataSource.setAutoCommitOnReturn(false);
     
     // Configuración de rollback automático al devolver la conexión al pool
     basicDataSource.setRollbackOnReturn(true);
   }
   return basicDataSource;
  }
  
  /**
   * Método para conectarnos para devolver un Objeto Connection
   * @throws SQLException 
   */
  
  public static Connection getConnectionBasicDataSource() throws SQLException {
    return getInstanceBasicDatasource().getConnection();
  }
  
}
