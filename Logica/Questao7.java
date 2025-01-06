package Logica;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado, area;
        System.out.println("Digite o valor do lado do quadrado: ");
        lado = scanner.nextDouble();
        area = lado * lado;
        System.out.printf("A area do quadrado é: %.2f",  area);
        scanner.close();
    }
}
