package Logica;
import java.util.Scanner;

public class Questão9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float fahrenheit, celsius;
        System.out.println("Digite a temperatura em Fahrenheit: ");
        fahrenheit = scanner.nextFloat();
        celsius = 5 * ((fahrenheit - 32) / 9);
        System.out.println("A temperatura em Celsius é: " + celsius);
        scanner.close();
    }
}
