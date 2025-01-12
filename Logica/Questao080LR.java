package Logica;
import java.util.Scanner;

public class Questao080LR {
  public static void main(String[] args) {
    double num,soma = 0,subtracao = 0,multiplicacao = 0,divisao = 0;
    int operacao;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número:");
    num = sc.nextInt();
    System.out.println("Digite a operação (1 para soma, 2 para subtração, 3 para multiplicação e 4 para divisão):");
    operacao = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      if (operacao == 1) {
        soma = num + i;
        System.out.println(num + " + " + i + " = " + soma);
      } else if (operacao == 2) {
        subtracao = num - i;
        System.out.println(num + " - " + i + " = " + subtracao);
      } else if (operacao == 3) {
        multiplicacao = num * i;
        System.out.println(num + " x " + i + " = " + multiplicacao);
      } else if (operacao == 4) {
        divisao = num / i;
        System.out.println(num + " / " + i + " = " + divisao);
      }
    }
    sc.close();

  }
}
