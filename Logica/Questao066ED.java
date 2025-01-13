package Logica;
import java.util.Scanner;

public class Questao066ED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num,numInvertido;
        System.out.println("Digite um número: ");
        num = sc.nextLine();
        numInvertido = new StringBuilder(num).reverse().toString();
        sc.close();
        if (num.length() == 5 && num.matches("\\d+")){
            if (num.equals(numInvertido)) {
                System.out.println("O número digitado é palíndromo.");
            } else {
                System.out.println("O número digitado não é palíndromo.");
            }
        } else {
            System.out.println("Erro, Você deve digitar um número de exatamente 5 dígitos.");
        }
        
    }
    public static boolean isPalindromo(String num) {
        int numero = num.length();
        for (int i = 0; i < numero / 2; i++) {
            if (num.charAt(i) != num.charAt(numero - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
