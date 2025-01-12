package Logica;

import java.util.Scanner;

public class Questao76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota,soma=0,media;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite a %dº nota: ",i);
            nota = sc.nextDouble();
            soma += nota;
        }
        sc.close();
        media = soma / 5;
        System.out.println("Media: " + media);
    }
}
