package com.dio.bootcamp.java.excecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
  public static void main(String[] args) {
//    Number valor = Double.valueOf("a1.75");
    try {
      Number valor = NumberFormat.getInstance().parse("a1.75");
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }

//    valor = NumberFormat.getInstance().parse("a1.75");
//
//    System.out.println(valor);

  }
}
