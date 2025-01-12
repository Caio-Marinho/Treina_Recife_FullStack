package Logica;

import java.util.Scanner;

public class Questao042 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double precoProduto1, precoProduto2,precoProduto3,producoComMenorPreco;
        System.out.println("Digite o valor do primeiro produto:");
        precoProduto1 = scanner.nextDouble();
        System.out.println("Digite o valor do segundo produto:");
        precoProduto2 = scanner.nextDouble();
        System.out.println("Digite o valor do terceiro produto:");
        precoProduto3 = scanner.nextDouble();
        scanner.close();

        if (precoProduto1 < precoProduto2 && precoProduto1 < precoProduto3) {
            producoComMenorPreco = precoProduto1;
        } else if (precoProduto2 < precoProduto1 && precoProduto2 < precoProduto3) {
            producoComMenorPreco = precoProduto2;
        } else {
            producoComMenorPreco = precoProduto3;
        }
        System.out.println("O menor valor e: " + producoComMenorPreco);
    }
}
