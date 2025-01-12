package Logica;
import java.util.Scanner;

public class Questao035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1,num2;
        System.out.println("Digite o 1º Número: ");
        num1 = scanner.nextDouble();
        System.out.println("Digite o 2º Número:");
        num2 = scanner.nextDouble();
        scanner.close();

        if (num1 > num2) {
            System.out.println("O maior número entre "+num1+" e "+num2+" é: "+num1);
        } else if (num1 < num2) {
            System.out.println("O maior número entre "+num1+" e "+num2+" é: "+num2);
        }else {
            System.out.println("Os dois números são iguais");
        }
    }
}
