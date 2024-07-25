**Projeto Cálculo de Salário | Ada Tech | Santander Coders 2024**

Faça um programa que receba 5 salários brutos de funcionários, sabendo-se que são descontados Imposto de Renda e INSS, calcule e mostre o total do salário líquido no referido mês.

    Obs.:Salário Bruto - Descontos = Salário Líquido.

A saída do programa deve fornecer as seguintes informações:

-   Salário bruto.
-   Quanto pagou ao INSS.
-   Quanto pagou de Imposto de Renda.
-   Salário líquido.

Calcule os descontos e o salário líquido com base nas tabelas abaixo:

| **Salário** | % Desconto INSS |
|--|--|
| até 1.212,00 | 7,5% |
| de 1212,01 até 2.427,35 | 9% |
| de 2.427,36 até 3.641,03 | 12% |
| de 3.641,04 até 7.087,22 | 14% |
|--|--|


| Salário | % Desconto IRPF |
|--|--|
| até 1.903,98 | 0% |
| de 1.903,99 até 2.826,65 | 7,5% |
| de 2.826,66 até 3.751,05 | 15% |
| de 3.751,06 até 4.664,68 | 22,50% |
| Acima de 4.664,68 | 27,50% |
|--|--|

**Obs. O projeto entregue não levou em conta a progressividade dos descontos de INSS e IRPF.**

**Update:**

Após a entrega, apenas para fins didáticos, o código foi refatorado em um novo pacote para testar a aplicação da progressividade dos descontos, aproximando o projeto do cálculo "na vida real" com os valores de 2022.

[.../src/Principal/](https://github.com/gonzaga95/java-projeto-calcula-salario-adatech/tree/main/src/Principal)

[.../src/Refatorado/](https://github.com/gonzaga95/java-projeto-calcula-salario-adatech/tree/main/src/Refatorado)

Entregue por **Carlos E. Gonzaga** | [Linkedin](https://www.linkedin.com/in/carlosegonzaga/)