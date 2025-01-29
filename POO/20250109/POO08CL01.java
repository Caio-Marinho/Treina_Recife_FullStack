/*Crie uma classe que modele uma bola:

Atributos: Cor, circunferência, material
Métodos: trocaCor, mostraCor */
import java.util.Scanner;
public class POO08CL01 {
    private String cor,material;
    private double circunferencia;

    public POO08CL01(String inicalCor) {
        this.cor = inicalCor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cor da bola: ");
        POO08CL01 bola = new POO08CL01(sc.nextLine());
        System.out.printf("A cor da bola é: %s\n", bola.mostraCor());
        System.out.println("Digite a nova cor da bola: ");
        bola.trocaCor(sc.nextLine());
        System.out.printf("A nova cor da bola é: %s\n", bola.mostraCor());
        sc.close();
    }

    // Método para trocar a cor da bola
    public void trocaCor(String novaCor) {
        this.cor = novaCor;
    }

    // Método para mostrar a cor da bola
    public String mostraCor() {
        return this.cor;
    }
}