package Logica;
import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area;
        System.out.println("Informe a aréa do local a ser pintado em metros quadrados: ");
        area = scanner.nextDouble();
        double litros = (area / 6) * 1.1;
        int latas = (litros / 18) % 1 == 0 ? (int) litros / 18 : (int) (litros / 18) + 1;
        double custo_latas = latas * 80;
        int galao = (litros / 3.6) % 1 == 0 ? (int) (litros / 3.6) : (int) (litros / 3.6) + 1;
        double custo_galao = galao * 25;
        double mistura_lata_restante = litros % 18;
        int mistura_galao = (int)(mistura_lata_restante / 3.6);
        double custoMisturado = (latas * 80) + (mistura_galao * 25);
        System.out.println("Quantidade de latas: " + latas);
        System.out.println("Custo: " + custo_latas);
        System.out.println("Quantidade de galões: " + galao);
        System.out.println("Custo: " + custo_galao);
        System.out.println("Quantidade de latas misturadas: " +  latas);
        System.out.println("Quantidade de galões misturados: " + mistura_galao);
        System.out.println("Custo: " + custoMisturado);
        scanner.close();
    }
}
