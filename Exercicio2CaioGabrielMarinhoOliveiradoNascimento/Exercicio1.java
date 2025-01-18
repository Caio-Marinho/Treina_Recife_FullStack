/*1 - Faça um programa que leia 20 números inteiros e apresente:
a. Média dos ímpares
b. Maior número par
c. Diferença do maior menos o menor número
 */
package Exercicio2CaioGabrielMarinhoOliveiradoNascimento;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,maior=0,menor=0,diferenca,impares=0,somaImpar=0,maiorPar=0;
        double media;
        for (int i =1; i <=20; i++) {
            System.out.println("Digite o "+i+"º número: ");
            numero = sc.nextInt();
            if (numero % 2 != 0) {
                impares++;
                somaImpar += numero;

            }
            if (i == 1) {
                maior = numero;
                if (numero % 2 == 0) {
                    maiorPar = numero;
                }
                menor = numero;
            } 
            if (maior < numero) {
                maior = numero;
                if (numero % 2 == 0) {
                    maiorPar = numero;
                }
            } 
            if (menor > numero) {
                menor = numero;
            }
        }
        sc.close();
        diferenca = maior - menor;
        media = impares > 0 ? (double)somaImpar / impares : 0;
        System.out.println(impares>0 ?"Média dos ímpares: "+media : "Não foram digitados números ímpares.");
        System.out.println(maiorPar>0 ? "Maior número par: "+maiorPar: "Não foram digitados números pares.");
        System.out.println("Diferença do maior menos o menor número: "+diferenca);
    }
}