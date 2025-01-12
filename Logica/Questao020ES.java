package Logica;
import java.util.Scanner;
public class Questao020ES {
    public static void main(String[] args) {
        double salario_hora,salario_mensal,horas_mensal,inss,imposto_renda,sindicato,salario_liquido;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salario por hora: ");
        salario_hora = scanner.nextDouble();
        System.out.print("Digite o total de horas trabalhadas por dia: ");
        horas_mensal = scanner.nextDouble();
        salario_mensal = salario_hora * horas_mensal;
        sindicato = (salario_mensal * 0.05);
        inss = (salario_mensal * 0.08);
        imposto_renda = (salario_mensal * 0.11);
        salario_liquido = salario_mensal - sindicato - inss - imposto_renda;
        System.out.println("O salario bruto é: " + salario_mensal);
        System.out.println("O desconto do sindicato é: " + sindicato);
        System.out.println("O desconto do INSS é: " + inss);
        System.out.println("O desconto do imposto de renda é: " + imposto_renda);
        System.out.println("O salario liquido é: " + salario_liquido);
        scanner.close();
    }
}
