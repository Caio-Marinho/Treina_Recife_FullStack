package Logica;
import java.util.Scanner;


public class Questao22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area;
        System.out.println("Informe a aréa do local a ser pintado em metros quadrados: ");
        area = scanner.nextDouble();
        double areaComFolga = area * 1.1;
        double litrosNecessarios = areaComFolga / 6;

        int capacidadeLata = 18;
        double precolata = 80.0;
        double capacidadeGalao = 3.6;
        double precoGalao = 25.0;
        
        int latasNecessarias = (int) Math.ceil(litrosNecessarios / capacidadeLata);
        double custoLatas = litrosNecessarios * precolata;

        int galoesNecessarios = (int) Math.ceil(litrosNecessarios / capacidadeGalao);
        double custoGaloes = galoesNecessarios * precoGalao;

        double restolitros = litrosNecessarios % capacidadeLata; 
        int latasParaMistura = (int) (litrosNecessarios / capacidadeLata);
        int galoesParaMistura = (int) Math.ceil(restolitros/capacidadeGalao);
        double custoMistura = (latasParaMistura * precolata) + (galoesParaMistura * precoGalao);
        
        System.out.printf("Apenas Latas de 18 Litros: \n- Quatidade %d\n- Custo R$ %.2f%n",latasNecessarias, custoLatas);
        System.out.printf("Apenas Galoes de 3.6 Litros: \n- Quatidade %d\n- Custo R$ %.2f%n",galoesNecessarios, custoGaloes);
        System.out.printf("Latas de 18 Litros e Galoes de 3.6 Litros: \n- Latas %d\n- Galoes %d\n- Custo R$ %.2f%n",latasParaMistura,galoesParaMistura ,custoMistura);

        scanner.close();
    }
}
