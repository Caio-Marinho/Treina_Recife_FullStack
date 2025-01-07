package Logica;
import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double altura,peso_ideal;
       System.out.println("Digite o sua altura: ");
       altura = scanner.nextDouble();
       peso_ideal = (72.7 * altura) - 58;
       System.out.println("Seu peso ideal é: " + peso_ideal);
       scanner.close();
    }
}
