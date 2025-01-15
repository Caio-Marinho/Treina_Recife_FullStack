package Logica;
import java.util.Scanner;

public class Questao0102LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco,valor=0,dinheiro,troco;
        int contador = 1;
        do {
            System.out.printf("produto %d: R$ ", contador);
            preco = sc.nextDouble();
            valor += preco ;
            contador++;
        } while (preco != 0);
        System.out.printf("Total: R$ %.2f%n", valor);
        do {
            System.out.printf("Dinheiro: R$ ");
            dinheiro = sc.nextDouble();
            troco = dinheiro - valor;
            if (troco < 0) {
                System.out.println("Dinheiro insuficiente!");
            }
        } while (troco < 0);
        sc.close();
        System.out.printf("Troco: R$ %.2f%n", troco);

    }
}
