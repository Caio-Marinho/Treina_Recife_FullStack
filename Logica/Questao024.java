package Logica;
import java.util.Scanner;

public class Questao024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma,subtracao,multiplicao,divisao,num1,num2;
        System.out.println("Digite o 1º Número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o 2º Número: ");
        num2 = sc.nextDouble();
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicao = num1 * num2;
        divisao = num1 / num2;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicao);
        System.out.println("Divisão: " + divisao);
        sc.close();
    }
}
