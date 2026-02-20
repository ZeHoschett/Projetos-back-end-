/*
Imagine que você está criando um sistema de catalogação para uma biblioteca.
 Seu objetivo é desenvolver uma estrutura que armazene dados de obras literárias e as exiba em um formato padronizado,
 facilitando a consulta por outros leitores.


Criar um programa que:

Defina uma classe com os atributos título, autor e páginas.
Implemente um método que use printf para mostrar os dados no formato: "[TÍTULO]" de [AUTOR] com [PÁGINAS] páginas.


*/

class Livro {
    String titulo;
    String autor;
    int paginas;

    void exibirResumo() {
        System.out.printf("\"%s\" de %s com %d páginas%n", titulo, autor, paginas);
    }

    public static void main(String[] args) {
        Livro l = new Livro();
        l.titulo = "As tranças do rei Careca";
        l.autor = "Vanessa Isis Hoschett Morales De Oliveira";
        l.paginas = 208;
        l.exibirResumo();
    }
}

