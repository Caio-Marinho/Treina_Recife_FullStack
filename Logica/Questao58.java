package Logica;
import java.util.Scanner;

public class Questao58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ponto = 0;
        String resposta;
        System.out.println("Telefonou para a vítima?");
        resposta = sc.next();
        if (resposta.equals("sim")) {
            ponto++;
        }
        System.out.println("Esteve no local do crime?");
        resposta = sc.next();
        if (resposta.equals("sim")) {
            ponto++;
        }
        System.out.println("Mora perto da vítima?");
        resposta = sc.next();
        if (resposta.equals("sim")) {
            ponto++;
        }
        System.out.println("Devia para a vítima?");
        resposta = sc.next();
        if (resposta.equals("sim")) {
            ponto++;
        }
        System.out.println("Ja trabalhou com a vítima?");
        resposta = sc.next();
        if (resposta.equals("sim")) {
            ponto++;
        }
        sc.close();
        if (ponto == 5) {
            System.out.println("Assassino");
        } else if (ponto == 3 || ponto == 4) {
            System.out.println("Culpado");
        } else if(ponto == 2) {
            System.out.println("Suspeito");
        } else {
            System.out.println("Inocente");
        }
    }
}
