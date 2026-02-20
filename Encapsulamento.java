 class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("José Francisco Hoschett Morales de Oliveira " , 8500);

        funcionario.setCargo("Desenvolvedor");

        System.out.println("CARGO DO FUNCIONÁRIO:"+ funcionario.getCargo());
        System.out.println("NOME DO FUNCIONÁRIO:"+ funcionario.getNome());
        System.out.println("SALÁRIO DO FUNCIONÁRIO:"+ funcionario.getSalario());



        funcionario.reajustarSalario(5);
        funcionario.reajustarSalario(10);
        funcionario.exibirInformacoes();
    }
}

