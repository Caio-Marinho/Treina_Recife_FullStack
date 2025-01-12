package Logica;
import java.util.Scanner;

public class Questao018ES {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double altura,peso_ideal_homen,peso_ideal_mulher;
       System.out.println("Digite o sua altura: ");
       altura = scanner.nextDouble();
       peso_ideal_homen = (72.7 * altura) - 58;
       peso_ideal_mulher = (62.1 * altura) - 44.7;
       System.out.println("O peso ideal para homens é: " + peso_ideal_homen);
       System.out.println("O peso ideal para mulheres é: " + peso_ideal_mulher);
       scanner.close();
    }
}
