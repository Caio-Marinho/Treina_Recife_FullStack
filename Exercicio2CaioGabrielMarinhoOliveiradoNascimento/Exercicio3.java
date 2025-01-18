/*3 - Tem-se um conjunto de dados contendo altura e sexo (“M” ou “F”)
de 50 pessoas, fazer um programa que calcule e escreva:
a) a maior e a menor altura do grupo
b) média de altura das mulheres
c) o número de homens */

package Exercicio2CaioGabrielMarinhoOliveiradoNascimento;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura,mediaAlturaMulheres,maiorAltura=0,menorAltura=0,somaAturaMulheres=0;
        char sexo;
        int contHomens = 0,contMulheres = 0;
        for (int i = 1; i <= 50;) {
            System.out.println("Digite sua altura: ");
            altura = scanner.nextDouble();
            System.out.println("Digite seu sexo: ");
            sexo = scanner.next().toUpperCase().charAt(0);
            if (i == 1) {
                maiorAltura = altura;
                menorAltura = altura;
            } 
            if (sexo == 'M') {
                contHomens++;
                i++;
            } else if (sexo == 'F') {
                contMulheres++;
                somaAturaMulheres += altura;
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                } else if (altura < menorAltura) {
                    menorAltura = altura;
                }
                i++;
            } else {
                System.out.println("Sexo invalido! Use 'M' para masculino ou 'F' para feminino.");
            }
        }
        scanner.close();
        mediaAlturaMulheres = somaAturaMulheres/contMulheres;
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Media de altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Numero de homens: " + contHomens);

    }
}
