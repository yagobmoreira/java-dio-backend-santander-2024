package com.bootcamp.desafioContaDigital;

public abstract class Conta implements IConta {
  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 0;

  protected int agencia;
  protected int numero;
  private double saldo;
  private Cliente cliente;

  public Conta(Cliente cliente) {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  @Override
  public void sacar(double valor) {
    saldo -= valor;
  }

  @Override
  public void depositar(double valor) {
    saldo += valor;
  }

  @Override
  public void transferir(double valor, IConta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }

  protected void imprimirInfosComuns() {
    System.out.printf("Titular da conta: %s%n", this.cliente.getNome());
    System.out.printf("Agência: %d%n", getAgencia());
    System.out.printf("Número: %d%n", getNumero());
    System.out.printf("Saldo: %.2f%n", getSaldo());
  }
}
