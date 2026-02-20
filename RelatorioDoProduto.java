/*
Imagine que você é responsável pelo controle de estoque de uma loja de informática que está expandindo seus negócios.
Com o aumento da demanda, é importante manter um registro organizado e preciso de todos os produtos disponíveis.
 Sua tarefa é criar um sistema que armazene as informações de cada item e gere um relatório para facilitar a gestão do estoque.
Criar uma classe que:  Represente um produto com os atributos nome, preço e quantidade.
Implemente um método que mostre os dados formatados, garantindo que o preço seja exibido com duas casas decimais.
*/

 class Mouse {
    String nome;
    double preco;
    int quantidade;

    void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

    public static void main(String[] args) {
        Mouse p = new Mouse();
        p.nome = "Mouse Gamer";
        p.preco = 159.9;
        p.quantidade = 25;

        p.exibirInformacoes();
    }
}

