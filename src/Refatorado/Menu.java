package Refatorado;

import java.util.Scanner;

public class Menu {
    public void exibeMenu (){

        Scanner scanner = new Scanner(System.in);
        var calculoInss = new CalculoInss();
        var calculoIrpf = new CalculoIrpf();
        var calculoSalarioLiquido = new CalculoSalarioLiquido();

        System.out.println("-------Bem-vindo ao Programa Calcula Salário-------");
        System.out.println("Vamos calcular, apresentar os descontos e imprimir o salário líquido com base no salário bruto inserido");

        double descontoInss, descontoIrpf, salarioLiquido;

        double salarioInserido;

            System.out.println("Insira o salário bruto: ");
        while (true) {

            salarioInserido = scanner.nextDouble();
            if (salarioInserido == 0) {
                break;
            }

            descontoInss = calculoInss.retornaDescontosInss(salarioInserido);
            descontoIrpf = calculoIrpf.retornaDescontosIrpf(salarioInserido, descontoInss);
            salarioLiquido = calculoSalarioLiquido
                    .calculaSalarioLiquido(salarioInserido, descontoInss, descontoIrpf);

            System.out.println(calculoSalarioLiquido
                    .toString(salarioInserido,
                            descontoInss,
                            descontoIrpf,
                            salarioLiquido));

            System.out.println("----------------------------");
            System.out.println("Insira outro salário bruto para calcular ou [0] para encerrar");
        }

        scanner.close();
    }
}
