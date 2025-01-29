/*Crie uma classe que modele um quadrado:

Atributos: Tamanho do lado
Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área; */
import java.util.Scanner;
public class POO08CL02 {
    private double lado;

    public void setLado(double novoLado) {
        if (novoLado > 2) {
            this.lado = novoLado;
        } else{
            System.out.println("O lado deve ser maior que 2");
        }
    }

    public POO08CL02(double inicialLado) {
        setLado(inicialLado);
    }

    public void mudarLado(double ladoNovo) {
        setLado(ladoNovo);
    }

    public double retornarLado() {
        return this.lado;
    }

    public double calcularArea() {
        return this.lado * this.lado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        POO08CL02 quadrado = new POO08CL02(sc.nextDouble());
        System.out.printf("O lado do quadrado é: %.2f\n", quadrado.retornarLado());
        System.out.printf("A área do quadrado é: %.2f\n", quadrado.calcularArea());

        System.out.println("Digite o novo lado do quadrado: ");
        quadrado.mudarLado(sc.nextDouble());
        System.out.printf("O novo lado do quadrado é: %.2f\n", quadrado.retornarLado());
        System.out.printf("A nova área do quadrado é: %.2f\n", quadrado.calcularArea());

        sc.close();
    }
}
