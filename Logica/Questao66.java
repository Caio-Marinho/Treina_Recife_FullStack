package Logica;
import java.util.Scanner;

public class Questao66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num,numInvertido;
        System.out.println("Digite um número: ");
        num = sc.nextLine();
        numInvertido = new StringBuilder(num).reverse().toString();
        sc.close();
        if (num.equals(numInvertido)) {
            System.out.println("O número digitado é palíndromo.");
        } else {
            System.out.println("O número digitado não é palíndromo.");
        }
    }
}
