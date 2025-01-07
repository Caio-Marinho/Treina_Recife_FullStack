package Logica;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double volume_esfera;
        System.out.println("Digite o valor do raio da esfera: ");
        double raio = scanner.nextFloat();
        volume_esfera = ((4 * 3.14 * (raio * raio * raio)) / 3);
        System.out.println("O volume da esfera é: " + volume_esfera);
        scanner.close();
    }
}
