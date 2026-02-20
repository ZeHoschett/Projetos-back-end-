import java.util.List;
import java.util.stream.Collectors;

 class funcionarios {
    public static void main (String[] args){
        List<String> funcionarios = List.of("João ", "Bernado Junior", "Julio Cezar", "Alves ");

        List<String> nomesCurtos = funcionarios.stream()
                .filter(nome -> nome.length() <=5)
                .collect(Collectors.toList());


        System.out.println(nomesCurtos);
    }
}