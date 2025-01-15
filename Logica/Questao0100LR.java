package Logica;

public class Questao0100LR {
    public static void main(String[] args) {
        double preco;
        System.out.println("| Lojas Tabajara: Tabela de preços |");
        for (int item = 1; item <= 50; item++) {
            preco = 1.99 * item;
            System.out.printf("%d - R$ %.2f%n", item, preco);
        }
    }
}