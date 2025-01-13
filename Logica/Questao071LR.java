package Logica;

import java.util.Scanner;

public class Questao071LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        System.out.println("Digite a idade: ");
        idade = sc.nextInt();
        System.out.println("Digite o salario: ");
        salario = sc.nextDouble();
        System.out.println("Digite o sexo: \nM - Masculino \nF - Feminino");
        sexo = sc.next().toUpperCase().charAt(0);
        System.out.println("Digite o estado civil: \nS - Solteiro \nC - Casado \nV - Viuvo \nD - Divorciado");
        estadoCivil = sc.next().toUpperCase().charAt(0);
        sc.nextLine();
        while (nome.length() <= 3 || idade < 0 || idade > 150 ||salario <= 0 || sexo != 'M' && sexo != 'F' || estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D') {
            if (nome.length() <= 3) {
                System.out.println("Nome invalido, digite novamente: ");
                nome = sc.nextLine();
            } else if (idade < 0 || idade > 150) {
                System.out.println("Idade invalida, digite novamente: ");
                idade = sc.nextInt();
            } else if (salario <= 0) {
                System.out.println("Salario invalido, digite novamente: \nM - Masculino \nF - Feminino");
                salario = sc.nextDouble();
            } else if (sexo != 'M' && sexo != 'F') {
                System.out.println("Sexo invalido, digite novamente: \nS - Solteiro \nC - Casado \nV - Viuvo \nD - Divorciado");
                sexo = sc.next().toUpperCase().charAt(0);
            } else if (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D') {
                System.out.println("Estado civil invalido, digite novamente: ");
                estadoCivil = sc.next().toUpperCase().charAt(0);
            }
        }
        sc.close();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
    }
    
}
