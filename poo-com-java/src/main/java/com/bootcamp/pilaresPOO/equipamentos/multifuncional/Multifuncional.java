package com.bootcamp.pilaresPOO.equipamentos.multifuncional;

import com.bootcamp.pilaresPOO.equipamentos.copiadora.Copiadora;
import com.bootcamp.pilaresPOO.equipamentos.digitalizadora.Digitalizadora;
import com.bootcamp.pilaresPOO.equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {

  @Override
  public void copiar() {
    System.out.println("Copiando com Multifuncional...");
  }

  @Override
  public void digitalizar() {
    System.out.println("Digitalizando com Multifuncional...");
  }

  @Override
  public void imprimir() {
    System.out.println("Imprimindo com Multifuncional...");
  }
}
