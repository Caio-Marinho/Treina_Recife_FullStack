package Logica;

import java.util.Scanner;

public class Questao085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,fatorial = 1;
        char continuar = 's';
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        while (num >= 16 || num < 0) {
            System.out.println("Digite um número menor que 16: ");
            num = sc.nextInt();
        }
        while (continuar == 's') {
            System.out.printf("%d! = ", num);
            for (int i = num; i >= 1; i--) {
                fatorial *= i;
                if (i == 1) {
                    System.out.printf("%d = ", i);
                } else {
                    System.out.printf("%d x ", i);
                }
            }
            System.out.print(fatorial);
            fatorial = 1;
            System.out.println("\nDeseja continuar? (s/n): ");
            continuar = sc.next().toLowerCase().charAt(0);
            while (continuar != 's' && continuar != 'n') {
                System.out.println("Deseja continuar? (s/n): ");
                continuar = sc.next().toLowerCase().charAt(0);
            }
        }
        sc.close();

    }
}
