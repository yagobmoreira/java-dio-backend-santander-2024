package com.bootcamp.collections.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
  private String nome;
  private long cod;
  private double preco;
  private int quantidade;

  public Produto(String nome, long cod, double preco, int quantidade) {
    this.nome = nome;
    this.cod = cod;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public String getNome() {
    return nome;
  }

  public long getCod() {
    return cod;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public String toString() {
    return "Produto{" +
        "nome='" + nome + '\'' +
        ", cod=" + cod +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Produto produto = (Produto) o;
    return getCod() == produto.getCod();
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(getCod());
  }

  @Override
  public int compareTo(Produto produto) {
    return nome.compareToIgnoreCase(produto.getNome());
  }
}

class ComparatorPorPreco implements Comparator<Produto> {

  @Override
  public int compare(Produto p1, Produto p2) {
    return Double.compare(p1.getPreco(), p2.getPreco());
  }
}
