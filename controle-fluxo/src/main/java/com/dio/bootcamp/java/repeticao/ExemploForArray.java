package com.dio.bootcamp.java.repeticao;

public class ExemploForArray {

  public static void main(String[] args) {
    String[] alunos = {"Felipe", "João", "Marcos", "Pedro"};

    for (int i = 0; i < alunos.length; i += 1) {
      System.out.println("O aluno no indice i=" + i + " é " + alunos[i]);
    }

    for (String aluno : alunos) {
      System.out.println(aluno);
    }
  }
}
