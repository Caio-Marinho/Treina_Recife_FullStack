package Logica;
import java.util.Scanner;

public class Questao047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaSemana;
        System.out.println("Digite o dia da semana (1 - Domingo, 2 - Segunda, 3 - Terça, 4- Quarta, 5- Quinta, 6- sexta, 7- sabado");
        diaSemana = sc.nextInt();
        sc.close();
        if (diaSemana == 1){
            System.out.println("Domingo");
        } else if(diaSemana==2){
            System.out.println("Segunda");
        } else  if (diaSemana==3){
            System.out.println("Terça");
        } else if (diaSemana==4){
            System.out.println("Quarta");
        } else if (diaSemana ==5){
            System.out.println("Quinta");
        } else if(diaSemana ==6){
            System.out.println("Sexta");
        } else if ( diaSemana == 7){
            System.out.println("Sábado");
        } else{
            System.out.println("Dia invalido");
        }
    }
}
