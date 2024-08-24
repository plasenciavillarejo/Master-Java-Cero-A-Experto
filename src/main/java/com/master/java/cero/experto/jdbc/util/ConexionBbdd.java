package com.master.java.cero.experto.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
  
  /**
   * Servicio encargado de realizar la conexión a la BBDD 
   */
  
  public static Connection getInstance() throws SQLException {
    LOGGER.info(connection == null ? "La conexión a la BBDD es null, se procede a realizar la conexión"
        : "La conexión ya está inicializada");
    if(connection == null) {
      connection = DriverManager.getConnection(URL,USUARIO,PASS);
      LOGGER.info("Se ha conectado correctamente");
    }
    return connection;
  }
  
}
