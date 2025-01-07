package Logica;
import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area;
        System.out.println("Digite a aréa do local a ser pintado em metros quadrados: ");
        area = scanner.nextDouble();
        double litros = area / 3;
        double latas = litros / 18;
        double custo = latas * 80;
        System.out.println("Quantidade de latas: " + latas);
        System.out.println("Custo: " + custo);
        scanner.close();
    }
}
