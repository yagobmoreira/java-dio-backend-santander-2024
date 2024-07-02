package com.bootcamp.pilaresPOO;

public class Usuario {

  public static void main(String[] args) {
    MSNMessenger msn = new MSNMessenger();
    msn.enviarMensagem();
    msn.receberMensagem();

    System.out.println("--------------------------------------------");
    FacebookMessenger face = new FacebookMessenger();
    face.enviarMensagem();
    face.receberMensagem();

    System.out.println("--------------------------------------------");
    TelegramMessenger telegram = new TelegramMessenger();
    telegram.enviarMensagem();
    telegram.receberMensagem();


  }
}
