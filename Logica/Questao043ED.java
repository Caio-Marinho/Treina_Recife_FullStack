package Logica;
import java.util.Scanner;
public class Questao043ED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1,n2,n3;
        System.out.println("Digite o primeiro valor: ");
        n1 = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        n2 = sc.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        n3 = sc.nextDouble();
        sc.close();
        if (n1>= n2 && n1>=n3){
            if (n2>=n3){
                System.out.printf("Ordem descrecente: %f -> %f -> %f",n1,n2,n3);
            } else{
                System.out.printf("Ordem descrecente: %f -> %f -> %f",n1,n3,n2);
            }
        } else if (n2>=n1 && n2>=n3){
            if (n1>=n3){
                System.out.printf("Ordem descrecente: %f -> %f -> %f",n2,n1,n3);
            }else{
                System.out.printf("Ordem descrecente: %f -> %f -> %f",n2,n3,n1);
            }
        } else{
            if (n1>=n2){
                System.out.printf("Ordem descrecente: %f -> %f -> %f",n3,n1,n2);
            } else{
                System.out.printf("Ordem descrecente: %f -> %f -> %f",n3,n2,n1);
            }
        }

    }
}
