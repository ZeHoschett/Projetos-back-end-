import java.util.List;
import java.util.stream.Collectors;

class Streams {
    public static void main(String[] args) {
        // 1. Filtro de nomes
        List<String> funcionarios = List.of("Camila", "José", "Hemanuel");

        List<String> funcionariosLetraJ = funcionarios.stream()
                .filter(f -> f.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println("Funcionários com J: " + funcionariosLetraJ);

        // 2. Cálculo de Vendas (CORREÇÃO: Removido as aspas duplas de dentro do List.of)
        // Antes era List.of("550.0, 1500.0") -> Isso era uma String única.
        List<Double> valorVendas = List.of(550.0, 1500.0, 17850.0);

        // 3. Map para Comissão (5%)
        List<Double> comissao = valorVendas.stream()
                .map(v -> v * 0.05)
                .collect(Collectors.toList());

        System.out.println("Valores das Vendas: " + valorVendas);
        System.out.println("Comissões: " + comissao);

        // 4. Reduce para Total (Soma)
        double totalVendas = valorVendas.stream()
                .reduce(0.0, Double::sum);

        System.out.println("Total de vendas: R$ " + totalVendas);
    }
}