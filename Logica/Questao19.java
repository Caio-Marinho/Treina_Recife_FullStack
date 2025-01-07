package Logica;
import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso,excesso,multa;
        String excesso_resposta="",multa_resposta="";
        System.out.println("Digite o peso do peixe em kg:");
        peso = scanner.nextDouble();
        System.out.println("O peixe tem um peso de "+peso+" kg");
        if (peso > 50){
            excesso = peso - 50;
            excesso_resposta = "O peixe teve um execesso de "+excesso+" kg";
            multa = excesso * 4;
            multa_resposta = "A multa a ser pagada é de "+multa+" reais";
        }
        System.out.println(excesso_resposta);
        System.out.println(multa_resposta);
        scanner.close();
    }
}
