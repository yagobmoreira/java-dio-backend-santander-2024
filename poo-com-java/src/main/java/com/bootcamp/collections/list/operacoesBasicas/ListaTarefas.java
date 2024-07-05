package com.bootcamp.collections.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
  private final List<Tarefa> tarefaList;

  public ListaTarefas() {
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(Tarefa novaTarefa) {
    tarefaList.add(novaTarefa);
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();

    for (Tarefa tarefa : tarefaList) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemover.add(tarefa);
      }
    }

    tarefaList.removeAll(tarefasParaRemover);
  }

  public int obterNumeroTotalTarefas() {
    return tarefaList.size();
  }

  public void obterDescricoesTarefas() {
    System.out.println(tarefaList);
  }
}
