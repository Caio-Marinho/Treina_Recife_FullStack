/*02 - Faça um programa que receba a soma de todas as verbas recebidas por um  funcionário no mês(salario, horas-extras e comissões) em uma variável do tipo real denominada Salário Bruto. Após o recebimento calcule e exiba na tela o valor do imposto de renda, o valor do INSS e o salário líquido que é obtido abatendo-se do Salário Bruto da soma dos descontos.

Valor Imposto de renda: 5% sobre o salário Bruto
Valor INSS: 11% sobre o salário Bruto */

package ExercicioCAIOGABRIELMARINHOOLIVEIRADONASCIMENTO;
import java.util.Scanner;

public class Q02EXERC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario,comissao,salarioBruto,salarioLiquido,salarioHora,inss,impostoRenda,descontoInss,descontoImpostoRenda;
        int horasExtras;
        inss = 0.11;
        impostoRenda = 0.05;
        System.out.println("Informe o salario bruto: ");
        salario = sc.nextDouble();
        System.out.println("Informe o horas extras: ");
        horasExtras = sc.nextInt();
        System.out.println("Informe a comissao: ");
        comissao = sc.nextDouble();
        sc.close();
        salarioHora = salario / 8;
        descontoInss = (salario * inss);
        descontoImpostoRenda = (salario * impostoRenda);
        salarioBruto = salario + (horasExtras * (salarioHora * 1.5)) + comissao;
        salarioLiquido = salarioBruto - descontoInss - descontoImpostoRenda;

        System.out.printf("Desconto INSS: %.2f\n",descontoInss);
        System.out.printf("Desconto Imposto de Renda: %.2f\n",descontoImpostoRenda);
        System.out.printf("Salario liquido: %.2f\n",salarioLiquido);
    }
}
