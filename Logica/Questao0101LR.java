package Logica;
import java.util.Scanner;

public class Questao0101LR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco,valor;
        System.out.println("Informe o preço do pão: ");
        valor = sc.nextDouble();
        System.out.println("| Panificadora Pão Ontela: Tabela de Preços |");
        for (int item = 1; item <= 50; item++) {
            preco = valor * item;
            System.out.printf("%d - R$ %.2f%n", item, preco);
        }
        sc.close();
    }
}
