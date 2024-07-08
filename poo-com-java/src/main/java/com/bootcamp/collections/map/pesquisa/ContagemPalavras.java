package com.bootcamp.collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  private Map<String, Integer> contadorPalavrasMap;

  public ContagemPalavras() {
    this.contadorPalavrasMap = new HashMap<>();
  }

  public void adicionarPalavras(String palavra, Integer contagem) {
    contadorPalavrasMap.put(palavra, contagem);
  }

  public void removerPalavra(String palavra) {
    if (!contadorPalavrasMap.isEmpty()) {
      contadorPalavrasMap.remove(palavra);
    } else {
      System.out.println("O contador de palavras está vazio.");
    }
  }

  public int exibirContagemPalavras() {
    int contagemTotal = 0;
    for (int contagem : contadorPalavrasMap.values()) {
      contagemTotal += contagem;
    }
    return contagemTotal;
  }


  public String encontrarPalavrasMaisFrequente() {
    String palavraMaisFrequente = null;
    Integer maiorContagem = Integer.MIN_VALUE;
    for (Map.Entry<String, Integer> entry: contadorPalavrasMap.entrySet()) {
      if (entry.getValue() > maiorContagem) {
        maiorContagem = entry.getValue();
        palavraMaisFrequente = entry.getKey();
      }
    }
    return palavraMaisFrequente;
  }

  public static void main(String[] args) {
    ContagemPalavras contagemLinguagens = new ContagemPalavras();

    // Adiciona linguagens e suas contagens
    contagemLinguagens.adicionarPalavras("Java", 2);
    contagemLinguagens.adicionarPalavras("Python", 8);
    contagemLinguagens.adicionarPalavras("JavaScript", 1);
    contagemLinguagens.adicionarPalavras("C#", 6);

    // Exibe a contagem total de linguagens
    System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

    // Encontra e exibe a linguagem mais frequente
    String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
    System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
  }
}
