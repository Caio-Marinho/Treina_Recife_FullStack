/*04 - Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são: "Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente". */

package ExercicioCAIOGABRIELMARINHOOLIVEIRADONASCIMENTO;
import java.util.Scanner;

public class Q04EXERC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ponto = 0;
        String resposta;
        System.out.println("Perguntas sobre um crime");
        System.out.println("Telefonou para a vitima?");
        resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            ponto++;
        }
        System.out.println("Esteve no local do crime?");
        resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            ponto++;
        }
        System.out.println("Mora perto da vitima?");
        resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            ponto++;
        }
        System.out.println("Devia para a vitima?");
        resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            ponto++;
        }
        System.out.println("Já trabalhou com a vitima?");
        resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim")) { 
            ponto++;
        }
        sc.close();
        if (ponto == 2) {
            System.out.println("Suspeita");
        } else if (ponto == 3 || ponto == 4) {
            System.out.println("Cúmplice");
        } else if (ponto == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}