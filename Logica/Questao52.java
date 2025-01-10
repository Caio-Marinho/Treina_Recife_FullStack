package Logica;
import java.util.Scanner;
public class Questao52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia,mes,ano;
        System.out.println("Digite o dia: ");
        dia = sc.nextInt();
        System.out.println("Digite o mês: ");
        mes = sc.nextInt();
        System.out.println("Digite o ano: ");
        ano = sc.nextInt();
        System.out.println("Data: "+dia+"/"+mes+"/"+ano);
        sc.close();
        if (mes == 2 && dia == 29 && (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println("Data válida!");
        } else if (mes == 2 && dia == 28 && !(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println("Data válida!");
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia <= 31) {
            System.out.println("Data válida!");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia <= 30) {
            System.out.println("Data válida!");
        } else {
            System.out.println("Data inválida!");
        }
    }
}