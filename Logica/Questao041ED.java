package Logica;

import java.util.Scanner;

public class Questao041ED {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1,n2,n3,maior,menor;
        System.out.println("Digite o primeiro valor:");
        n1 = scanner.nextDouble();
        System.out.println("Digite o segundo valor:");
        n2 = scanner.nextDouble();
        System.out.println("Digite o terceiro valor:");
        n3 = scanner.nextDouble();
        scanner.close();
        if (n1 > n2 && n1 > n3) {
            maior = n1;
            menor = n2 < n3 ? n2 : n3;
        }else if (n2 > n1 && n2 > n3) {
            maior = n2;
            menor = n1 < n3 ? n1 : n3;
        }else if (n3 > n1 && n3 > n2) {
            maior = n3;
            menor = n1 < n2 ? n1 : n2;
        }else if (n1 == n2 && n1 > n3) {
            maior = n1;
            menor = n3;
        }else if (n1 == n3 && n1 > n2) {
            maior = n1;
            menor = n2;
        }else if (n2 == n3 && n2 > n1) {
            maior = n2;
            menor = n1;
        }else {
            maior = n1;
            menor = n2;
        }
        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);
    }
}
