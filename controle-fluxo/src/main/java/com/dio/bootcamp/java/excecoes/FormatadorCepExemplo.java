package com.dio.bootcamp.java.excecoes;

public class FormatadorCepExemplo {

  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("12345678");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.err.println("O cep não corresponde as regras de negocios");
    }
  }

  static String formatarCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8) {
      throw new CepInvalidoException();
    }
    return "12.345-678";
  }
}
