// Laura está desenvolvendo um sistema de busca e precisa verificar se uma palavra específica está presente em um texto.
//Crie um programa que receba um texto e uma palavra, e exiba uma mensagem indicando se a palavra está presente no texto.





import java.util.Scanner;

 class VerificandoSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra: ");
        String palavra = scanner.nextLine();

        if (texto.contains(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" está presente no texto.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não está presente no texto.");
        }
        scanner.close();
    }
}