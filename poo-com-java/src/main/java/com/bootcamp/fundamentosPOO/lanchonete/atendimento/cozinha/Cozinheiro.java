package com.bootcamp.fundamentosPOO.lanchonete.atendimento.cozinha;

public class Cozinheiro {
  public void adicionarLancheNoBalcao() {
    System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCÃO");
  }

  public void adicionarSucoNoBalcao() {
    System.out.println("ADICIONANDO SUCO NO BALCÃO");
  }

  public void adicionarComboNoBalcao() {
    adicionarLancheNoBalcao();
    adicionarSucoNoBalcao();
  }

  private void prepararLanche() {
    System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");
  }

  private void prepararVitamina() {
    System.out.println("PREPARANDO SUCO");
  }

  private void prepararCombo() {
    prepararLanche();
    prepararVitamina();
  }

  private void selecionarIngredientesLanche() {
    System.out.println("SELECIONANDO O PÃO, SALADO, OVO E CARNE");
  }

  private void selecionarIngredientesVitamina() {
    System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
  }

  private void lavarIngredientes() {
    System.out.println("LAVANDO INGREDIENTES");
  }

  private void baterVitaminaLiquidificador() {
    System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
  }

  private void fritarIngredientesLanche() {
    System.out.println("FRITANDO A CARNE E O OVO PARA O HAMBURGER");
  }
  private void pedirIngredientes(Almoxarife meuAmigo) {
    meuAmigo.entregarIngredientes();
  }

  private void pedirParaTrocarGas(Almoxarife meuAmigo) {
    meuAmigo.trocarGas();
  }

}
