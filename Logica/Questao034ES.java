package Logica;
import  java.util.Scanner;

public class Questao034ES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, centenas,dezenas,unidades;
        System.out.println("Digite um número entre 0 e 1000:");
        n = sc.nextInt();
        centenas = n / 100;
        dezenas = (n % 100) / 10;
        unidades = n % 10;
        System.out.println("Centenas: " + centenas);
        System.out.println("Dezenas: "+ dezenas);
        System.out.println("Unidades: "+unidades);
        sc.close();
    }
}
