import java.util.HashMap;
import java.util.Map;

 class criandomapclientes {
    public static void main (String[] args) {
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1,"Marcelo");
        clientes.put(2,"Julio");
        clientes.put(3,"Bernardo");
        clientes.put(4,"Levi");

        System.out.println(" O nome do cliente com ID 2 é:"+ clientes.get(2));
    }
}
