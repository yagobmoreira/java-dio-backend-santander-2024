package com.bootcamp.pilaresPOO.equipamentos;

import com.bootcamp.pilaresPOO.equipamentos.multifuncional.Multifuncional;

public class Fabrica {

  public static void main(String[] args) {
    Multifuncional multifuncional = new Multifuncional();
    multifuncional.copiar();
    multifuncional.digitalizar();
    multifuncional.imprimir();
  }
}
