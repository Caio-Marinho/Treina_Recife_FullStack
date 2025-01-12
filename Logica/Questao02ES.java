package Logica;
import java.util.Scanner;

public class Questao02ES {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro número: ");
        numero = scanner.nextInt();
        System.out.printf("O número informado foi: %d",numero);
        scanner.close();
    }
}
