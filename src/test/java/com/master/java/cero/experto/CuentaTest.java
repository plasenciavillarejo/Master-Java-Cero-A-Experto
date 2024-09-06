package com.master.java.cero.experto;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.master.java.cero.experto.models.Cuenta;


class CuentaTest {

	@Test
	void testNombreCuenta() {
	  Cuenta cuenta = new Cuenta();
	  cuenta.setPersona("Plasencia");
	  
	  // Valor esperado
	  String valorEsperado = "Plasencia";
	  
	  // Valor Real
	  String valorReal = cuenta.getPersona();
	  
	  // Validamos que lo experado sea igual a lo real
	  Assertions.assertEquals(valorEsperado, valorReal);
	  
	  // Validamos con un expersión booleana ( Para sonar indica que se utilice siempre el assertEquals) 
	  // Assertions.assertTrue(valorReal.equals("Plasencia"));
	  
	}
	
	@Test
	void testSaldoCuenta() {
	  Cuenta cuenta = new Cuenta("Plasencia", new BigDecimal("1000.113"));
	  Assertions.assertEquals(1000.113, cuenta.getSaldo().doubleValue());
	}
	
	@Test
	void testReferenciaCuenta() {
	  Cuenta cuenta = new Cuenta("Plasencia", new BigDecimal("1000.113"));
	  Cuenta cuentaDos = new Cuenta("Plasencia", new BigDecimal("1000.113"));
	  
	  Assertions.assertEquals(cuentaDos, cuenta);
	}
	
	
	
}
