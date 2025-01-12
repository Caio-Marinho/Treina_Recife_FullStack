package Logica;
import java.util.Scanner;

public class Questao064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Digite um número: ");
        num = scanner.nextInt();
        scanner.close();
        if (num%3 == 0 && num%7 == 0){
            System.out.println("O número é múltiplo de 3 e 7");
        } else {
            System.out.println("O número não é múltiplo de 3 e 7");
        }
    }
}
