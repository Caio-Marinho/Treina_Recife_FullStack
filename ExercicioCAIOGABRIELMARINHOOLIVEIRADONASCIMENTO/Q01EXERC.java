/* 01- O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo.*/

package ExercicioCAIOGABRIELMARINHOOLIVEIRADONASCIMENTO;
import java.util.Scanner;

public class Q01EXERC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double custoFabrica,imposto,distribuidor,custoConsumidor,totalImposto,lucroDistiribuidor;
        System.out.println("Informe o custo de fabrica: ");
        custoFabrica = sc.nextDouble();
        imposto = 0.45;
        distribuidor = 0.28;
        totalImposto = custoFabrica * imposto;
        lucroDistiribuidor = (custoFabrica + totalImposto) * distribuidor;
        custoConsumidor = custoFabrica + totalImposto + lucroDistiribuidor;
    
        System.out.println("O custo do carro para o consumidor sera de R$ " + custoConsumidor);
        sc.close();
    }
}
