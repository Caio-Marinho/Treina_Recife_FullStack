package Logica;

import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura, pesoIdeal;
        char sexo;

        System.out.println("Digite o sua altura: ");
        altura = scanner.nextDouble();
        System.out.println("Digite o seu sexo: \nMasculino - M  \nFeminino - F ");
        sexo = scanner.next().toUpperCase().charAt(0);

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        } else {
            System.out.println("Sexo invalido! Use 'M' para masculino ou 'F' para feminino.");
        }
        scanner.close();
    }
}