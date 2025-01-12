package Logica;

public class Questao072LR {
    public static void main(String[] args) {
        int paisA,paisB,anos=0;
        double taxaCrescimentoA, taxaCrescimentoB,populacaoA, populacaoB;
        paisA = 80000;
        paisB = 200000;
        taxaCrescimentoA = 1.03;
        taxaCrescimentoB = 1.015;
        while (paisA <= paisB){ 
            populacaoA = paisA * taxaCrescimentoA;
            populacaoB = paisB * taxaCrescimentoB;
            paisA = (int) populacaoA;
            paisB = (int) populacaoB;
            anos++;
        }
        System.out.println("Levou " + anos + " anos para que o país A ultrapasse o país B");
        System.out.println("Pais A: " + paisA + " Habitantes, Pais B: " + paisB + " Habitantes");
    }
}
