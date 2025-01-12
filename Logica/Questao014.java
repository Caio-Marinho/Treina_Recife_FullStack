package Logica;
import java.util.Scanner;

public class Questao014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double volume_cubo,aresta;
        System.out.println("Digite o valor da aresta do cubo: ");
        aresta = scanner.nextDouble();
        volume_cubo = aresta * aresta * aresta;
        System.out.println("O volume do cubo é: " + volume_cubo);    
        scanner.close();
    }
}
