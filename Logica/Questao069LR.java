package Logica;
import java.util.Scanner;

public class Questao069LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        do {
            System.out.print("Por favor Digite uma nota entre 0 e 10: ");
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.print("Nota inválida! ");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota Valida: " + nota);
        sc.close();
    }
}