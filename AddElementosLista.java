import java.util.ArrayList;
import java.util.List;

 class addelementos {
    public static void main (String[] args){
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("José");
        funcionarios.add("Camila");
        funcionarios.add("Isabella");
        funcionarios.add("Livia");

        System.out.println("Lista de funcionarios:" + funcionarios);
    }
}