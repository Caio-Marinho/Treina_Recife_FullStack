package Logica;
import java.util.Scanner;
public class Questao037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sexo;

        System.out.println("Digite o seu sexo: \nMasculino - M  \nFeminino - F ");
        sexo = sc.next().toUpperCase().charAt(0);
        if (sexo == 'M') {
            System.out.println("Masculino");
        } else if (sexo == 'F') {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo invalido! Use 'M' para masculino ou 'F' para feminino.");
        }
        sc.close();
    }
}
