package Logica;

import java.util.Scanner;

public class Questao055ED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saque,notas100,notas50,notas10,notas5,notas1;
        System.out.println("Digite o valor do saque: ");
        saque = sc.nextInt();
        sc.close();
        if (saque>10 && saque<600) {
            notas100 = saque / 100;
            notas50 = (saque % 100) / 50;
            notas10 = ((saque % 100) % 50) / 10;
            notas5 = (((saque % 100) % 50) % 10) / 5;
            notas1 = (((saque % 100) % 50) % 10) % 5;
            System.out.println("Notas de 100: "+notas100+"\nNotas de 50: "+notas50+"\nNotas de 10: "+notas10+"\nNotas de 5: "+notas5+"\nNotas de 1: "+notas1);
        } else {
            System.out.println("O valor do saque deve estar entre 10 e 600");
        }
    }
}
