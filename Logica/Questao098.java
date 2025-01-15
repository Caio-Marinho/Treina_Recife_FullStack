package Logica;

import java.util.Scanner;

public class Questao098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdTurmas,qtdAlunos,media;
        System.out.println("Quantidade de turmas: ");
        qtdTurmas = scanner.nextInt();
        do {
            System.out.println("Informe a quantidade de alunos sendo 0 a 40: ");
            qtdAlunos = scanner.nextInt();
            if (qtdAlunos > 40) {
                System.out.println("Quantidade maior que 40.");
            }
        } while (qtdAlunos > 40);
        media = qtdAlunos / qtdTurmas;
        System.out.println("Media de alunos por turma: " + media);
        scanner.close();
    }
}
