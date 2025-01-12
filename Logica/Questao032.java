package Logica;
import java.util.Scanner;

public class Questao032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco_produto,valor_venda,percentual;
        System.out.println("Informe o preço do produto: ");
        preco_produto = sc.nextDouble();
        System.out.println("Informe o percentual de lucro: ");
        percentual = sc.nextDouble();
        valor_venda = preco_produto + (preco_produto * (percentual/100));
        System.out.println("O valor de venda do produto é: " + valor_venda);
        sc.close();
    }
}
