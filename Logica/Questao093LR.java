package Logica;

import java.util.Scanner;

public class Questao093LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,primo=0;
        System.out.println("Digite um número:");
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                primo++;
                System.out.println("O número é divisível por "+i);
            }
        }
        if (primo >= 3){
            System.out.println("O número "+numero+" não é primo.");
        } else {
            System.out.println("O número "+numero+" é primo.");
        }
        
        sc.close();
    }
}
