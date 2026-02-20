/*

Você está desenvolvendo um sistema para uma oficina mecânica registrar os veículos que chegam para manutenção.
Cada carro precisa ser identificado com algumas informações para o controle interno.

Criar um programa que:

Defina uma classe com os atributos modelo, placa e ano.
Defina uma instancia dessa classe através do método construtor.
Exiba as informações do veículo no console.
 */

 class CadastroVicular {
    public static void main(String[] args) {
        Carro gol = new Carro("Focus", "EVR5G90", 2011);

        System.out.println("Veículo cadastrado:");
        System.out.println("Modelo: " + gol.getModelo());
        System.out.println("Placa: " + gol.getPlaca());
        System.out.println("Ano: " + gol.getAno());
    }
}

// Criar outros atributos como COR/MOTOR/POTENCIA...
