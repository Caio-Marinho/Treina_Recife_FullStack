package Logica;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        int n1,n2,soma;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o 1º Número: ");
        n1 = scanner.nextInt();
        System.out.print("Digite o 2º Número: ");
        n2 = scanner.nextInt();
        soma = n1 + n2;
        System.out.printf("A soma de %d + %d é igual a %d",n1,n2,soma);
        scanner.close();
    }
}
