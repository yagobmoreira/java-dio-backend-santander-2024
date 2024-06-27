package com.dio.bootcamp.java.metodos;

public class Usuario {

  public static void main(String[] args) {
    SmartTV tv = new SmartTV();

    System.out.println("Canal atual: " + tv.canal);
    System.out.println("Está ligada ? " + tv.ligada);
    System.out.println("Volume: " + tv.volume);

    tv.aumentarVolume();
    tv.aumentarVolume();
    System.out.println("Volume: " + tv.volume);

    tv.diminuirVolume();
    System.out.println("Volume: " + tv.volume);

    tv.mudarDeCanal(20);
    System.out.println("Canal atual: " + tv.canal);

    tv.aumentarCanal();
    System.out.println("Canal atual: " + tv.canal);

    tv.diminuirCanal();
    tv.diminuirCanal();
    System.out.println("Canal atual: " + tv.canal);

    System.out.println(1+ "2");
  }
}
