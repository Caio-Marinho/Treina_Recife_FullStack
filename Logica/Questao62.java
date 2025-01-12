package Logica;
import java.util.Scanner;

public class Questao62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String arrayNum[] = {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez"};
        System.out.println("Digite um número entre 0 e 10: ");
        num = scanner.nextInt();
        if (num >= 1 && num <= 10) {
            System.out.println("O número digitado foi: " + arrayNum[num-1]);
        } else {
            System.out.println("O número digitado é inválido.");
        }
        scanner.close();

    }
}
