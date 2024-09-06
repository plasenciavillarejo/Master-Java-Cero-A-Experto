package com.master.java.cero.experto.models;

import java.io.Serializable;
import java.math.BigDecimal;

public class Cuenta implements Serializable {

  private String persona;

  private BigDecimal saldo;

  public Cuenta() {
    super();
  }

  public Cuenta(String persona, BigDecimal saldo) {
    super();
    this.persona = persona;
    this.saldo = saldo;
  }

  public String getPersona() {
    return persona;
  }

  public void setPersona(String persona) {
    this.persona = persona;
  }

  public BigDecimal getSaldo() {
    return saldo;
  }

  public void setSaldo(BigDecimal saldo) {
    this.saldo = saldo;
  }

  /*
   * Método encargada de validar la instancia de forma completa
   */
  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Cuenta)) {
      return false;
    }
    Cuenta cuenta = (Cuenta) obj;
    if(this.persona == null || this.saldo == null) {
      return false;
    }
    return this.persona.equals(cuenta.getPersona()) && this.saldo.equals(cuenta.getSaldo());
  }




  private static final long serialVersionUID = 7146857663206025450L;

}
