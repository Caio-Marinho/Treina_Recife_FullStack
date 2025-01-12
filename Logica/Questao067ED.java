package Logica;
import java.util.Scanner;

public class Questao067ED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso,altura,imc;
        System.out.println("Digite o seu peso: ");
        peso = sc.nextDouble();
        System.out.println("Digite a sua altura: ");
        altura = sc.nextDouble();
        imc = peso / (altura * altura);
        if (imc < 20) {
            System.out.println("Abaixo do peso.");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Peso normal.");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Sobrepeso.");
        } else if (imc > 30 && imc <= 40) {
            System.out.println("Obesidade.");
        } else {
            System.out.println("Obesidade morbida.");
        }
        sc.close();
    }
}
