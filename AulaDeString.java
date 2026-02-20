
 class aulaDeString {
    public static void main(String[] args) {
        String aluno = "José Francisco Hoschett Moralaes De Oliveira";

        String disciplina = "Java e Programação Orientada a Objetos";

        String curriculo = ""
                + "Analise e Desenvolvimento de Sistemas e "
                + "Tec. Mecânica; "
                + "Desenvolvedor backend Java em formação; "
                + "";

        String texto = String.format("Disciplina: %s - %s", disciplina, aluno);
        System.out.println(texto);

        System.out.printf("Nome: %s %nDisciplina: %s", aluno, disciplina);


        String disciplia = String.format("Disciplina: %s - %s", disciplina, aluno);
        System.out.println(texto);

        System.out.printf("Nome: %s %nDisciplina: %s", aluno, disciplina);


    }
}