import java.util.ArrayList;
import java.util.List;

class acessandoelementos {
    public static void main (String[] args){
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("José");
        funcionarios.add("Camila");
        funcionarios.add("Isabella");
        funcionarios.add("Livia");
        funcionarios.add("Dalva");

        System.out.println("A segunda pessoa da lista é:" + funcionarios.get(1));
        System.out.println(" Total de funcionários:" + funcionarios.size());
    }
}

