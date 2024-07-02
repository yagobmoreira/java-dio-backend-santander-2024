package com.bootcamp.fundamentosPOO.enums;

public enum EstadoBrasileiro {
  SAO_PAULO ("São Paulo", "SP"),
  RIO_JANEIRO ("Rio de Janeiro", "RJ"),
  PIAUI ("Piauí", "PI"),
  MARANHAO ("Maranhão", "MA"),
  CEARA ("Ceará", "CE")
  ;

  private String nome;
  private String sigla;

  private EstadoBrasileiro(String nome, String sigla) {
    this.nome = nome;
    this.sigla = sigla;
  }

  public String getNome() {
    return nome;
  }

  public String getSigla() {
    return sigla;
  }

  public String getNomeMaiusculo() {
    return nome.toUpperCase();
  }
}
