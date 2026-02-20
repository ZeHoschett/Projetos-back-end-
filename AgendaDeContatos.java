/*

Você está desenvolvendo um aplicativo de agenda para uma empresa.
Os funcionários precisam acessar rapidamente os contatos de clientes e fornecedores, mantendo as informações organizadas e fáceis de localizar.

Criar uma classe que:

Armazene contatos com nome e telefone em uma lista
Permita visualizar todos os contatos cadastrados
Formate a exibição para melhor legibilidade
 */

import java.util.ArrayList;

 class Agenda {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("Camila", "(11) 99999-0000"));
        contatos.add(new Contato("José", "(11) 98888-0000"));
        contatos.add(new Contato("Tiago", "(11) 97777-0000"));

        System.out.println("Lista de contatos:");
        int indice = 1;
        for (Contato contato : contatos) {
            System.out.printf("%d. %s - %s\n",
                    indice++,
                    contato.getNome(),
                    contato.getTelefone());
        }
    }
}
