package com.carrefour.comercial.demo.model;

import java.time.LocalDateTime;
import java.util.Date;

public class ConsolidatedTransaction {
  private Double valor;
  private Date data;

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }
}