package Logica;

import java.util.Scanner;

public class Questao92_2LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,primo=0,raiz=1;
        System.out.println("Digite um número:");
        numero = sc.nextInt();
        while (raiz * raiz <= numero) {
            raiz++;
        }
        raiz--;
        for (int i = 1; i <= raiz; i++) {
            if (numero % i == 0) {
                primo++;
            }
        }
        if (primo == 2) {
            System.out.println("O número "+numero+" não é primo");
        } else {
            System.out.println("O número "+numero+" é primo");
        }
        sc.close();
    }
}
