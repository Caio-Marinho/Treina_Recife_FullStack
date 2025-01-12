package Logica;

import java.util.Scanner;

public class Questao054ED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1,nota2,media;
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2)/2;
        System.out.println("Media: "+media);
        if (media == 10) {
            System.out.println("Aprovado por merito");
        } else if (media >= 7 ) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
