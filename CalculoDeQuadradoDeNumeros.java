import java.util.List;
import java.util.stream.Collectors;

class CalculoQuadrado { // Boa prática: Nomes de classes começam com Maiúscula
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> quadrados = numeros.stream()
                .map(n -> n * n) // Fecha o parêntese do map aqui
                .collect(Collectors.toList());

        System.out.println("Quadrados dos números: " + quadrados);
    }
}