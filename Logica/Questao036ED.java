package Logica;

import java.util.Scanner;

public class Questao036ED {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;
        System.out.println("Digite o Número: ");
        num = scanner.nextDouble();
        scanner.close();

        if (num >= 0) {
            System.out.println("O numero é positivo : "+num);
        } else{
            System.out.println("O numero é negativo : "+num);
        }
    }
}
