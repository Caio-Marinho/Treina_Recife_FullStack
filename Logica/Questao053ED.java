package Logica;
import java.util.Scanner;

public class Questao053ED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,centena,dezena,unidade;
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        centena = numero / 100;
        dezena = (numero % 100) / 10;
        unidade = numero % 10;
        if (centena>0){
            System.out.printf(numero+" = "+centena+" centenas, "+dezena+" dezenas,"+unidade+" unidades%n");
        } else if (dezena>0){
            System.out.printf(numero+" = "+dezena+" dezenas,"+unidade+" unidades%n");
        } else {
            System.out.printf(numero+" = "+unidade+" unidades%n");
        }
        sc.close();
    }
}
