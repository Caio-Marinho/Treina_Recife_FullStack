package Logica;
import java.util.Scanner;

public class Questao044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char turno;
        System.out.println("Informe o turno que você estuda: \nMatutino - M\nVespertino - V\nNoturno - N");
        turno = sc.next().toLowerCase().charAt(0);
        if (turno == 'm'){
            System.out.println("Bom dia!");
        } else if (turno == 'v'){
            System.out.println("Boa tarde!");
        } else if (turno == 'n'){
            System.out.println("Boa noite!");
        } else{
            System.out.println("Turno inválido!");
        }
        sc.close();
    }
}
