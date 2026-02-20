 class ContaBancaria {
    private String titular;
    private String tipoConta;
    private double saldo;

    public ContaBancaria(String titular, String tipoConta, double saldoInicial) {
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.saldo = Math.max(0, saldoInicial);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Saldo atualizado: R$ %.2f\n", this.saldo);
        } else {
            System.out.println("Erro: O valor de depósito deve ser positivo.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.printf("Saldo atualizado: R$ %.2f\n", this.saldo);
            return true;
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    public String getTitular() { return titular; }
    public String getTipoConta() { return tipoConta; }
    public double getSaldo() { return saldo; }
}