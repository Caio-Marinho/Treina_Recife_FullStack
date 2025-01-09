package Logica;
import java.util.Scanner;

public class Questao51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;
        System.out.println("Digite o ano que você deseja saber se é bissexto ou não: ");
        ano = sc.nextInt();
        sc.close();
        if (ano % 4 == 0 && ano % 100 != 0 || ano%400==0){
            System.out.println("O ano "+ano+" é bissexto");
        } else{
            System.out.println("O ano "+ano+" não é bissexto");
        }
    }
}
