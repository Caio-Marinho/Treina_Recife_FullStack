package Logica;
import java.util.Scanner;

public class Questao078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Numero entre o  intervalo: ");
        System.out.println("Digite o valor inical: ");
        num1 = sc.nextInt();
        System.out.println("Digite o valor final: ");
        num2 = sc.nextInt();
        if (num1 > num2) {
            for (int i = num1; i >= num2; i--) {
                System.out.println(i);
            }
        } else if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}