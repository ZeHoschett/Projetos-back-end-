/*

Você está desenvolvendo o sistema de checkout de um e-commerce de produtos eletrônicos.
Seu desafio é calcular o valor total do carrinho de compras, considerando que cada produto pode ter quantidades diferentes e preços variados.

Criar um programa que:

Defina uma classe com os atributos nome, preço e quantidade.
Implemente um método que retorne o valor total do item (preço x quantidade).
Crie uma lista de item e calcule o valor total da compra.
 */

import java.util.ArrayList;
import java.util.List;

class ItemCarrinho {
    String nome;
    double preco;
    int quantidade;

    double calcularTotal() {
        return preco * quantidade;
    }

    public static void main(String[] args) {
        ItemCarrinho i1 = new ItemCarrinho();
        i1.nome = "Teclado Gamer com RGB multiplo ";
        i1.preco = 148.90;
        i1.quantidade = 2;

        ItemCarrinho i2 = new ItemCarrinho();
        i2.nome = "Mouse Gamer";
        i2.preco = 108.0;
        i2.quantidade = 2;

        List<ItemCarrinho> carrinho = new ArrayList<>();
        carrinho.add(i1);
        carrinho.add(i2);

        double totalCompra = 0;
        for (ItemCarrinho item : carrinho) {
            totalCompra += item.calcularTotal();
        }

        System.out.printf("Total da compra: R$ %.2f\n", totalCompra);
    }
}

// Adicionar itens que estão sendo comprados, seus valores junto do valor total;
