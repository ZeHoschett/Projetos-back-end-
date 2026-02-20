class Funcionario {
    String nome;
    String cargo;
    double salario;

    public void exibirInformacoes() {
        System.out.printf("Funcionario %s - Cargo: %s - Salário %.2f%n", nome, cargo, salario);
    }

    public void reajustarSalario(double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("Novo salario de %s é %.2f%n", nome, salario);
    }
}

class Orientacao {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Ana";
        funcionario1.cargo = "Gerente de projetos";
        funcionario1.salario = 9000;

        funcionario1.exibirInformacoes();
        funcionario1.reajustarSalario(10);
    }
}