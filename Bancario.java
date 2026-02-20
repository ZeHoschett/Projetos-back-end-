import java.util.Scanner;

 class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("José Francisco", "Investimentos", 1000000.00);

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + conta.getTitular());
        System.out.println("Tipo conta: " + conta.getTipoConta());
        System.out.printf("Saldo inicial: R$ %.2f\n", conta.getSaldo());
        System.out.println("***********************");

        int opcao = 0;
        while (opcao != 4) {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> System.out.printf("Saldo atual: R$ %.2f\n", conta.getSaldo());
                case 2 -> {
                    System.out.print("Informe o valor a receber: ");
                    conta.depositar(scanner.nextDouble());
                }
                case 3 -> {
                    System.out.print("Informe o valor que deseja transferir: ");
                    conta.sacar(scanner.nextDouble());
                }
                case 4 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\nOperações:\n1- Consultar saldo\n2- Receber valor\n3- Transferir valor\n4- Sair");
        System.out.print("Digite a opção desejada: ");
    }
}