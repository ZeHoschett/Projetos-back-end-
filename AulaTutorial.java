
import java.util.*;

public class AulaTutorial {
    public static void main(String[] args) {

        // --- LIST: Permite duplicados e mantém a ordem de inserção ---
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("José Francisco");
        funcionarios.add("Camila Zaratini");
        funcionarios.add("Dalva Zaratini");
        funcionarios.add("Francine Hoschett");
        funcionarios.add("Luzia Zaratini");
        funcionarios.add("José Francisco"); // Permitido em List

        System.out.println("Lista de Funcionários: " + funcionarios);
        // Em Java, a primeira posição é sempre 0 (zero)
        System.out.println("Primeiro funcionário: " + funcionarios.get(0));


        // --- SET: NÃO permite duplicidade e não garante ordem ---
        Set<String> produtos = new HashSet<>();
        produtos.add("Teclado");
        produtos.add("Mouse");    // Corrigido de "Mause" para "Mouse"
        produtos.add("Teclado");  // Este será ignorado pelo Set

        System.out.println("Conjunto de Produtos (Sem duplicados): " + produtos);


        // --- MAP: Estrutura Chave-Valor ---
        Map<Integer, String> clientes = new HashMap<>(); // Adicionado o ";" que faltava

        clientes.put(1, "José");
        clientes.put(2, "Camila");
        clientes.put(3, "Francine");

        System.out.println("Mapa de Clientes: " + clientes);
        System.out.println("Cliente ID 2: " + clientes.get(2));
    }
}

//coleções