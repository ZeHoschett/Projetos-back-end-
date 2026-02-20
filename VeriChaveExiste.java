import java.util.HashMap;
import java.util.Map;

class verichave {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Marcelo");
        clientes.put(2, "Julio");
        clientes.put(3, "Bernardo");
        clientes.put(4, "Levi");

        int idCliente = 5;

        if (clientes.containsKey(idCliente)) {
            String nomeClientes = clientes.get(idCliente);
            // CORREÇÃO: Adicionado o '+' que faltava após idCliente
            System.out.println("O nome do cliente com ID " + idCliente + " é: " + nomeClientes);
        } else {
            // CORREÇÃO: Espaçamento ajustado para melhor leitura
            System.out.println("Cliente com ID " + idCliente + " não encontrado.");
        }

    } // Fechamento do método main
} // Fechamento da classe verichave