package com.bootcamp.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  private List<Integer> numbers;

  public SomaNumeros() {
    this.numbers = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    numbers.add(numero);
  }

  public int calcularSoma() {
    Integer soma = 0;

    if (!numbers.isEmpty()) {
      for (Integer number : numbers) {
        soma += number;
      }
    }

    return soma;
  }

  public int encontrarMaiorNumero() {
    Integer maiorNumero = Integer.MIN_VALUE;

    if (!numbers.isEmpty()) {
      for (Integer number : numbers) {
        if (number > maiorNumero) {
          maiorNumero = number;
        }
      }
      return maiorNumero;
    } else {
      throw new RuntimeException("A lista está vazia");
    }
  }

  public int encontrarMenorNumero() {
    Integer menorNumero = Integer.MAX_VALUE;

    if (!numbers.isEmpty()) {
      for (Integer number : numbers) {
        if (number < menorNumero) {
          menorNumero = number;
        }
      }
      return menorNumero;
    } else {
      throw new RuntimeException("A lista está vazia");
    }
  }

  public void exibirNumeros() {
    if (!numbers.isEmpty()) {
      System.out.println(this.numbers);
    } else {
      System.out.println("A lista está vazia!");
    }
  }
}
