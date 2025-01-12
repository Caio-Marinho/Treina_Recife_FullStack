package Logica;
import java.util.Scanner;

public class Questao87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,impares=0,pares=0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número: ",i);
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        sc.close();
        System.out.println("Quantidade de números pares: "+pares+"\nQuantidade de números impares: "+impares);
    }
}
