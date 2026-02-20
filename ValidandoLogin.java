/*

Imagine que você está desenvolvendo um sistema de acesso para um laboratório de informática da escola.
Os estudantes precisam autenticar-se com suas credenciais pessoais, mas o sistema deve proteger contra tentativas de adivinhação de senhas.

Crie uma classe que:

Armazene o login e a senha de forma encapsulada.
Um método validarSenha() que receba as credenciais digitadas e retorne se o login foi bem-sucedido.
Uma lógica no arquivo principal que utilize a classe Scanner para ler o login e senha digitados, controlando as tentativas com um loop.
Bloqueie o acesso após 3 falhas consecutivas.
Exiba mensagens informando o resultado da tentativa e quantas restam.

 */


import java.util.Scanner;

 class Validando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario aluno = new Usuario("aluno2025", "escola@123");
        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.print("Digite o seu usuário: ");
            String usuario = sc.nextLine();

            System.out.print("Digite a sua senha: ");
            String senha = sc.nextLine();

            if (aluno.validarSenha(usuario, senha)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes == 0) {
                    System.out.println("Acesso bloqueado. Contate o administrador.");
                } else {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativasRestantes);
                }
            }
        }
        sc.close();
    }
}

