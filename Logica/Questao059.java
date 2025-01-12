package Logica;
import java.util.Scanner;

public class Questao059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gasolina,alcool,desconto,litrosAlcool,litrosGasolina,valorAlcool,valorGasolina;
        char combustivel;
        gasolina = 2.50;
        alcool = 1.90;
        System.out.println("Informe o tipo de combustivel: \nA - Alcool\nG - Gasolina ");
        combustivel = sc.next().toUpperCase().charAt(0);
        if (combustivel == 'A') {
            System.out.println("Informe o quantos litros de alcool: ");
            litrosAlcool = sc.nextDouble();
            valorAlcool = litrosAlcool * alcool;
            if (litrosAlcool <= 20) {
                desconto = valorAlcool * 0.03;
                System.out.println("O desconto foi de: " + desconto);
                System.out.println("O valor a ser pago e: " + (valorAlcool - desconto));
            } else {
                desconto = valorAlcool * 0.05;
                System.out.println("O desconto foi de: " + desconto);
                System.out.println("O valor a ser pago e: " + (valorAlcool - desconto));
            }
        } else if (combustivel == 'G') {
            System.out.println("Informe o quantos litros de gasolina: ");
            litrosGasolina = sc.nextDouble();
            valorGasolina = litrosGasolina * gasolina;
            if (litrosGasolina <= 20) {
                desconto = valorGasolina * 0.04;
                System.out.println("O desconto foi de: " + desconto);
                System.out.println("O valor a ser pago e: " + (valorGasolina - desconto));
            } else {
                desconto = valorGasolina * 0.06;
                System.out.println("O desconto foi de: " + desconto);
                System.out.println("O valor a ser pago e: " + (valorGasolina - desconto));
            }
        }
        sc.close();
    }
}
