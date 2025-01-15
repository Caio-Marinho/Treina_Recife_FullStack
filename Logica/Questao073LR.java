package Logica;
import java.util.Scanner;

public class Questao073LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paisA,paisB,anos=0;
        double taxaCrescimentoA, taxaCrescimentoB,populacaoA, populacaoB,porcentagemTaxaCrescimentoA,porcentagemTaxaCrescimentoB;
        char novamente='s';
        while (novamente == 's') {
            do {
                System.out.println("Informe o valor incial maior que 0 da populacao do pais A: ");
                paisA = sc.nextInt();
            } while (paisA < 0);
            do {
                System.out.println("Informe o valor incial maior que 0 da populacao do pais B: ");
                paisB = sc.nextInt();
            } while (paisB < 0);

            System.out.println("Informe a taxa de crescimento da populacao do pais A em %: ");
            taxaCrescimentoA = sc.nextDouble();
            System.out.println("Informe a taxa de crescimento da populacao do pais B em %: ");
            taxaCrescimentoB = sc.nextDouble();
            porcentagemTaxaCrescimentoA = (taxaCrescimentoA + 100)/100;
            porcentagemTaxaCrescimentoB = (taxaCrescimentoB + 100)/100;
            while (paisA < paisB){ 
                populacaoA = paisA * porcentagemTaxaCrescimentoA;
                populacaoB = paisB * porcentagemTaxaCrescimentoB;
                paisA = (int) populacaoA;
                paisB = (int) populacaoB;
                anos++;
            }
            System.out.println("Levou " + anos + " anos para que o pais A ultrapasse o pais B");
            System.out.println("Pais A: " + paisA + " Habitantes, Pais B: " + paisB + " Habitantes");
            System.out.println("Deseja calcular novamente? (s/n): ");
            novamente = sc.next().toLowerCase().charAt(0);
            while (novamente != 's' && novamente != 'n') {
                System.out.println("Opção inválida, digite novamente(s/n):");
                novamente = sc.next().toLowerCase().charAt(0);
            }
        }
        sc.close();
    }
}
