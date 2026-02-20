/* Imagine que você está desenvolvendo um sistema de conta digital onde os usuários podem realizar transações financeiras.
Em determinadas situações, como encerramento de conta, é necessário zerar o saldo disponível.

Criar um programa que:

Defina uma classe com o atributo saldo.
Implemente um método que redefine o valor do saldo para 0.0.
Implemente um método que mostra o saldo atual formatado.


 */


class ContaDigital {
    double saldo;

    void zerarSaldo() {
        saldo = 0.0;
    }

    void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public static void main(String[] args) {
        ContaDigital conta = new ContaDigital();
        conta.saldo = 9579.42;

        conta.exibirSaldo();
        conta.zerarSaldo();
        conta.exibirSaldo();
    }
}