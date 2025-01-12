package Logica;
import java.util.Scanner;

public class Questao073LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paisA,paisB,anos=0;
        double taxaCrescimentoA, taxaCrescimentoB,populacaoA, populacaoB,porcentagemTaxaCrescimentoA,porcentagemTaxaCrescimentoB;
        System.out.println("Informe o valor incial da populacao do pais A: ");
        paisA = sc.nextInt();
        System.out.println("Informe o valor incial da populacao do pais B: ");
        paisB = sc.nextInt();
        System.out.println("Informe a taxa de crescimento da populacao do pais A em %: ");
        taxaCrescimentoA = sc.nextDouble();
        System.out.println("Informe a taxa de crescimento da populacao do pais B em %: ");
        taxaCrescimentoB = sc.nextDouble();
        porcentagemTaxaCrescimentoA = (taxaCrescimentoA + 100)/100;
        porcentagemTaxaCrescimentoB = (taxaCrescimentoB + 100)/100;
        sc.close();
        while (paisA <= paisB){ 
            populacaoA = paisA * porcentagemTaxaCrescimentoA;
            populacaoB = paisB * porcentagemTaxaCrescimentoB;
            paisA = (int) populacaoA;
            paisB = (int) populacaoB;
            anos++;
        }
        System.out.println("Levou " + anos + " anos para que o pais A ultrapasse o pais B");
        System.out.println("Pais A: " + paisA + " Habitantes, Pais B: " + paisB + " Habitantes");
    }
}
