package Logica;
import java.util.Scanner;

public class Questao60 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double kilo,maca,morango,total,desconto,totalDescontado;
            int produto;
            maca = 1.80;
            morango = 2.50;
            desconto = 0.1;
            System.out.println("Informe o que vai comprar: \n1- Maças\n2- Morangos");
            produto = sc.nextInt();
            if (produto == 1) {
            System.out.println("Quantos kilos de macas?");
            kilo = sc.nextDouble();
            if (kilo <= 5) {
                total = kilo * maca;
                System.out.println("O valor a ser pago é: " + total);
            } else {
                maca = 1.50;
                total = kilo * maca;
                if (kilo > 8 || total > 25){
                    totalDescontado = total - (total * desconto);
                    System.out.println("O valor a ser pago é: " + totalDescontado);
                }else {
                System.out.println("O valor a ser pago é: " + total);
                }
            }
        } else if (produto == 2) {
            System.out.println("Quantos kilos de morangos?");
            kilo = sc.nextDouble();
            if (kilo <= 5) {
                total = kilo * morango;
                System.out.println("O valor a ser pago é: " + total);
            } else {
                morango = 2.20;
                total = kilo * morango;
                if (kilo > 8 || total > 25){
                    totalDescontado = total - (total * desconto);
                    System.out.println("O valor a ser pago é: " + totalDescontado);
                } else{
                    System.out.println("O valor a ser pago é: " + total);
                }
            }
        }else {
            System.out.println("Opção inválida!");
        }
        sc.close();
    }
}
