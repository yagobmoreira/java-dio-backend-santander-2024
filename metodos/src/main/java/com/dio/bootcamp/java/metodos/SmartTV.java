package com.dio.bootcamp.java.metodos;

public class SmartTV {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar() {
    this.ligada = true;
  }

  public void desligar() {
    this.ligada = false;
  }

  public void aumentarVolume() {
    if (volume <= 100) {
      this.volume++;
    }
  }

  public void diminuirVolume() {
    if (volume > 0) {
      this.volume--;
    }
  }

  public void mudarDeCanal(int novoCanal) {
    this.canal = novoCanal;
  }

  public void aumentarCanal() {
    if (canal <= 100) {
      this.canal++;
    }
  }

  public void diminuirCanal() {
    if (canal > 0) {
      this.canal--;
    }
  }
}
