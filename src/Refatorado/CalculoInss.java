package Refatorado;

public class CalculoInss {
    private final double faixaUm = 1212.0d;
    private final double faixaDois = 2427.35d;
    private final double faixaTres = 3641.03d;
    private final double faixaQuatro = 7087.22d;

    public double retornaDescontosInss(double salarioBruto) {
        double descontoInss;
        if (salarioBruto <= faixaUm) {
            descontoInss = salarioBruto * 0.075d;
        } else if (salarioBruto <= faixaDois) {
            descontoInss = ((salarioBruto - faixaUm) * 0.09d)
                    + (faixaUm * 0.075d);
        } else if (salarioBruto <= faixaTres) {
            descontoInss = ((salarioBruto - faixaDois) * 0.12d)
                    + ((faixaDois - faixaUm) * 0.09d)
                    + (faixaUm * 0.075d);
        } else if (salarioBruto <= faixaQuatro) {
            descontoInss = ((salarioBruto - faixaTres) * 0.14d)
                    + ((faixaTres - faixaDois) * 0.12d)
                    + ((faixaDois - faixaUm) * 0.09d)
                    + (faixaUm * 0.075d);
        } else {
            double recorteNaoTributavel = salarioBruto - faixaQuatro;
            descontoInss = ((salarioBruto - faixaTres - recorteNaoTributavel) * 0.14d)
                    + ((faixaTres - faixaDois) * 0.12d)
                    + ((faixaDois - faixaUm) * 0.09d)
                    + (faixaUm * 0.075d);
        }

        return descontoInss;
    }
}
