package Logica;

import java.util.Scanner;

public class Questao097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdEleitores,candidato1=0,candidato2=0,candidato3=0;
        System.out.println("Quantidade de eleitores:");
        qtdEleitores = scanner.nextInt();
        for (int i = 1; i <= qtdEleitores;) {
            System.out.println("Informe o numero do candidato(1,2,3) ou 0 para voto nulo ou branco: ");
            System.out.printf("Digite o numero do Candidato: ");
            int eleitor = scanner.nextInt();
            if (eleitor == 1) {
                System.out.println("Voto para o candidato 1");
                candidato1++;
                i++;
            } else if (eleitor == 2) {
                System.out.println("Voto para o candidato 2");
                candidato2++;
                i++;
            } else if (eleitor == 3) {
                System.out.println("Voto para o candidato 3");
                candidato3++;
                i++;
            } else  if (eleitor == 0) {
                System.out.println("Voto nulo ou branco");
            } else {
                System.out.println("Candidato inválido");
            }
        }
        scanner.close();
        System.out.println("O candidato 1 recebeu " + candidato1 + " votos, o candidato 2 recebeu " + candidato2 + " votos e o candidato 3 recebeu " + candidato3 + " votos.");
    }
}
