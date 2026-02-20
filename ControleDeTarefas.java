/*

Você está desenvolvendo um sistema de gerenciamento de tarefas pessoais para ajudar usuários a organizar suas atividades diárias.
Cada tarefa precisa ser registrada com uma descrição e um status que indique se já foi concluída ou não.
Seu objetivo é criar uma estrutura que armazene essas tarefas e permita visualizá-las.

Criar um programa que:

Defina uma classe com os atributos descrição e concluída.
Implemente um método que mostre a descrição da tarefa e seu status.
Crie uma lista de tarefas e exiba todas as tarefas cadastradas. Dica: use ArrayList.

 */

import java.util.ArrayList;
import java.util.List;

class Tarefa {
    String descricao;
    boolean concluida;

    void exibir() {
        if (concluida) {
            System.out.println("Tarefa: " + descricao + " - Status: Concluída");
        } else {
            System.out.println("Tarefa: " + descricao + " - Status: Pendente");
        }
    }

    public static void main(String[] args) {
        Tarefa t1 = new Tarefa();
        t1.descricao = "Estudar Java / Python/ AWS/ Lógica de Programação";
        t1.concluida = false;

        Tarefa t2 = new Tarefa();
        t2.descricao = "Fazer exercícios";
        t2.concluida = true;

        List<Tarefa> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);

        for (Tarefa t : lista) {
            t.exibir();
        }
    }
}