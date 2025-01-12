package Logica;
import java.util.Scanner;

public class Questao065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();
        if (idade >=65){
            System.out.println("Você é idoso");
        } else if (idade >= 21){
            System.out.println("Você é maior de idade");
        } else{
            System.out.println("Vocé é menor de idade");
        } sc.close();
    } 
}
