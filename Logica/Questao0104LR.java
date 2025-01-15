package Logica;
import java.util.Scanner;

public class Questao0104LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,inicio,fim,multiplicacao;
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        do {
            System.out.println("Digite o início da tabuada: ");
            inicio = sc.nextInt();
            System.out.println("Digite o fim da tabuada: ");
            fim = sc.nextInt();
            if (fim < inicio) {
                System.out.println("O fim da tabuada deve ser maior que o início. Por favor, tente novamente.");
            }
        } while (fim < inicio);

        System.out.printf("Montando a tabuada de: %d%n", numero);
        System.out.printf("Começar por: %d", inicio);
        System.out.printf("Terminar em: %d%n", fim);
        System.out.println("Montando a tabuada de: " + numero + " começando em " + inicio + " e terminando em " + fim);
        
        for (int i = inicio; i <= fim; i++) {
            multiplicacao = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplicacao);
        }
        sc.close();
    }
}
