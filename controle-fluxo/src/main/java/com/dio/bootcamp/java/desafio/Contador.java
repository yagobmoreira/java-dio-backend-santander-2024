package com.dio.bootcamp.java.desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    try {
      Scanner terminal = new Scanner(System.in);
      System.out.println("Digite o primeiro número");
      int parametroUm = terminal.nextInt();
      System.out.println("Digite o segundo número");
      int parametroDois = terminal.nextInt();

      try {
        contar(parametroUm, parametroDois);

      } catch (ParametrosInvalidosException exception) {
        System.err.println("O segundo número deve ser maior que o primeiro número");
      }
    } catch (InputMismatchException e) {
      System.err.println("O número digitado deve ser um inteiro válido!");
    }

  }
  static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    if (parametroUm > parametroDois) {
      throw new ParametrosInvalidosException();
    }
    int contagem = parametroDois - parametroUm;
    for (int i = 1; i <= contagem; i += 1) {
      System.out.println("Imprimindo o número " + i);
    }
  }
}
