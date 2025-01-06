package Logica;
import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        double nota1,nota2,nota3,nota4,media;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a 1º nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a 2º nota: ");
        nota2 = scanner.nextDouble();
        System.out.println("Digite a 3º nota: ");
        nota3 = scanner.nextDouble();
        System.out.println("Digite a 4º nota: ");
        nota4 = scanner.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas é: " + media);
        scanner.close();
    }
}
