package Logica;
import java.util.Scanner;

public class Questao31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anos,meses,dias,dias_vividos;
        System.out.println("Quantos anos você tem?");
        anos = sc.nextInt();
        System.out.println("Quantos meses você tem?");
        meses = sc.nextInt();
        System.out.println("Quantos dias você tem?");
        dias = sc.nextInt();
        dias_vividos = (anos * 365) + (meses * 30) + dias;
        System.out.println("Você já viveu " + dias_vividos + " dias");
        sc.close();
    }
}
