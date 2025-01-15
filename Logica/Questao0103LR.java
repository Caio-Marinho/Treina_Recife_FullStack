package Logica;
import java.util.Scanner;

public class Questao0103LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maior=0,menor,media,temperatura,somaTemperatura=0;
        char opcao;
        int cont = 1;
        System.out.println("Digite a temperatura:");
        temperatura = sc.nextDouble();
        menor = temperatura;
        do {
            System.out.println("Digite a temperatura:");
            temperatura = sc.nextDouble();
            somaTemperatura+=temperatura;
            System.out.println("Deseja continuar a inserir temperatura? (s/n)");
            opcao = sc.next().toLowerCase().charAt(0);
            if (opcao != 's' && opcao != 'n') {
                System.out.println("Opção inválida. Por favor, digite s para sim ou n para nao.");
                opcao = sc.next().toLowerCase().charAt(0);
            }
            if (maior < temperatura) {
                maior = temperatura;
            } else if (menor > temperatura) {
                menor = temperatura;
            }
            cont++;
        } while (opcao == 's');
        sc.close();
        media = somaTemperatura / cont;
        System.out.println("A temperatura média é: " + media);
        System.out.println("A maior temperatura foi: " + maior);
        System.out.println("A menor temperatura foi: " + menor);
    }
}
