package Logica;
import java.util.Scanner;

public class Questao048ED {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1,nota2,media;
        char conceito;
        String situacao;
        System.out.println("Digite a nota 1: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2) / 2;
        sc.close();
        if (media > 9 && media <=10){
            conceito = 'A';
            situacao = "Aprovado";
        } else if (media  > 7.5 && media <=9 ){
            conceito = 'B';
            situacao = "Aprovado";
        } else if (media > 6 && media <=7.5){
            conceito = 'C';
            situacao = "Aprovado";
        } else if (media > 4 && media <=6){
            conceito = 'D';
            situacao = "Reprovado";
        } else{
            conceito = 'E';
            situacao = "Reprovado";
        }
        System.out.printf("O aluno ficou com %.2f de médio e conceito '%c' a sua situação é %s",media,conceito,situacao);
    }
}