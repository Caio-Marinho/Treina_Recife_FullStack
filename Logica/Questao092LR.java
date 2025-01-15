package Logica;
import java.util.Scanner;

public class Questao092LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,primo=0;
        System.out.println("Digite um número:");
        numero = sc.nextInt();
        for (int i = 1; i <= numero/2; i++){
            if (numero % i == 0){
                primo++;
            }
            if (primo == 2){
                System.out.println("O número "+numero+" não é primo.");
                System.exit(0);
            }
        }
        System.out.println("O número "+numero+" é primo.");
        sc.close();
    }
}
