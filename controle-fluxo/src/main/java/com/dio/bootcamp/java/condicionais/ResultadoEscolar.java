package com.dio.bootcamp.java.condicionais;

public class ResultadoEscolar {

  public static void main(String[] args) {
    int nota = 3;
    if (nota >= 7) {
      System.out.println("Aprovado !");
    } else if (nota >= 5 && nota < 7){
      System.out.println("Prova de Recuperação !");
    } else {
      System.out.println("Reprovado !");
    }

    String resultado = nota >= 7 ? "Aprovado !"
            : (nota >= 5 && nota < 7) ? "Prova de Recuperação !" : "Reprovado !";
    System.out.println(resultado);
  }
}
