package Refatorado;

public class CalculoIrpf {
    private final double faixaUm = 1903.98d;
    private final double faixaDois = 2826.65d;
    private final double faixaTres = 3751.05d;
    private final double faixaQuatro = 4664.68d;

    public double retornaDescontosIrpf(double salarioBruto, double descontoInss) {
        double salarioTributavel = salarioBruto - descontoInss;
        double descontoIrpf;
        if (salarioTributavel <= faixaUm) {
            descontoIrpf = 0;
        } else if (salarioTributavel <= faixaDois) {
            descontoIrpf = ((salarioTributavel - faixaUm) * 0.075d);
        } else if (salarioTributavel <= faixaTres) {
            descontoIrpf = ((salarioTributavel - faixaDois) * 0.15d)
                    + ((faixaDois - faixaUm) * 0.075d);
        } else if (salarioTributavel <= faixaQuatro) {
            descontoIrpf = ((salarioTributavel - faixaTres) * 0.225d)
                    + ((faixaTres - faixaDois) * 0.15d)
                    + ((faixaDois - faixaUm) * 0.075d);
        } else {
            descontoIrpf = ((salarioTributavel - faixaQuatro) * 0.275d)
                    + ((faixaQuatro - faixaTres) * 0.225d)
                    + ((faixaTres - faixaDois) * 0.15d)
                    + ((faixaDois - faixaUm) * 0.075d);
        }

        return descontoIrpf;
    }
}
