package Logica;
import java.util.Scanner;

public class Questao016ES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilo,libras;
        System.out.println("Digite o valor em quilos: ");
        kilo = scanner.nextDouble();
        libras = kilo * 2.20462 ;
        System.out.println("O valor em libras é: " + libras);
        scanner.close();
    }
}
