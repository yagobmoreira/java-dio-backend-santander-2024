package com.bootcamp.collections.generics;

/**
 Versão genérica da classe Box.
 @param <T> o tipo do valor sendo armazenado
 */
public class Box<T> {
  // T representa "Type" (tipo)
  private T t;

  public void set(T t) { this.t = t; }
  public T get() { return t; }
}