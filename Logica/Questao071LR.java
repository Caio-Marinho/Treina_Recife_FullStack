package Logica;

import java.util.Scanner;

public class Questao071LR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;
        
        do {
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
            if (nome.length() <= 3) {
                System.out.println("Nome invalido!! O nome deve ter mais de 3 letras: ");
            }
        } while (nome.length() <= 3);
        
        do {
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade invalida!! A idade deve estar entre 0 e 150: ");
            }
        } while (idade < 0 || idade > 150);
        
        do {
            System.out.println("Digite o salario: ");
            salario = sc.nextDouble();
            if (salario < 0) {
                System.out.println("Salario invalido!! O salario nao pode ser negativo: ");
            }
        } while (salario < 0);
        
        do {
            System.out.println("Digite o sexo: \nM - Masculino \nF - Feminino");
            sexo = sc.next().toUpperCase().charAt(0);
            if (sexo != 'M' && sexo != 'F') {
                System.out.println("Sexo invalido!! Digite 'M' para masculino ou 'F' para feminino: ");
            }
        } while (sexo != 'M' && sexo != 'F');
        
        do {
            System.out.println("Digite o estado civil: \nS - Solteiro \nC - Casado \nV - Viuvo \nD - Divorciado");
            estadoCivil = sc.next().toUpperCase().charAt(0);
            if (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D') {
                System.out.println("Estado civil invalido!! Digite 'S' para solteiro, 'C' para casado, 'V' para viuvo ou 'D' para divorciado: ");
            }
        } while (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D');
        
        
        sc.close();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        if (sexo == 'M') {
            System.out.println("Sexo: Masculino");
        } else {
            System.out.println("Sexo: Feminino");
        }
        if (estadoCivil == 'S') {
            System.out.println("Estado Civil: Solteiro");
        } else if (estadoCivil == 'C') {
            System.out.println("Estado Civil: Casado");
        } else if (estadoCivil == 'V') {
            System.out.println("Estado Civil: Viuvo");
        } else {
            System.out.println("Estado Civil: Divorciado");
        }
    }
    
}
