
class impostoirff {
    public static void main(String[] args) {
        String nome = "Maria";
        double salario = 3790;
        int numeroDependens = 2;
        boolean isento = false;

        if (salario > 3000 && !isento) {
            double irff = salario / 100 * 7.5;
            System.out.println("valor irff: " + irff);

        }else if (isento) {
            System.out.println("Contribuinte isento de irff");

        }else
            System.out.println("Não a valor de imposto de renda");

        }




    }

