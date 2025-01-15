package Logica;
import java.util.Scanner;

public class Questao094LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,primo=0;
        System.out.println("Digite um número:");
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++){
            for (int j = 1; j <= i/2; j++){
                if (i % j == 0){
                    primo++;
                }
                if (primo == 2){
                    System.out.println("O número "+i+" não é primo\n");
                    break;
                }
            }
            if (primo < 2 && i != 1){
                System.out.println("O número "+i+" é primo\n");
            }
            primo = 0;
            sc.close();
        }
    }
}