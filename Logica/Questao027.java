package Logica;
import java.util.Scanner;

public class Questao027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dolar,real;
        int qtd_dolar;
        System.out.println("Informe a cotação do dolar: ");
        dolar = sc.nextDouble();
        System.out.println("Quatos dolar vai quer converte: ");
        qtd_dolar = sc.nextInt();
        real = qtd_dolar * dolar;
        System.out.println("O valor em real é: "+real);
        sc.close();
    }

}
