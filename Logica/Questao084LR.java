package Logica;
import java.util.Scanner;

public class Questao084LR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num,fatorial = 1;
        System.out.println("Digite um número: ");
        num = scanner.nextInt();
        scanner.close();
        System.out.printf("%d! = ",num);
        for (int i = num; i >= 1; i--){
            fatorial *= i;
           if (i == 1){
               System.out.printf("%d = ",i);
           } else {
               System.out.printf("%d x ",i);
           }
        }
        System.out.print(fatorial);
    }
}
