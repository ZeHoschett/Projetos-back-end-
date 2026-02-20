 class Formato {
    private String nome;
    private String tipo;

    public Formato (String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void identificar() {
        System.out.println("Aluno: " + nome + " - Tipo: " + tipo);
    }
}