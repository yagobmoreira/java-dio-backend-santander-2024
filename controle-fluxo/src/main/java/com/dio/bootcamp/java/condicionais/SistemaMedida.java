package com.dio.bootcamp.java.condicionais;

public class SistemaMedida {

  public static void main(String[] args) {
    char sigla = 'C';

    switch (sigla) {
      case 'P': {
        System.out.println("Pequeno");
        break;
      }
      case 'M': {
        System.out.println("Médio");
        break;
      }
      case 'G': {
        System.out.println("Grande");
        break;
      }
      default: {
        System.out.println("Indefinido");
      }
    }
  }

}
