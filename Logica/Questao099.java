package Logica;

import java.util.Scanner;

public class Questao099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdCD;
        double custo, totalCusto=0,mediaCusto;
        System.out.println("Quantidade de CDs: ");
        qtdCD = sc.nextInt();
        for (int i = 1; i <= qtdCD; i++) {
            System.out.printf("Digite o custo do %dº CD: ", i);
            custo = sc.nextDouble();
            totalCusto += custo;
        }
        mediaCusto = totalCusto / qtdCD;
        System.out.printf("Media de custo: %.2f",mediaCusto);
        sc.close();
    }
}
