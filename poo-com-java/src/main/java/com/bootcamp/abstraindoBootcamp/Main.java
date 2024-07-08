package com.bootcamp.abstraindoBootcamp;

import com.bootcamp.abstraindoBootcamp.dominio.Bootcamp;
import com.bootcamp.abstraindoBootcamp.dominio.Curso;
import com.bootcamp.abstraindoBootcamp.dominio.Dev;
import com.bootcamp.abstraindoBootcamp.dominio.Mentoria;
import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
    Curso curso = new Curso();
    curso.setTitulo("Java");
    curso.setDescricao("Descrição curso java");
    curso.setCargaHoraria(10);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java");
    bootcamp.setDescricao("Descrição bootcamp java");
    bootcamp.getConteudos().add(curso);
    bootcamp.getConteudos().add(mentoria);

    Dev dev = new Dev();
    dev.setNome("Yago");

    System.out.println("Conteúdos inscritos:");
    System.out.println(dev.getConteudosInscritos());

    dev.inscreverBootcamp(bootcamp);

    System.out.println("Conteúdos inscritos:");
    System.out.println(dev.getConteudosInscritos());

    dev.progredir();
    dev.progredir();

    System.out.println("Conteúdos inscritos:");
    System.out.println(dev.getConteudosInscritos());

    System.out.println("Conteúdos concluídos:");
    System.out.println(dev.getConteudosConcluidos());
  }
}
