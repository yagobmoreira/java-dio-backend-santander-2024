package com.bootcamp.streamAPI.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R. É
 * utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class FunctionExample {

  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 25);

    Function<Integer, Integer> dobrar = numero -> numero * 2;

    List<Integer> numerosDobrados = numeros.stream()
        .map(integer ->  integer * 2)
        .toList();

    numerosDobrados.forEach(System.out::println);
  }
}
