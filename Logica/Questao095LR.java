package Logica;
import java.util.Scanner;

public class Questao095LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota,soma=0,media,qtdNotas;
        System.out.println("Quantidade de notas: ");
        qtdNotas = sc.nextDouble();
        for (int i = 1; i <= qtdNotas; i++) {
            System.out.printf("Digite a %dº o nota: ",i);
            nota = sc.nextDouble();
            soma+=nota;
        }
        media = soma/qtdNotas;
        System.out.println("Media: "+media);
        sc.close();
    }
        
}
