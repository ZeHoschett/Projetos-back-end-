/*

Você está desenvolvendo um sistema de autenticação para um aplicativo bancário.
Os usuários precisam ter total segurança de que suas senhas não podem ser alteradas sem autorização, mesmo que alguém tenha acesso temporário ao dispositivo.

Crie uma classe que:

Armazene com segurança a senha do usuário
Permita alterar a senha apenas com a confirmação da senha atual
Forneça feedback sobre o resultado da operação

 */

class Usuario {
    private String senha;

    // Construtor (que resolve o primeiro erro que você teve)
    public Usuario(String nome, String senha) {
        this.senha = senha;
    }

    // O MÉTODO QUE ESTÁ FALTANDO:
    // Ele precisa receber duas Strings para o Java "encontrá-lo"
    public void setSenha(String senhaAntiga, String senhaNova) {
        // Exemplo de lógica: só muda se a antiga estiver correta
        if (this.senha.equals(senhaAntiga)) {
            this.senha = senhaNova;
            System.out.println("Senha alterada!");
        } else {
            System.out.println("Senha antiga incorreta.");
        }
    }
}