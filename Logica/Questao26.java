package Logica;
import java.util.Scanner;

public class Questao26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,aux;
        System.out.println("Digite o primeiro valor: ");
        a = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = sc.nextDouble();
        System.out.println("O valor de A é: "+a);
        System.out.println("O valor de B é: "+b);
        aux = a;
        a = b;
        b = aux;
        System.out.println("Agora o valor de A é: "+a);
        System.out.println("Agora o valor de B é: "+b);
        sc.close();
    }
}
