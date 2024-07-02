package com.bootcamp.fundamentosPoo.enums;

public class SistemaIBGE {

  public static void main(String[] args) {
    for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
      System.out.println(e.getNome() + " - " + e.getSigla());
    }

    EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;

    System.out.println(eb.getNome());
    System.out.println(eb.getSigla());
    System.out.println(eb.getNomeMaiusculo());
  }
}
