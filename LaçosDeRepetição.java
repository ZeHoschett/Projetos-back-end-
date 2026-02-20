

class lacoasdeRepeticao {

    public static void main(String[] args) {

        String[] vendedores = {"José", "Camila", "Pietro", "Francine", "Miguel"};
        double[] vendas = {15240, 70000, 69854, 85000, 100000};

        for (int i = 0; i < vendedores.length; i++) {
            System.out.printf("%s - comissão %.2f%n",
                    vendedores[i],
                    calcularComissao(vendas[i]));
        }
    }

    // Método para calcular a comissão
    public static double calcularComissao(double venda) {
        return venda * 0.10; // 10% de comissão
    }
}

// terminar o codigo


