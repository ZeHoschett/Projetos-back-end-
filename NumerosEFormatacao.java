//Roberto está desenvolvendo um sistema de relatórios financeiros e precisa formatar valores monetários com duas casas decimais.
// Construa um programa que receba um valor monetário e exiba o valor formatado com duas casas decimais.


import java.util.Scanner;

 class FormatandoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        String valorFormatado = String.format("R$ %.2f", valor);
        System.out.println("Valor formatado: " + valorFormatado);
    }
}