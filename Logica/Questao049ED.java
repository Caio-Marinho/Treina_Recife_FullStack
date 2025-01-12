package Logica;
import java.util.Scanner;

public class Questao049ED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ladoA,ladoB,ladoC;
        System.out.println("Informe o Lado A do triangulo: ");
        ladoA = sc.nextDouble();
        System.out.println("Informe o Lado B do triangulo: ");
        ladoB = sc.nextDouble();
        System.out.println("Informe o Lado C do triangulo: ");
        ladoC = sc.nextDouble();
        sc.close();
        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA){
            System.out.println("O triangulo é válido");
            if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC){
                System.out.println("O triangulo é equilátero");
            } else if(ladoA == ladoB || ladoA == ladoB || ladoB == ladoC){
                System.out.println("O triangulo é isósceles");
            }else{
                System.out.println("O triangulo é escaleno");
            }
        } else {
            System.out.println("O triangulo não é válido");
        }
    }
}
