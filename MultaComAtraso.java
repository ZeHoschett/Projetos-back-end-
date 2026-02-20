/*

Imagine que você está desenvolvendo um sistema de controle de devoluções para uma livraria.
Quando um livro é devolvido com atraso, é necessário calcular o valor da multa conforme os dias de atraso.

Crie um programa que:

Defina uma classe com os atributos título e dias de atraso.
Implemente um método que:
Cobre R$ 2,50 por dia de atraso.
Retorne o valor total da multa.
Implemente um método que mostre o título e o valor da multa formatado.

 */

class PedidoLivro {
    String titulo;
    int diasAtraso;

    double calcularMulta() {
        return diasAtraso * 2.75;
    }

    void exibirDetalhes() {
        double multa = calcularMulta();
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n",
                titulo, diasAtraso, multa);
    }

    public static void main(String[] args) {
        PedidoLivro pedido = new PedidoLivro();
        pedido.titulo = "Dom Casmurro";
        pedido.diasAtraso = 15;

        pedido.exibirDetalhes();
    }
}


//Fazer com outros produtos