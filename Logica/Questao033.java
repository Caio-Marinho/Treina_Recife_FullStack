package Logica;
import java.util.Scanner;

public class Questao033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double custo_fabrica,custo_consumidor,imposto;
        System.out.println("Informe o custo de fabrica para se produzir um carro: ");
        custo_fabrica = sc.nextDouble();
        imposto = custo_fabrica * 0.28;
        custo_consumidor = custo_fabrica + imposto + ((custo_fabrica +  imposto) * 0.45);
        System.out.println("O custo do carro para o consumidor sera de R$ " + custo_consumidor);
        sc.close();
    }
}
