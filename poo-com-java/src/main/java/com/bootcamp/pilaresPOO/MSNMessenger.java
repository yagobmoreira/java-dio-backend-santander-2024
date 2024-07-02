package com.bootcamp.pilaresPOO;

public class MSNMessenger {
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando mensagem...");
    salvarHistoricoMensagem();
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem...");
  }

  private void validarConectadoInternet() {
    System.out.println("Validando se está conectado a Internet...");
  }

  private void salvarHistoricoMensagem() {
    System.out.println("Salvando histórico de mensagens...");
  }
}
