package Logica;
import java.util.Scanner;

public class Questao045ED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, percentualReajustado,valorAumentado,novoSalario;
        System.out.println("Informe seu salario: ");
        salario = sc.nextDouble();
        sc.close();

        if (salario <= 280){
            percentualReajustado = 0.20;
            valorAumentado = salario * percentualReajustado;
            novoSalario = salario + valorAumentado;
            System.out.printf("Seu salario de R$ %.2f foi reajustado em %.2f%% e com uma acrescimo de R$ %.2f agora é R$ %.2f",salario,percentualReajustado*100,valorAumentado,novoSalario);
        } else if (salario > 280 && salario <= 700){
            percentualReajustado = 0.15;
            valorAumentado = salario * percentualReajustado;
            novoSalario = salario + valorAumentado;
            System.out.printf("Seu salario de R$ %.2f foi reajustado em %.2f%% e com uma acrescimo de R$ %.2f agora é R$ %.2f",salario,percentualReajustado*100,valorAumentado,novoSalario);
        } else if (salario > 700 && salario <= 1500){
            percentualReajustado = 0.10;
            valorAumentado = salario * percentualReajustado;
            novoSalario = salario + valorAumentado;
            System.out.printf("Seu salario de R$ %.2f foi reajustado em %.2f%% e com uma acrescimo de R$ %.2f agora é R$ %.2f",salario,percentualReajustado*100,valorAumentado,novoSalario);
        } else {
            percentualReajustado = 0.05;
            valorAumentado = salario * percentualReajustado;
            novoSalario = salario + valorAumentado;
            System.out.printf("Seu salario de R$ %.2f foi reajustado em %.2f%% e com uma acrescimo de R$ %.2f agora é R$ %.2f",salario,percentualReajustado*100,valorAumentado,novoSalario);
        }
    }
}
