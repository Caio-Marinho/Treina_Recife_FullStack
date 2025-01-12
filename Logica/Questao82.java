package Logica;

import java.util.Scanner;

public class Questao82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,contagemPares=0;
        System.out.println("Digite o valor inicial: ");
        num1 = sc.nextInt();
        System.out.println("Digite o valor final: ");
        num2 = sc.nextInt();
        while (num1 == num2) {
            System.out.println("Os dois números são iguais.Digite novamente:");
            System.out.println("Digite o primeiro número: ");
            num1 = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            num2 = sc.nextInt();
        }
        if (num1 > num2) {
            for (int i = num1-1; i > num2; i--) {
                if (i % 2 == 0) {
                    contagemPares++;
                }
            }
        } else{
            for (int i = num1+1; i < num2; i++) {
                if (i % 2 == 0) {
                    contagemPares++;
                }
            }
        }
        System.out.println("Quantidade de números pares: "+contagemPares);
        sc.close();
    }
}
