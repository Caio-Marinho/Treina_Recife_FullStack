package Logica;
import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado, area;
        System.out.println("Digite o valor do lado do quadrado: ");
        lado = scanner.nextDouble();
        area = 2 * (lado * lado);
        System.out.printf("A area do quadrado é: %.2f",  area);
        scanner.close();
    }
}
