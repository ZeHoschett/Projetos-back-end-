import java.util.ArrayList;
import java.util.List;

class removendoelementos {
    public static void main (String[] args) {
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("Joana");
        funcionarios.add("Pedro");
        funcionarios.add("Lucas");
        funcionarios.add("Hilda");

        System.out.println("Lista Incial:" + funcionarios);

        funcionarios.remove("Pedro");

        System.out.println("Lista após a remoção:" + funcionarios);
    }
}


