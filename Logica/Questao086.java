package Logica;

import java.util.Scanner;

public class Questao086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero,soma=0,contador=0,media;
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        while (numero != 0) {
           soma = soma + numero;
           contador++;
           System.out.println("Digite um número: ");
           numero = sc.nextInt();
        }
        
        sc.close();
        if (contador > 0){
            media = soma / contador;
            System.out.println("Media: " + media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }
    }
}
