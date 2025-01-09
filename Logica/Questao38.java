package Logica;

import java.util.Scanner;

public class Questao38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vogais = "aeiou";
        System.out.println("Digite uma palavra: ");
        char letra = sc.nextLine().toLowerCase().charAt(0);
        if (Character.isLetter(letra)){
            if (vogais.indexOf(letra) != -1){
                System.out.println("A palavra " + letra + " é uma vogal.");
            }else{
                System.out.println("A palavra " + letra + " é uma consoante.");
            }
        } else {
            System.out.println("Não é uma letra.");
        }
        sc.close();
    }
}
