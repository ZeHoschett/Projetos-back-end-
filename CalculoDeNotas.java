/*

Imagine que você está desenvolvendo um sistema acadêmico simplificado para auxiliar professores no acompanhamento de alunos.
Seu desafio é criar uma solução que automatize o cálculo de médias e forneça rapidamente o resultado, eliminando a necessidade de cálculos manuais e reduzindo erros.

Criar uma classe que:

Represente os alunos com os atributos nome, nota 1´ e nota 2`.
Implemente um método que:
Calcule a média das notas.
Exiba o nome do aluno, suas notas e a média (com uma casa decimal).
Indique se o aluno foi aprovado (média >= 7) ou reprovado.

 */

 class Aluno {
    String nome;
    double nota1;
    double nota2;

    void mostrarResultado() {
        double media = (nota1 + nota2) / 2;

        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.printf("Média: %.1f\n", media);

        if (media >= 6.5) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Livia Zaratini Simone";
        aluno.nota1 = 4.5;
        aluno.nota2 = 8.5;

        aluno.mostrarResultado();
    }
}