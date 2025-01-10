package Logica;
import java.util.Scanner;

public class Questao50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,delta,equacao;
        System.out.println("Digite o valor de a: ");
        a = sc.nextInt();
        if (a==0){
            System.out.println("A equação não tem solução");
            sc.close();
            System.exit(0);
        }
        System.out.println("Digite o valor de b: ");    
        b = sc.nextInt();
        System.out.println("Digite o valor de c: ");
        c = sc.nextInt();
        delta = (b*b)-(4*a*c);
        if (delta<0){
            System.out.printf("delta é %.2f por tanto Não possui raiz real",delta);
            sc.close();
            System.exit(0);
        } else if (delta == 0){
            equacao = -b / (2*a);
            System.out.printf("delta é %.2f por tanto possui uma raiz real %.2f",delta,equacao);
        } else{
            double equacao1 = (-b + Math.sqrt(delta))/(2*a);
            double equacao2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.printf("A equação tem duas raízes reais Positivo: %.2f e Negativo: %.2f",equacao1,equacao2);
        }
        sc.close();
    }
}
