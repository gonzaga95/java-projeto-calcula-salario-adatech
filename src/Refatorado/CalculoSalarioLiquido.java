package Refatorado;

public class CalculoSalarioLiquido {
    public double calculaSalarioLiquido (double salarioBruto,
                                         double descontoInss,
                                         double descontoIrpf){
        double salarioLiquido;
        salarioLiquido = salarioBruto - descontoInss - descontoIrpf;

        return salarioLiquido;
    }

    public String toString (double salarioBruto,
                                   double descontoInss,
                                   double descontoIrpf,
                                   double salarioLiquido) {
        String salarioBrutoFormat = String.format("%.2f", salarioBruto);
        String descontoInssReal = String.format("%.2f", (descontoInss));
        String descontoIrpfReal = String.format("%.2f", (descontoIrpf));
        String salarioLiquidoFormat = String.format("%.2f", salarioLiquido);
        return "Salário bruto: R$ " + salarioBrutoFormat + "\n" +
                "Desconto de INSS: R$ " + descontoInssReal + "\n" +
                "Desconto de IRPF: R$ " + descontoIrpfReal + "\n" +
                "Salário líquido: R$ " + salarioLiquidoFormat;
    }
}
