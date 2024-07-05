package com.bootcamp.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  private List<Livro> livroList;

  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livroList.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();

    if (!livroList.isEmpty()) {
      for (Livro livro : livroList) {
        if (livro.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(livro);
        }
      }
    }

    return livrosPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

    if (!livroList.isEmpty()) {
      for (Livro livro : livroList) {
        if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
          livrosPorIntervaloAnos.add(livro);
        }
      }
    }

    return  livrosPorIntervaloAnos;
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;

    if (!livroList.isEmpty()) {
      for (Livro livro : livroList) {
        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = livro;
          break;
        }
      }
    }

    return livroPorTitulo;
  }

  public static void main(String[] args) {
    // Criando uma instância do catálogo de livros
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    // Adicionando livros ao catálogo
    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

    // Exibindo livros pelo mesmo autor
    System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

    // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
    System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

    // Exibindo livros dentro de um intervalo de anos
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

    // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

    // Exibindo livros por título
    System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

    // Exibindo livros por título (caso em que não há livros com o título especificado)
    System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
  }
}
