package Logica;
import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int area_triangulo,base,altura;
        System.out.println("Digite o valor da base do triângulo: ");
        base = scanner.nextInt();
        System.out.println("Digite o valor da altura do triângulo: ");
        altura = scanner.nextInt();        
        area_triangulo = (base * altura) / 2;
        System.out.println("A area do triângulo é: " + area_triangulo);
        scanner.close();
    }
}
