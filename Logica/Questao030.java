package Logica;
import java.util.Scanner;

public class Questao030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double valor_venda,salario_fixo,salario_mensal;
        System.out.println("Informe o nome do vendedor: ");
        nome = sc.nextLine();
        System.out.println("Informe o valor da venda: ");
        valor_venda = sc.nextDouble();
        System.out.println("Informe o salario fixo: ");
        salario_fixo = sc.nextDouble();
        salario_mensal = salario_fixo + (valor_venda * 0.15);
        System.out.println("O vendedor "+nome+" tem um salario de "+salario_fixo+" e ficou com um salario de "+salario_mensal);
        sc.close();
    }
}
