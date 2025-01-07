package Logica;
import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double volume_cone,altura,raio;
        System.out.println("Digite o valor da altura do cone: ");
        altura = scanner.nextDouble();
        System.out.println("Digite o valor do raio do cone: ");
        raio = scanner.nextDouble();
        volume_cone = (1 * 3.14 * (raio * raio) * altura) / 3;
        System.out.println("O volume do cone é: " + volume_cone);
        scanner.close();
    }
}
