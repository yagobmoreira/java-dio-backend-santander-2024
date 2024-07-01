package com.bootcamp.fundamentosPoo.lanchonete;

import com.bootcamp.fundamentosPoo.lanchonete.area.cliente.Cliente;
import com.bootcamp.fundamentosPoo.lanchonete.atendimento.Atendente;
import com.bootcamp.fundamentosPoo.lanchonete.atendimento.cozinha.Cozinheiro;

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
