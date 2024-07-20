import java.util.Scanner;

public class Principal {

    public static double calculaDescontoInss (double salarioBruto) {
        double descontoInss;
        if (salarioBruto >= 3641.04) {
            descontoInss = 0.14d;
        } else if (salarioBruto >= 2427.36) {
            descontoInss = 0.12d;
        } else if (salarioBruto >= 1212.01) {
            descontoInss = 0.09d;
        } else {
            descontoInss = 0.075d;
        }

        return descontoInss;
    }

    public static double calculaDescontoIrpf (double salarioBruto, double descontoInss) {
        double salarioDescontadoInss = salarioBruto - (salarioBruto * descontoInss);
        double descontoIrpf;
        if (salarioDescontadoInss > 4664.68) {
            descontoIrpf = 0.275d;
        } else if (salarioDescontadoInss >= 3751.06) {
            descontoIrpf = 0.225d;
        } else if (salarioDescontadoInss >= 2826.66) {
            descontoIrpf = 0.15d;
        } else if (salarioDescontadoInss >= 1903.99) {
            descontoIrpf = 0.075d;
        } else {
            descontoIrpf = 0;
        }

        return descontoIrpf;
    }

    public static double calculaSalarioLiquido (double salarioBruto,
                                                double descontoInss,
                                                double descontoIrpf) {
        double primeiroDesconto = salarioBruto - (salarioBruto * descontoInss);
        double salarioLiquido = primeiroDesconto - (primeiroDesconto * descontoIrpf);

        return salarioLiquido;
    }

    public static String toString (double salarioBruto,
                                   double descontoInss,
                                   double descontoIrpf,
                                   double salarioLiquido) {
        String salarioBrutoFormat = String.format("%.2f", salarioBruto);
        String descontoInssReal = String.format("%.2f", (salarioBruto * descontoInss));
        String descontoIrpfReal = String.format("%.2f", (descontoIrpf*100));
        String salarioLiquidoFormat = String.format("%.2f", salarioLiquido);
        return "Salário bruto: R$ " + salarioBrutoFormat + "\n" +
                "Desconto de " + (descontoInss*100) + "% " +
                "de INSS: R$ " + descontoInssReal + "\n" +
                "Desconto de " + (descontoIrpf*100) + "% " +
                "de IRPF: R$ " + descontoIrpfReal + "\n" +
                "Salário líquido: R$ " + salarioLiquidoFormat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------Bem-vindo ao Programa Calcula Salário-------");
        System.out.println("Vamos calcular, apresentar os descontos e imprimir o salário líquido com base em 5 diferentes salários brutos");

        double descontoInss, descontoIrpf, salarioLiquido;

        double salarioInserido;

        System.out.println("Insira o primeiro salário bruto: ");
        salarioInserido = scanner.nextDouble();

        descontoInss = calculaDescontoInss(salarioInserido);
        descontoIrpf = calculaDescontoIrpf(salarioInserido, descontoInss);
        salarioLiquido = calculaSalarioLiquido(salarioInserido, descontoInss, descontoIrpf);
        System.out.println(toString(salarioInserido, descontoInss, descontoIrpf, salarioLiquido));
        System.out.println("----------------------------");

        System.out.println("Insira o segundo salário bruto: ");
        salarioInserido = scanner.nextDouble();

        descontoInss = calculaDescontoInss(salarioInserido);
        descontoIrpf = calculaDescontoIrpf(salarioInserido, descontoInss);
        salarioLiquido = calculaSalarioLiquido(salarioInserido, descontoInss, descontoIrpf);
        System.out.println(toString(salarioInserido, descontoInss, descontoIrpf, salarioLiquido));
        System.out.println("----------------------------");

        System.out.println("Insira o terceiro salário bruto: ");
        salarioInserido = scanner.nextDouble();

        descontoInss = calculaDescontoInss(salarioInserido);
        descontoIrpf = calculaDescontoIrpf(salarioInserido, descontoInss);
        salarioLiquido = calculaSalarioLiquido(salarioInserido, descontoInss, descontoIrpf);
        System.out.println(toString(salarioInserido, descontoInss, descontoIrpf, salarioLiquido));
        System.out.println("----------------------------");

        System.out.println("Insira o quarto salário bruto: ");
        salarioInserido = scanner.nextDouble();

        descontoInss = calculaDescontoInss(salarioInserido);
        descontoIrpf = calculaDescontoIrpf(salarioInserido, descontoInss);
        salarioLiquido = calculaSalarioLiquido(salarioInserido, descontoInss, descontoIrpf);
        System.out.println(toString(salarioInserido, descontoInss, descontoIrpf, salarioLiquido));
        System.out.println("----------------------------");

        System.out.println("Insira o quinto salário bruto: ");
        salarioInserido = scanner.nextDouble();

        descontoInss = calculaDescontoInss(salarioInserido);
        descontoIrpf = calculaDescontoIrpf(salarioInserido, descontoInss);
        salarioLiquido = calculaSalarioLiquido(salarioInserido, descontoInss, descontoIrpf);
        System.out.println(toString(salarioInserido, descontoInss, descontoIrpf, salarioLiquido));
        System.out.println("----------------------------");
    }
}
