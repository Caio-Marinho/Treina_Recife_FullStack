package Logica;

import java.util.Scanner;

public class Questao92 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int qtdNumeros,soma=0,numero,maior=0,menor=0;
        System.out.println("Quantos números deseja informar:");
        qtdNumeros = sc.nextInt();
        for (int i = 0; i < qtdNumeros; i++) {
            System.out.printf("Digite o %dº número: ",i+1);
            numero = sc.nextInt();
            while (numero < 0 || numero > 1000) {
                System.out.printf("Número inválido, digite um número entre 0 e 1000: ");
                numero = sc.nextInt();
            }
            if (i == 0) {
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
