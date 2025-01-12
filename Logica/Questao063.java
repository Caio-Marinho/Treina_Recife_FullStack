package Logica;
import java.util.Scanner;

public class Questao063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,centena,dezena,unidade,soma;
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        centena = num / 100;
        dezena = (num % 100) / 10;
        unidade = num % 10;
        soma = centena + dezena + unidade;
        if (centena > 0){
            System.out.printf(num+" = "+centena+" centenas + "+dezena+" dezenas + "+unidade+" unidades = "+"Soma: "+soma);
        } else if (dezena > 0){
            System.out.printf(num+" = "+dezena+" dezenas + "+unidade+" + unidades = "+"Soma: "+soma);
        } else {
            System.out.printf(num+" = "+unidade+" unidades = "+"Soma: "+soma);
        }
        sc.close();
    }
}
