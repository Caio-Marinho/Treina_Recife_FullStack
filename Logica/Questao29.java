package Logica;
import java.util.Scanner;

public class Questao29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor_prestacao,valor_compra;
        System.out.println("Informe o valor da compra: ");
        valor_compra = sc.nextDouble();
        valor_prestacao = valor_compra/5;
        System.out.println("O valor da prestação é: "+valor_prestacao);
        sc.close();

    }

}
