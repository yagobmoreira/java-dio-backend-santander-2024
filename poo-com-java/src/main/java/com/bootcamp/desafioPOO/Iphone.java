package com.bootcamp.desafioPOO;

import com.bootcamp.desafioPOO.funcionalidades.AparelhoTelefonico;
import com.bootcamp.desafioPOO.funcionalidades.NavegadorInternet;
import com.bootcamp.desafioPOO.funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

  // Implementação dos métodos da interface ReprodutorMusical
  @Override
  public void tocar() {
    System.out.println("Reproduzindo música...");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando música...");
  }

  @Override
  public void selecionarMusica(String musica) {
    System.out.println("Selecionando a música: " + musica);
  }

  // Implementação dos métodos da interface AparelhoTelefonico
  @Override
  public void ligar(String numero) {
    System.out.println("Ligando para: " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo a chamada...");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz...");
  }

  // Implementação dos métodos da interface NavegadorInternet
  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba...");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página...");
  }

  public static void main(String[] args) {
    Iphone meuIphone = new Iphone();

    // Testando funcionalidades do Reprodutor Musical
    meuIphone.selecionarMusica("Imagine - John Lennon");
    meuIphone.tocar();
    meuIphone.pausar();

    // Testando funcionalidades do Aparelho Telefônico
    meuIphone.ligar("123-456-7890");
    meuIphone.atender();
    meuIphone.iniciarCorreioVoz();

    // Testando funcionalidades do Navegador na Internet
    meuIphone.exibirPagina("https://www.example.com");
    meuIphone.adicionarNovaAba();
    meuIphone.atualizarPagina();
  }
}

