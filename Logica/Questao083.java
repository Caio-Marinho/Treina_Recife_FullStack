package Logica;

import java.util.Scanner;

public class Questao083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma,nota,media;
        int notas;
        soma = 0;
        System.out.println("Quantas Notas deseja informar: ");
        notas = sc.nextInt();
        for (int i = 1; i <= notas; i++) {
            System.out.printf("Digite a %dº nota: ",i);
            nota = sc.nextDouble();
            soma += nota;
        }
        media = soma / notas;
        System.out.printf("Media: %.2f ", media);
        sc.close();
    }
}
