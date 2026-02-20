 class verificação {
    public static void main(String[] args) {
        int idade = 17; // Declara a variável antes da verificação
        String mensagem; // Declara a variável antes do bloco condicional

        if (idade >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem); // Agora a variável está acessível
    }
}


// CODIGO QUR FOI FEITO A CORREÇÃO DO BUG public
//
// class Main {
//    public static void main(String[] args) {
//        if (idade >= 18) {
//            int idade = 17;
//            String mensagem = "Você é maior de idade.";
//        } else {
//            String mensagem = "Você é menor de idade.";
//        }
//
//        System.out.println(mensagem);
//    }
//} //