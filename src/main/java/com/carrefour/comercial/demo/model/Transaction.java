package com.carrefour.comercial.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Transaction {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private int id;
  private Double valor;
  private Boolean debito;

  private Date data;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public Boolean getDebito() {
    return debito;
  }

  public void setDebito(Boolean debito) {
    this.debito = debito;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }
}