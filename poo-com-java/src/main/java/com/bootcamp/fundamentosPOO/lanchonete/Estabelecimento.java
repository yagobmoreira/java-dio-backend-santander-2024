package com.bootcamp.fundamentosPOO.lanchonete;

import com.bootcamp.fundamentosPOO.lanchonete.area.cliente.Cliente;
import com.bootcamp.fundamentosPOO.lanchonete.atendimento.Atendente;
import com.bootcamp.fundamentosPOO.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

  public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro();

    cozinheiro.adicionarSucoNoBalcao();
    cozinheiro.adicionarLancheNoBalcao();
    cozinheiro.adicionarComboNoBalcao();

    Atendente atendente = new Atendente();
    atendente.servindoMesa();
    atendente.receberPagamento();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();

  }
}
