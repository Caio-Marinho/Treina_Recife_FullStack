package Logica;

import java.util.Scanner;

public class Questao0105LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo,cont=0,codigoMaisAlto=0,codigoMaisBaixo=0,codigoMaisGordo=0,codigoMaisMagro=0;
        double maisAlto=0,altura,peso,maisBaixo=3,maisGordo=0,maisMagro=200,mediaPeso,mediaAltura,somaPeso=0,somaAltura=0;
        do {
            System.out.println("Digite o código do cliente da Academia (0 para sair):");
            codigo = sc.nextInt();
            if (codigo != 0) {
                System.out.println("Digite a altura do cliente:");
                altura = sc.nextDouble();
                System.out.println("Digite o peso do cliente:");
                peso = sc.nextDouble();

                if (maisAlto < altura) {
                    maisAlto = altura;
                    codigoMaisAlto = codigo;
                }
                if (maisBaixo > altura) {
                    maisBaixo = altura;
                    codigoMaisBaixo = codigo;
                }
                if (maisGordo < peso) {
                    maisGordo = peso;
                    codigoMaisGordo = codigo;
                }
                if (maisMagro > peso) {
                    maisMagro = peso;
                    codigoMaisMagro = codigo;
                }
                somaPeso += peso;
                somaAltura += altura;
                cont++;
            }
        } while (codigo != 0);
        mediaPeso = somaPeso / cont;
        mediaAltura = somaAltura / cont;
        System.out.println("O cliente com a maior altura é o " + codigoMaisAlto + " com " + maisAlto + " metros de altura");
        System.out.println("O cliente com a menor altura é o " + codigoMaisBaixo + " com " + maisBaixo + " metros de altura");
        System.out.println("O cliente com o maior peso é o " + codigoMaisGordo + " com " + maisGordo + " quilos");
        System.out.println("O cliente com o menor peso é o " + codigoMaisMagro + " com " + maisMagro + " quilos");
        System.out.println("O cliente mais alto tem " + maisAlto + " metros de altura");
        System.out.println("O cliente mais baixo tem " + maisBaixo + " metros de altura");
        System.out.println("O cliente mais gordo pesa " + maisGordo + " quilos");
        System.out.println("O cliente mais magro pesa " + maisMagro + " quilos");
        System.out.println("A altura média dos clientes da academia é de " + mediaAltura + " metros");
        System.out.println("O peso médio dos clientes da academia é de " + mediaPeso + " quilos");
        sc.close();
        }
    }
