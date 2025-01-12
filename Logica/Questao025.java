package Logica;
import java.util.Scanner;

public class Questao025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,dobro_primeiro_metade_segundo;
        double num_real,triplo_primeiro_com_terceiro,terceiro_cubo;
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Digite um numero real: ");
        num_real = sc.nextDouble();
        dobro_primeiro_metade_segundo = num1*2 + num2/2;
        triplo_primeiro_com_terceiro = num1*3 + num_real;
        terceiro_cubo = num_real*num_real*num_real;
        System.out.println("O dobro do primeiro número "+num1+" mais a metade do segundo "+num2+" é: "+dobro_primeiro_metade_segundo);
        System.out.println("O triplo do primeiro número "+num1+" mais o terceiro "+num_real+" é "+triplo_primeiro_com_terceiro);
        System.out.println("O cubo do terceiro "+num_real+ " é "+terceiro_cubo);
        sc.close();
    }
}
