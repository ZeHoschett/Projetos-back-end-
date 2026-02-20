

 class Colaborador {
    String nome;
    String cargo;
    int nivelAcesso;

    void atualizarDados(String novoCargo, int novoNivel) {
        System.out.println(" Antes da atualização ");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelAcesso + "\n");

        cargo = novoCargo;
        nivelAcesso = novoNivel;

        System.out.println(" Após atualização ");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelAcesso);
    }

    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
            colaborador.nome = "Camila Beatriz Zaratini Valle Hoshcett";
        colaborador.cargo = "Analista Júnior";
        colaborador.nivelAcesso = 1;

        colaborador.atualizarDados("Analista Pleno", 2);
    }
}