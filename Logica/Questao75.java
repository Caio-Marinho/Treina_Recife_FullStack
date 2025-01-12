package Logica;
import java.util.Scanner;

public class Questao75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1,num2,num3,num4,num5,maior=0.0;
        System.out.println("Digite o 1º Número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o 2º Número: ");
        num2 = sc.nextDouble();
        System.out.println("Digite o 3º Número: ");
        num3 = sc.nextDouble();
        System.out.println("Digite o 4º Número: ");
        num4 = sc.nextDouble();
        System.out.println("Digite o 5º Número: ");
        num5 = sc.nextDouble();
        for (int i = 1; i <= 5; i++) {
            if (num1 > maior) {
                maior = num1;
            } else if (num2 > maior) {
                maior = num2;
            } else if (num3 > maior) {
                maior = num3;
            } else if (num4 > maior) {
                maior = num4;
            } else if (num5 > maior) {
                maior = num5;
            }
        }
        System.out.println("O maior número é: "+maior);
        sc.close();

    }
}
