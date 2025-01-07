package Logica;
import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args) {
        double salario_hora,salario_mensal,horas_mensal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salario por hora: ");
        salario_hora = scanner.nextDouble();
        System.out.println("Digite o total de horas trabalhadas por dia: ");
        horas_mensal = scanner.nextDouble();
        salario_mensal = salario_hora * horas_mensal;
        System.out.println("O salario total é: " + salario_mensal);
        scanner.close();
    }
}
