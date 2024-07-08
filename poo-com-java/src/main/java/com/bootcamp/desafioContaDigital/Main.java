package com.bootcamp.desafioContaDigital;

public class Main {

  public static void main(String[] args) {
    Cliente novoCliente = new Cliente("Yago", "00100200300");
    IConta contaCorrente = new ContaCorrente(novoCliente);
    IConta contaPoupanca = new ContaPoupanca(novoCliente);

    contaCorrente.depositar(100);
    contaCorrente.imprimirExtrato();

    contaCorrente.transferir(100, contaPoupanca);
    contaPoupanca.imprimirExtrato();
    contaCorrente.imprimirExtrato();
  }
}
