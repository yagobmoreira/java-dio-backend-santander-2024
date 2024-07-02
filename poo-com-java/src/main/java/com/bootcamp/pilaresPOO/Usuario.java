package com.bootcamp.pilaresPOO;

import com.bootcamp.pilaresPOO.apps.FacebookMessenger;
import com.bootcamp.pilaresPOO.apps.MSNMessenger;
import com.bootcamp.pilaresPOO.apps.TelegramMessenger;

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
