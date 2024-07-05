package com.bootcamp.collections.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  private List<Item> itemList;

  public CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    itemList.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    List<Item> itensParaRemover = new ArrayList<>();

    for (Item item : itemList) {
      if (item.getNome().equalsIgnoreCase(nome)) {
        itensParaRemover.add(item);
      }
    }

    itemList.removeAll(itensParaRemover);
  }

  public double calcularValorTotal() {
    double valorTotal = 0;
    for (Item item : itemList) {
      valorTotal += item.getPreco()*item.getQuantidade();
    }

    return valorTotal;
  }

  @Override
  public String toString() {
    return "CarrinhoDeCompras{" +
        "itemList=" + itemList +
        '}';
  }

  public void exibirItens() {
    System.out.println(itemList);
  }

  public static void main(String[] args) {
    // Criando uma instância do carrinho de compras
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirItens();

    // Removendo um item do carrinho
    carrinhoDeCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
  }
}
