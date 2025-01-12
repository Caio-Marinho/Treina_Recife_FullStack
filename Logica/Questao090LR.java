package Logica;

import java.util.Scanner;

public class Questao090LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdNumeros,soma=0,numero,maior=0,menor=0;
        System.out.println("Quantos números deseja informar:");
        qtdNumeros = sc.nextInt();
        for (int i = 1; i <= qtdNumeros; i++) {
            System.out.printf("Digite o %dº número: ",i);
            numero = sc.nextInt();
            if (i == 1) {
                maior = numero;
                menor = numero;
            } else if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
            soma += numero;
        }
        System.out.println("Maior número: "+maior+"\nMenor número: "+menor+"\nSoma: "+soma);
        sc.close();
    }
}
