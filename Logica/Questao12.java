package Logica;
import java.util.Scanner;
public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double volume_cilindro;
        int raio,altura;
        System.out.println("Digite o valor do raio do cilindro:");
        raio = scanner.nextInt();
        System.out.println("Digite o valor da altura do cilindro:");
        altura = scanner.nextInt();
        volume_cilindro = 3.14 * (raio * raio) * altura;
        System.out.println("O volume do cilindro é: " + volume_cilindro);
        scanner.close();
    }
}