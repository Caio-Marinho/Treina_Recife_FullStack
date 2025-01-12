package Logica;
import java.util.Scanner;

public class Questao06ES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area_cicunferencia,raio,PI;
        System.out.println("Digite o Raio da circunferencia: ");
        raio = scanner.nextDouble();
        PI = 3.14;
        area_cicunferencia = 2 * PI * (raio * raio);
        System.out.printf("A area da circunferencia eh: %.2f" , area_cicunferencia);
        scanner.close();
    }
}
