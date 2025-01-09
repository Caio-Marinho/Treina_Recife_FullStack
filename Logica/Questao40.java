package Logica;

import java.util.Scanner;

public class Questao40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1,n2,n3;
        System.out.println("Digite o primeiro valor: ");
        n1 = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        n2 = sc.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        n3 = sc.nextDouble();
        sc.close();
        if (n1 > n2 && n1 > n3) {
            System.out.println("O maior número é: "+n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior número é: "+n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("O maior número é: "+n3);
        }else if (n1 == n2 && n1 > n3) {
            System.out.println("O maior número é: 1º"+n1+" e  2º"+n2);
        } else if (n1 == n3 && n1 > n2) {
            System.out.println("O maior número é: 1º"+n1+" e 3º"+n3);
        } else if (n2 == n3 && n2 > n1) {
            System.out.println("O maior número é: 2º"+n2+" e 3º"+n3);
        } else {
            System.out.println("Os números são iguais!");
        }
    }
}
