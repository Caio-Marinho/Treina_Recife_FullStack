package Logica;
import java.util.Scanner;

public class Questao081LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base,resultado=1;
        int expoente;
        System.out.println("Digite a base: ");
        base = sc.nextDouble();
        System.out.println("Digite o expoente: ");
        expoente = sc.nextInt();
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }
        System.out.println("O resultado é: "+resultado);
        sc.close();
    }
    
}
