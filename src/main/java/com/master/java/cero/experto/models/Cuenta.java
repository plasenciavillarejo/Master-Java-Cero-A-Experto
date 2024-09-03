package com.master.java.cero.experto.models;

import java.io.Serializable;
import java.math.BigDecimal;

public class Cuenta implements Serializable {

  private String persona;

  private BigDecimal saldo;

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

  private static final long serialVersionUID = 7146857663206025450L;

}
