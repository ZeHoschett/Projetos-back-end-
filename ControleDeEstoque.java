/*

Você está desenvolvendo um sistema de gerenciamento para uma loja de roupas e precisa garantir que o estoque seja atualizado corretamente a cada venda realizada.
Seu programa deve processar as vendas e alertar quando não houver produtos suficientes no estoque.

Criar um programa que:

Defina uma classe com os atributos nome e quantidade.
Implemente um método que:
Subtraia a quantidade vendida do estoque se houver disponibilidade.
Exiba uma mensagem formatada com o saldo atual usando printf
Exiba um alerta “Estoque insuficiente” quando não for possível atender a venda.

 */

class ItemEstoque {
    String nome;
    int quantidade;

    void vender(int qtdVendida) {
        if (qtdVendida <= quantidade) {
            quantidade -= qtdVendida;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome, quantidade);
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

    public static void main(String[] args) {
        ItemEstoque item = new ItemEstoque();
        item.nome = "Camiseta Oversized Preta tamanho G";
        item.quantidade = 10;

        item.vender(3);
        item.vender(8);
    }
}


// Melhorar este codigo //