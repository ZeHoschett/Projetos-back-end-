 class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos", "regular");
        Bolsista aluno2 = new Bolsista("Lucas");

        aluno1.identificar();
        aluno2.identificar();
    }
}