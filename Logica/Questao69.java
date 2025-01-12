package Logica;
import java.util.Scanner;

public class Questao69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Digite a nota: ");
        nota = sc.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida, digite novamente: ");
            nota = sc.nextDouble();
        }
        System.out.println("Nota: " + nota);
        sc.close();
    }
}