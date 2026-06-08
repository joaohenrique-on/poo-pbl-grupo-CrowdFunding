package dev.java10x.ProjetoDDD.domain;

import lombok.*;

public class Doacao {

  private final @Getter Usuario doador;
  private final @Getter double valor;

  public Doacao(Usuario doador, double valor){

  if (valor <= 0) { 
    throw new IllegalArgumentException("Valor deve ser maior que zero");
  }
    
    this.doador = doador;
    this.valor = valor;

  }


    public boolean validar(double valor) {
        return valor > 0;
    }
}