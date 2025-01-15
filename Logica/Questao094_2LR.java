package Logica;
import java.util.Scanner;

public class Questao094_2LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,primo=0,raiz=1;
        System.out.println("Digite um número:");
        numero = sc.nextInt();
        while (raiz * raiz <= numero) {
            raiz++;
        }
        raiz--;
        for (int i = 1; i <= numero; i++){
            for (int j = 1; j <= raiz; j++){
                if (i % j == 0){
                    primo++;
                }
                if (primo == 2 && i != raiz && i != 2){
                    System.out.println("O número "+i+" não é primo\n");
                    break;
                }
            }
            if (primo < 2 && i != 1 || i == raiz || i == 2){
                System.out.println("O número "+i+" é primo\n");
            }
            primo = 0;
            sc.close();
        }
    }
}