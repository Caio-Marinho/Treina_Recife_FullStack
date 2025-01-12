package Logica;
import java.util.Scanner;

public class Questao021ES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area;
        System.out.println("Informe a aréa do local a ser pintado em metros quadrados: ");
        area = scanner.nextDouble();
        double litros = area / 3;
        int latas = (litros / 18) % 1 == 0 ? (int) litros / 18 : (int) (litros / 18) + 1;
        double custo = latas * 80;
        System.out.println("Quantidade de latas: " + latas);
        System.out.println("Custo: " + custo);
        scanner.close();
    }
}
