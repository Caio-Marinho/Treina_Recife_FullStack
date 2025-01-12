package Logica;
import java.util.Scanner;

public class Questao013ES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area_retangulo,base,altura;
        System.out.println("Digite o valor da base do retângulo: ");
        base = scanner.nextDouble();    
        System.out.println("Digite o valor da altura do retângulo: ");    
        altura = scanner.nextDouble();
        area_retangulo = base * altura;
        System.out.println("A area do retângulo é: " + area_retangulo);
        scanner.close();
    }
}
