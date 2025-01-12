package Logica;
import java.util.Scanner;

public class Questao056ED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número: ");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        sc.close();
    }
}
