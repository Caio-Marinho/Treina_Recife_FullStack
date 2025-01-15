package Logica;

import java.util.Scanner;

public class Questao096LR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade,qtdPessoa;
        double media;
        System.out.println("Quantidade de pessoas: ");
        qtdPessoa = scanner.nextInt();
        int soma = 0;
        for (int i = 1; i <= qtdPessoa; i++) {
            System.out.printf("Digite a %dº idade: ",i);
            idade = scanner.nextInt();
            soma += idade;
        }
        media = soma / qtdPessoa;
        System.out.println("Media de idade: "+media);
        scanner.close();
        if (media <= 25){
            System.out.println("A média de idade é de "+ media +" e o grupo é jovem");

        } else if (media <= 60){
            System.out.println("A média de idade é de "+ media +" e o grupo é adulto");
        } else {
            System.out.println("A média de idade é de "+ media +" e o grupo é idoso");
        }
    }
}
