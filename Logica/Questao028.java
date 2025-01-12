package Logica;
import java.util.Scanner;

public class Questao028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor_depositado,rendimento_mensal;
        System.out.println("Informe um valor a ser depositado: ");
        valor_depositado = sc.nextDouble();
        rendimento_mensal = valor_depositado * 0.5;
        System.out.println("O valor do rendimento foi de: "+rendimento_mensal);
        sc.close();

    }
}
