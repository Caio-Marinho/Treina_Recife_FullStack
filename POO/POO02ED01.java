package POO;
import java.util.Scanner;

public class POO02ED01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1,numero2;
        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println("O primeiro número é maior que o segundo");
        } else if (numero1 < numero2) {
            System.out.println("O segundo número é maior que o primeiro");
        } else {
            System.out.println("Os dois números são iguais");
        }
        scanner.close();
        
    }
}
