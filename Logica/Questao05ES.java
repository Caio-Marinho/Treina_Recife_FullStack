package Logica;
import java.util.Scanner;

public class Questao05ES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double metros,centimetro;
        System.out.print("Informe o valor da unidade em metro: ");
        metros = scanner.nextDouble();
        centimetro = metros * 100;
        System.out.printf("O valor de %.1f metro em centímetros é: %.0f centimetros%n", metros,centimetro);
        scanner.close();
    }
}
