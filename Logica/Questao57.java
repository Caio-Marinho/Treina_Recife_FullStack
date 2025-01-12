
package Logica;
import java.util.Scanner;

public class Questao57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,soma,subtracao,multiplicao,divisao;
        String operacao;
        System.out.println("Digite o 1º Número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o 2º Número: ");
        n2 = sc.nextInt();
        System.out.println("Digite a operação desejada(soma,subtracao,multiplicacao,divisao): ");
        operacao = sc.next().toLowerCase();
        if (operacao.equals("soma")) {
            soma = n1 + n2;
            System.out.println("Soma: " + soma);
            if (soma == 0){
                System.out.println("Soma Zero");
            } else if (soma % 2 == 0) {
                System.out.println("Soma Par");
                if (soma > 0){
                    System.out.println("Soma Positiva");
                } else{
                    System.out.println("Soma Negativa");
                }
            } else {
                System.out.println("Soma Impar");
                if (soma > 0){
                    System.out.println("Soma Positiva");
                } else if (soma < 0){
                    System.out.println("Soma Negativa");
                } else{
                    System.out.println("Soma Zero");
                }
            }
        } else if (operacao.equals("subtracao")) {
            subtracao = n1 - n2;            
            System.out.println("Subtração: " + subtracao);
            if (subtracao == 0){
                System.out.println("Subtração Zero");
            } else if (subtracao % 2 == 0) {
                System.out.println("Subtração Par");
                if (subtracao > 0){
                    System.out.println("Subtração Positiva");
                } else if (subtracao < 0){
                    System.out.println("Subtração Negativa");
                } else{
                    System.out.println("Subtração Zero");
                }
            } else {
                System.out.println("Subtração Impar");
                if (subtracao > 0){
                    System.out.println("Subtração Positiva");
                } else{
                    System.out.println("Subtração Negativa");
                }
            }
        } else if (operacao.equals("multiplicacao")) {
            multiplicao = n1 * n2;            
            System.out.println("Multiplicação: " + multiplicao);
            if (multiplicao == 0){
                System.out.println("Multiplicação Zero");
            } else if (multiplicao % 2 == 0) {
                System.out.println("Multiplicação Par");
                if (multiplicao > 0){
                    System.out.println("Multiplicação Positiva");
                } else{
                    System.out.println("Multiplicação Negativa");
                }
            } else {
                System.out.println("Multiplicação Impar");
                if (multiplicao > 0){
                    System.out.println("Multiplicação Positiva");
                } else{
                    System.out.println("Multiplicação Negativa");
                }
            }
        } else if (operacao.equals("divisao")) {
            if (n2 == 0){
                System.out.println("Divisão por Zero");
            } else {
                divisao = n1 / n2;            
                System.out.println("Divisão: " + divisao);
                if (divisao == 0){
                    System.out.println("Divisão Zero");
                } else if (divisao % 2 == 0) {
                    System.out.println("Divisão Par");
                    if (divisao > 0){
                        System.out.println("Divisão Positiva");
                    } else{
                        System.out.println("Divisão Negativa");
                    }
                } else {
                    System.out.println("Divisão Impar");
                    if (divisao > 0){
                        System.out.println("Divisão Positiva");
                    } else{
                        System.out.println("Divisão Negativa");
                    }
                }
            }
        }else{
            System.out.println("Operação Inválida");
        }
        sc.close();
    
    }
}